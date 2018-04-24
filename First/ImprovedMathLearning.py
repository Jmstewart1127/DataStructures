import random

is_correct = True
score = 0

while is_correct:
    num1 = random.randint(0, 9)
    num2 = random.randint(0, 9)
    if num1 > num2:
        answer = eval(input("What is {}-{} ".format(num1, num2)))
        if answer == (num1 - num2):
            score += 1
            is_correct = True
            print("{}-{} = {} is {}... Score: {}".format(num1, num2, answer, is_correct, score))
        else:
            is_correct = False
            print("{}-{} = {} is {}".format(num1, num2, answer, is_correct))
    else:
        answer = eval(input("What is {}-{} ".format(num2, num1)))
        if answer == (num2 - num1):
            score += 1
            is_correct = True
            print("{}-{} = {} is {}... Score: {}".format(num2, num1, answer, is_correct, score))
        else:
            is_correct = False
            print("{}-{} = {} is {}".format(num2, num1, answer, is_correct))

