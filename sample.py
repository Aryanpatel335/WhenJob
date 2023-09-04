import sys


def main():
    input_file = sys.argv[2]
    with open(input_file) as f:
        lines = [line.strip('\n') for line in f]

        for i in lines:
            print(i)

if __name__ == "__main__":
    main()
