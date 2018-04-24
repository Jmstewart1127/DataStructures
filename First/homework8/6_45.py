import turtle


def draw_polygon(x, y, radius, sides):
    turtle.setposition(x, y)
    for i in range(sides):
        turtle.fd(radius)
        turtle.lt(360 / sides)
    turtle.done()


draw_polygon(0, 0, 100, 5)
