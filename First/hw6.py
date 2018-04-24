import turtle1
angle = 90
d = 5
turtle1.speed(1000)
for i in range(300):
    turtle1.forward(d)
    turtle1.right(angle)
    turtle1.circle(30)
    d += 2

turtle1.done()