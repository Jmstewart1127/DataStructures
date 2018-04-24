x1 = eval(input("Enter x1 value for point 1 "))
y1 = eval(input("Enter y1 value for point 1 "))
x2 = eval(input("Enter x2 value for point 2 "))
y2 = eval(input("Enter y2 value for point 2 "))

distance = abs(x1 - x2) + abs(y1 - y2)

print("Point 1 = ({}, {}), Point 2 = ({}, {})".format(x1, y1, x2, y2))

print("Manhattan Distance = abs({} - {}) + abs({} - {}) = {}".format(x1, x2, y1, y2, distance))

