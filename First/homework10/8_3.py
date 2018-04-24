def check_for_more_than_two_numbers(password):
    number_of_numbers = 0
    for i in password:
        if i.isdigit():
            number_of_numbers += 1
    if number_of_numbers >= 2:
        return True
    else:
        return False


def check_for_special_characters(password):
    is_valid = True
    if len(password) >= 8 and check_for_more_than_two_numbers(password):
        for i in password:
            if i.isdigit() == False and i.isalpha() == False:
                is_valid = False
                break
    else:
        is_valid = False
    return is_valid


def check_password(password):
    greater_than_two = check_for_more_than_two_numbers(password)
    no_special_chars = check_for_special_characters(password)
    if greater_than_two and no_special_chars:
        print("Password is valid")
    else:
        print("Password is invalid")


password = input("Enter a password, must contain at least 8 characters and 2 numbers. NO SPECIAL CHARACTERS \n")
check_password(password)
