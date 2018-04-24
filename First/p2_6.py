number = input("Enter a number from 1 to 1000: ")
total = 0
array_of_extracted_numbers = list(number)

for i in array_of_extracted_numbers:
    total += eval(i)


print(total)
