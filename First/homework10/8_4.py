def count(char, word):
    num_of_occurances = 0
    for i in word:
        if i == char:
            num_of_occurances += 1
    return num_of_occurances


s = input("Enter a character ")
string = input("Enter a word ")
print(count(s, string))
