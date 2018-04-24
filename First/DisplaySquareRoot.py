import math
# print(len(name.strip()))
# print(name.strip().upper())
# format(var, "^60f")
# format(var, '10.2e')

maxN = eval(input("Enter max positive integer number "))
print(format("number", '>10') + format("sqrt(number)", '>15'))
print('-' * 25)
for i in range(maxN+1):
    print(format(i, '10') + format(math.sqrt(i), '15.2f'))



