import math
print("{0:<10} {1:<10}".format("number", "sqrt"))
for i in range(0, 21):
    print("{0:<10} {1:<10.4f}".format(i, math.sqrt(i)))
