from homework9.Fan import Fan

fan1 = Fan()
fan1.set_speed(fan1.FAST)
fan1.set_radius(10)
fan1.set_color("yellow")
fan1.set_on(True)

fan2 = Fan()
fan2.set_speed(fan2.MEDIUM)
fan2.set_radius(5)
fan2.set_color("blue")
fan2.set_on(False)

print("\nFAN 1")
print(fan1.get_speed())
print(fan1.get_radius())
print(fan1.get_color())
print(fan1.get_on())
print("\nFAN 2")
print(fan2.get_speed())
print(fan2.get_radius())
print(fan2.get_color())
print(fan2.get_on())
