number = 1000
count = 0
for i in range(1, number):
    if i % 2 == 0 or i % 3 == 0 and i != 2:
        print(i, "is not prime")
    elif i == 2:
        print(i, "is prime")
        count += 1
    else:
        print(i, "is prime")
        count += 1

print("Number of primes", count)
