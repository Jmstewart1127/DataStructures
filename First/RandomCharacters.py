import random


def get_random_char(ch1, ch2):
    random_char = random.randint(ord(ch1), ord(ch2))
    return chr(random_char)


print(get_random_char('a', 'z'))

