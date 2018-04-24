array_of_input = []


def add_to_array(num):
    if num != 0:
        array_of_input.append(num)


def get_input():
    number = eval(input("Enter any integer, 0 will end program "))
    add_to_array(number)
    return number


def calculate_number_of_positives():
    sum = 0
    for i in array_of_input:
        if i > 0 and i != 0:
            sum += 1
    print("Number of positive numbers: {}".format(sum))


def calculate_number_of_negatives():
    sum = 0
    for i in array_of_input:
        if i < 0 and i != 0:
            sum += 1
    print("Number of negative numbers: {}".format(sum))


def calculate_total():
    sum = 0
    for i in array_of_input:
        sum += i
    print("Sum of all numbers: {}".format(sum))


def calculate_average():
    sum = 0
    for i in array_of_input:
        sum += i
    print("Average of all numbers: {}".format(sum / len(array_of_input)))


def collect_input():
    while get_input() != 0:
        print(end="")


collect_input()
calculate_number_of_positives()
calculate_number_of_negatives()
calculate_total()
calculate_average()
