import re

n = int(input())
for _ in range(n):
    pattern = input()
    print("Raw Input:", repr(pattern))  # To see what was entered
    try:
        re.compile(pattern)
        print(True)
    except re.error as e:
        print(False)
