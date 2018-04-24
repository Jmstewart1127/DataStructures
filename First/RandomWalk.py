import turtle1
import random

t = turtle1.Turtle()
t.speed(100)
random_range = random.randint(100, 400)
for i in range(random_range):
    r = random.randint(0, 1)
    if r == 0:
        t.forward(90)
    elif r == 1:
        t.left(90)
    t.xcor()

turtle1.done()
