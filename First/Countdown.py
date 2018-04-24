import time

# for i in range(9, 0, -1):
#     time.sleep(1)
#     print(i)
# print("Boom")

factor = 1
for step in range(3):
    for i in range(9, 0, -1):
        print(factor * i)
        time.sleep(0.5)
    factor *= 0.1
print("Boom")
