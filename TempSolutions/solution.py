class Solution:
    def isNumber(self, s: str) -> bool:
        seen_digit = seen_exponent = seen_dot =  False
        for i, c in enumerate(s):
            if c.isdigit():
                seen_digit = True
            elif c in ["+", "-"]:
                if i > 0 and s[i - 1] != "e" and s[i - 1] != "E":
                    return False
            elif c in ["e", "E"]:
                if seen_exponent or not seen_digit:
                    return False
                seen_exponent = True
                seen_digit = False
            elif c == ".":
                if seen_dot or seen_exponent:
                    return False
                seen_dot = True
            else:
                return False
        
        return seen_digit
    

class Solution(object):
    def equalFrequency(self, word):
        """
        :type word: str
        :rtype: bool
        """
        
        freq = {}
        for char in word:
            if char in freq:
                freq[char] += 1
            else:
                freq[char] = 1
    
        # Check if all frequencies are equal
        freq_values = list(freq.values())
        print(freq_values)
        freq_values.sort()
        if len(freq_values) == 1 and freq_values[0] > 1:
            return True
        if freq_values.count(freq_values[0]) == len(freq_values) and freq_values[0] == 1:
            return True
        if len(set(freq_values)) == 1:
            return False

        if freq_values[0] == 1 and freq_values[1] != 1 and freq_values[1] == freq_values[-1]: # example: 'adddfff'
            return True
    
        # Check if removing one letter can make all frequencies equal
        for char in freq:
            if freq[char] > 1:
                freq[char] -= 1
                freq_values = list(freq.values())
                if len(set(freq_values)) == 1:
                    return True
                freq[char] += 1
    
        return False


def fractionToDecimal(self, numerator, denominator):
        n, remainder = divmod(abs(numerator), abs(denominator))
        sign = '-' if numerator*denominator < 0 else ''
        result = [sign+str(n), '.']
        stack = []
        while remainder not in stack:
            stack.append(remainder)
            n, remainder = divmod(remainder*10, abs(denominator))
            result.append(str(n))
    
        idx = stack.index(remainder)
        result.insert(idx+2, '(')
        result.append(')')
        return ''.join(result).replace('(0)', '').rstrip('.')