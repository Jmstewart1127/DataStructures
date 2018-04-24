# x1, y1 = eval(input("Enter x1, y1"))
# x2, y2 = eval(input("Enter x2, y2"))
#
# a = abs(x2 - x1)
# b = abs(y2 - y1)
#
# calculate_distance = ((a * a) + (b * b))**0.5
#
# print(calculate_distance)


def calculate_distance():
    x1, y1 = eval(input("Enter x1, y1"))
    x2, y2 = eval(input("Enter x2, y2"))
    a = abs(x2 - x1)
    b = abs(y2 - y1)
    return ((a * a) + (b * b))**0.5


distance_calculator(calculate_distance())
