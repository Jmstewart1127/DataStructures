import math
import random


def addTwo(n1, n2):
    return n1 + n2


def square(n):
    return n * n


# Don't use abs(). Use if statement
def absolute(n):
    if n > 0:
        return n
    return -n


def diff(n1, n2):
    return absolute(n1 - n2)


def quotient(n1, n2):
    return n1 // n2


def remainder(n1, n2):
    return n1 % n2


def areaCircle(radius):
    return 3.14159 * radius * radius


def feetInch2cm(feet, inch):
    # 1 foot = 12 inches
    # 1 inch = 2.54cm
    inches = 12 * feet + inch
    cm = 2.54 * inches
    return cm


def calTips(subtotal, rate):
    # return tips. rate is assumed to be percentage.
    tip = subtotal * (rate / 100)
    total = tip + subtotal
    return tip, total


print(addTwo(1, 2))
print(addTwo(-10, 2))
print(square(2))
print(square(3))
print(absolute(-2.1))
print(diff(-2, 1))
print(quotient(17, 5))
print(remainder(17, 5))
print(areaCircle(2))
print(feetInch2cm(8, 1))
print(calTips(200, 15))

# ------------------------------------------------
# Implement the following functions.
# Read the description in each function.
# ------------------------------------------------

def areaSquare(side):
    return side**2

def areaEqTriangle(side):
    return (math.sqrt(3) / 4) * side**2

def mile2km(mile):
    return mile * 1.61

def lb2kg(lb):
    return lb * 0.45

def year2minute(year):
    return year * 365 * 24 * 60

def cm2feetInch(cm):
    # convert cm to feet plus inch
    # For example, 180cm is 5 feet 11 inch
    # Use round() to avoid float numbers
    height = cm / 2.54
    number_of_feet = float(height // 12)
    number_of_inches = round(height % 12)
    print(number_of_feet, "feet,", number_of_inches, "inches")

def larger(a,b):
    if a > b:
        return a
    elif a == b:
        return 0
    else:
        return b

def largestAmongThree(a,b,c):
    x = larger(a, b)
    return larger(x, c)

def distance(x1,y1,x2,y2):
    a = abs(x2 - x1)
    b = abs(y2 - y1)
    return math.sqrt(((a * a) + (b * b)))

def optimalCoinChange(price,payment):
    change = payment - price
    quarters = change // 0.25
    change = change - quarters * 0.25
    dimes = change // 0.10
    change = change - dimes * 0.10
    nickels = change // 0.05
    change = change - nickels * 0.05
    pennies = change // 0.01
    print(quarters, dimes, nickels, pennies)

def coinFlip():
    random_coin = random.randint(0, 1)
    if random_coin == 0:
        print("Head")
    else:
        print("Tail")

def randomDirection():
    random_direction = random.randint(0, 3)
    if random_direction == 0:
        print("North")
    elif random_direction == 1:
        print("East")
    elif random_direction == 2:
        print("South")
    elif random_direction == 3:
        print("West")

def isEven(n):
    if n % 2 == 0:
        return True
    else:
        return False

def isDivisibleByFive(n):
    if n % 5 == 0:
        return True
    else:
        return False

def isPrime(n):
    for i in range(2, n):
        if n % i == 0:
            return False
    return True


def printPrimeNumbers(maxN):
    for i in range(maxN):
        if isPrime(i):
            print(i)


print('*******HOMEWORK*******')
print(areaSquare(5))
print(areaEqTriangle(3))
print(mile2km(2))
print(lb2kg(2))
print(year2minute(1))
cm2feetInch(180)
print(larger(2, 5))
print(largestAmongThree(1, 2, 3))
print(distance(1, 2, 3, 4))
optimalCoinChange(3.51, 5.00)
coinFlip()
randomDirection()
print(isEven(4))
print(isDivisibleByFive(55))
print(isPrime(11))
printPrimeNumbers(100)

