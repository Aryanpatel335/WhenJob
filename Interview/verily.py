
# IP route lookup is the problem of finding the longest matching prefix of a string given a bunch of prefixes. For example, given:
# F1 *
# F2 192.168.*
# F3 192.168.2.*
# F4 192.168.2.1
# F4 192.168.2.2
# F4 1.*
# 0.0.0.0 matches F1, 192.168.7.1 matches F2, 192.168.2.10 matches F3, 192.168.2.1 matches F4, etc.

def find_longest_match_corrected(ip_address, prefixes):
    # Sort the prefixes by their specificity (length) and then by the presence of wildcards
    sorted_prefixes = sorted(prefixes, key=lambda x: len(x), reverse=True)
    
    longest_match = None
    max_match_length = -1  # Initialize with -1 to ensure '*' is considered when no other matches are found
    
    for prefix in sorted_prefixes:
        # Break the prefix and IP into parts
        prefix_parts = prefix.split('.')
        ip_parts = ip_address.split('.')
        
        match = True
        current_match_length = 0
        for i, part in enumerate(prefix_parts):
            if part == '*' or (i < len(ip_parts) and part == ip_parts[i]):
                # Count non-wildcard matches for determining the longest match
                current_match_length += 1 if part != '*' else 0
            else:
                match = False
                break
        
        # Update longest match if this is the longest so far
        if match and current_match_length > max_match_length:
            longest_match = prefix
            max_match_length = current_match_length
    
    return longest_match if longest_match else "*"
prefixes = [
    "*",
    "192.168.*",
    "192.168.2.*",
    "192.168.2.1",
    "192.168.2.2",
    "1.*"
]

test_ips = ["0.0.0.0", "192.168.7.1", "192.168.2.10", "192.168.2.1", "1.5.6.7.8", "192.168.2.1", "192.0.0.0"]
# Find and print the longest match for each test IP with the corrected logic
results_corrected = {ip: find_longest_match_corrected(ip, prefixes) for ip in test_ips}

print(results_corrected)



