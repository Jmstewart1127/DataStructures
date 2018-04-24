stars = '*' * 60
name = input("Enter your name: ")
birth_year = eval(input("When were you born? (YYYY): "))
age = (2018 - birth_year)
happy_birthday_message = "Happy " + str(age) + "th " "Birthday to " + name.strip().upper()
number_of_spaces = int(60 - (len(happy_birthday_message))) / 2
print_spaces = ' ' * int(number_of_spaces)
print(stars)
print(print_spaces, happy_birthday_message, print_spaces)
print(stars)

