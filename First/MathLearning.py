import random
num1 = random.randint(0, 9)
num2 = random.randint(0, 9)

answer = eval(input("What is {}+{} ".format(num1, num2)))

if answer == (num1 + num2):
    print("{} + {} = {} is {}".format(num1, num2, answer, True))
else:
    print("{} + {} = {} is {}". format(num1, num2, answer, False))
