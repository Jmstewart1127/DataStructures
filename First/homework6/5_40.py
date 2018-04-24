import random

head_count = 0
tail_count = 0

for i in range(0, 1000000):
    if random.randint(0, 1) == 1:
        head_count += 1
    else:
        tail_count += 1

print("Heads: {} Tails: {}".format(head_count, tail_count))
