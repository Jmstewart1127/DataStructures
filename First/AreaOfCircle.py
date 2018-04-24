def enter_radius():
    radius = input("Enter value for radius: ")
    return eval(radius)


def calc_area(radius):
    pi = 3.14159
    area = 2 * pi * (radius * radius)
    return print("Area: " + area)


calc_area(enter_radius())

