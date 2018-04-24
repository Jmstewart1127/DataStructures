def main(s1, s2):
    prefix = ''
    for i in range(len(s1)):
        if s1[i] == s2[i]:
            prefix += s1[i]
        else:
            break
    return prefix


word1 = input("Enter a word ")
word2 = input("Enter another word ")
print(main(word1, word2))
