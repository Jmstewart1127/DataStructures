import random


def get_user_input():
    return eval(input("Enter a number"))


def random_number():
    return random.randint(0, 1)


def print_matrix(n):
    for i in range(n):
        print()
        print(random_number(), end=" ")
        for j in range(1, n):
            print(random_number(), end=" ")


print_matrix(get_user_input())

