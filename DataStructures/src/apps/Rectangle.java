package apps;

public class Rectangle {
    private double width;
    private double height;
    public Rectangle(double w, double h) {
        width = w;
        height = h;
    }
    public double getArea() { return width * height; }
    public boolean equals(Object obj) {
        if (obj == this)
            return true;
        if (obj == null || obj.getClass() != this.getClass())
            return false;
        Rectangle r2 = (Rectangle) obj;
        return (this.width == r2.width && height == r2.height)
            || (width == r2.height && height == r2.width);
    }
    public String toString() { return "Rectange("+width+","+height+")"; }

}
