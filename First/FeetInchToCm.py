#int(4.5) == 4
#float(4) == 4.0
#str(4) == "4"


# feet, inches = eval(input("enter height in feet, inches (ex: 5, 2)"))


cm_to_feet_and_inches(centimeters)




centimeters = eval(input("Enter height in centimeters\n"))


def feet_and_inches_to_cm(ft, inch):
    ft_to_cm = ft * 30
    in_to_cm = inch * 2.54
    total = in_to_cm + ft_to_cm
    return total


def cm_to_feet_and_inches(cm):
    height = cm / 2.54
    number_of_feet = float(height // 12)
    number_of_inches = round(height % 12)
    print(number_of_feet, "feet,", number_of_inches, "inches")


# print(feet_and_inches_to_cm(feet, inches)

