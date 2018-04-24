from math import acos, degrees

x1, y1, x2, y2, x3, y3 = eval(input("Enter three points"))
a = (((x2 - x3)**2) + ((y2 - y3)**2))**0.5
b = (((x3 - x1)**2) + ((y3 - y1)**2))**0.5
c = (((x2 - x1)**2) + ((y2 - y1)**2))**0.5

A = acos((a * a - b * b - c * c) / (-2 * b * c))
B = acos((b * b - a * a - c * c) / (-2 * a * c))
C = acos((c * c - b * b - a * a) / (-2 * a * b))

print("The three angles are, ", degrees(A), degrees(B), degrees(C))
