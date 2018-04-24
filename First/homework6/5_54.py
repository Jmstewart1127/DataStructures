import turtle


def parabola_y(x, a=0.250, b=-10, c=0):
    return a * x ** 2 + b * x + c


t = turtle.Turtle()

t.penup()
t.goto(-200, 0)
t.pendown()
t.goto(200, 0)
t.penup()
t.goto(0, -200)
t.pendown()
t.goto(0, 200)
t.penup()
t.pendown()

for i in range(-10, 51):
    if i == -10:
        t.penup()
        t.goto(i, parabola_y(i))
        t.pendown()
    else:
        t.goto(i, parabola_y(i))


turtle.done()


