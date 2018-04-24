def number_of_numbers():
    number = input("How many numbers are there? ")
    return eval(number)


def enter_numbers():
    total = 0
    count = 0
    for i in range(number_of_numbers()):
        i = eval(input("enter a number"))
        total += i

    return print(total / number_of_numbers())


def average_calculator():
    enter_numbers()


print(average_calculator())

