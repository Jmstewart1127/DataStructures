import math
feet, inches = 6, 2
cm = ((feet * 12) + inches) * 2.54
print(feet, 'feet', inches, 'inches', 'is', format(cm, '.1f'), 'centimeters')

subtotal, tip_rate = 45.33, 15
tip = subtotal * tip_rate * 0.01
total = subtotal + tip
print('The total with ${} subtotal and {}% tip is ${:.2f}\n'.format(subtotal, tip_rate, total))

for i in range(5):
    print('sqrt({}) = {:.3f}'.format(str(i), math.sqrt(i)))


print()
stars = '*' * 40

print('{:^40}'.format('ASCII Code Table'))
print(stars)
print('{:<10} {:>9} {:>9} {:>9}'.format('Character', 'Decimal', 'Hexa', 'Binary'))
print(stars)
for c in 'CDEFGHIJK':
    print('{0:9c} {0:10d} {0:9x} {0:9b}'.format(ord(c)))

