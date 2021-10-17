package pl.sda.mg.zadanie9;

public class MainCircle {

    public static void main(String[] args) {
        Circle circle = new Circle(new Point2D(0,0), new Point2D(3, 0));
        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Perimeter: " + circle.getPerimeter());
        System.out.println("Area: " + circle.getArea());
    }
}
