import random

is_correct = False
number = random.randint(0, 100)

while not is_correct:
    guess = eval(input("Guess a number "))
    if guess > number:
        print("Lower")
    elif guess < number:
        print("Higher")
    elif guess == number:
        print("Correct")
        is_correct = True

