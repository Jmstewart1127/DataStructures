def get_number(uppercase):
    uppercase = uppercase.upper().replace('-', '')
    numbers = ''
    for i in uppercase:
        if i == 'A' or i == 'B' or i == 'C':
            numbers += '2'
        elif i == 'D' or i == 'E' or i == 'F':
            numbers += '3'
        elif i == 'G' or i == 'H' or i == 'I':
            numbers += '4'
        elif i == 'J' or i == 'K' or i == 'L':
            numbers += '5'
        elif i == 'M' or i == 'N' or i == 'O':
            numbers += '6'
        elif i == 'P' or i == 'Q' or i == 'R' or i == 'S':
            numbers += '7'
        elif i == 'T' or i == 'U' or i == 'V':
            numbers += '8'
        elif i == 'W' or i == 'X' or i == 'Y' or i == 'Z':
            numbers += '9'
    return ''.join(i for i in uppercase if not i.isalpha()) + numbers


number = input("Enter a phone number ")
print(get_number(number))
