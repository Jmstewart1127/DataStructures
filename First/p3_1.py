from math import sin, sqrt, pi
radius = eval(input("Enter distance from center to vertex: "))
s = (2 * radius) * sin(pi/5)
area = ((3*(sqrt(3))) / 2) * s**2

print("The area of the pentagon is ", area)
