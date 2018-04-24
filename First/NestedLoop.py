print('{:^41}'.format("Multiplication Table"))
print('{:3s} {:3d} {:3d} {:3d} {:3d} {:3d} {:3d} {:3d} {:3d} {:3d}'.format("", 1, 2, 3, 4, 5, 6, 7, 8, 9))
print("-"*40)
for i in range(1, 10):
    print("{} | ".format(i), end="")
    for j in range(1, 10):
        print('{:3d}'.format(i*j), end=" ")
    print()
