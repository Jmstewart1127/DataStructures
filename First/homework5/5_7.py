import math
print("{0:<10} {1:<10} {2:<10}".format("degree", "sin", "cos"))
for i in range(0, 370, 10):
    print("{0:<10} {1:<10.4f} {2:<10.4f}".format(i, math.sin(math.radians(i)), math.cos(math.radians(i))))
