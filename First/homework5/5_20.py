forward = range(1, 7)
reverse = range(6, 0, -1)

for i in forward:
    print()
    for j in range(i):
        print(j+1, end=" ")

print("\n")

for i in reverse:
    print()
    for j in range(i):
        print(j+1, end=" ")

print("\n")

for i in forward:
    print()
    print("{}".format("  " * (6 - i)), end="")
    for j in range(i):
        print(j+1, end=" ")

print("\n")

for i in reverse:
    print()
    for j in range(i):
        print(j+1, end=" ")



