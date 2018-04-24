from math import tan, pi
n_sides = eval(input("Enter number of sides: "))
length_of_sides = eval(input("Enter length of side: "))
area = ((n_sides * length_of_sides ** 2) / (4 * (tan(pi/n_sides))))
print("The area of the polygon is", area)
