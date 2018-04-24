number1 = eval(input("Enter a number "))
number2 = eval(input("Enter a number "))
greatest = min(number1, number2)
gcf = []

for i in range(2, greatest+1):
    if number1 % i == 0 and number2 % i == 0:
        print(i)
        gcf.append(i)

print("Greatest Common Factor:", max(gcf))


