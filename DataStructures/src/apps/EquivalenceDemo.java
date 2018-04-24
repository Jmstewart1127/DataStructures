package apps;

public class EquivalenceDemo {

    public static void main(String[] args) {
        Circle c = new Circle(3.5);
        Circle c1 = new Circle(3.5);
        System.out.println(c.equals(c1));
        System.out.println(c.calculateArea());
    }

}
