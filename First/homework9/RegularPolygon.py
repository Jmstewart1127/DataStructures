import math


class RegularPolygon:
    def __init__(self, n=3, side=1, x=0, y=0):
        self.__n = n
        self.__side = side
        self.__x = x
        self.__y = y

    def get_n(self):
        return self.__n

    def set_n(self, n):
        self.__n = n

    def get_side(self):
        return self.__side

    def set_side(self, side):
        self.__side = side

    def get_x(self):
        return self.__x

    def set_x(self, x):
        self.__x = x

    def get_y(self):
        return self.__y

    def set_y(self, y):
        self.__y = y

    def get_perimeter(self):
        return self.get_n() * self.get_side()

    def get_area(self):
        return ((self.get_n() * self.get_side()**2) / (4 * math.tan(math.pi/self.get_n())))