package apps;

public class Circle {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.pow(radius, 2) * 3.14159;
    }
}
