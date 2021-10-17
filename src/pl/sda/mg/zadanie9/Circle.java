package pl.sda.mg.zadanie9;

import java.util.List;

public class Circle implements Movable, Resizable {
    private Point2D center;
    private Point2D point;

    public Circle(Point2D center, Point2D point) {
        this.center = center;
        this.point = point;
    }

    public double getRadius() {
        return Math.sqrt(
          Math.pow(point.getX() - center.getX(), 2) +
          Math.pow(point.getY() - center.getY(), 2)
        );
    }

    public double getPerimeter() {
        return 2 * Math.PI * getRadius();
    }

    public double getArea() {
        return Math.PI * Math.pow(getRadius(), 2);
    }

    public List<Point2D> getSlicePoints (Point2D circlePoint) {
        // 1. musimy przenieść nasz okrąg do początku układu współrzędnych tak aby
        // środek okręgu był w pukcie 0,0. Innymi słowy przesuwamy (odejmujemy) nasz punkt
        // circlePoint o wartości wskazywane przez punkt center.

        //2. stosujemy prosty wzór na wyznaczenie punktu przesuniętego o 90 stopni

        //3. Przesunięcie wyliczonych punktów do początkowej pozycji koła
        // czyli musicie do nich dodać wartości reprezentowane przez punkt center

        return null;
    }

    @Override
    public void move(MoveDirection moveDirection) {
        center.move(moveDirection);
        point.move(moveDirection);


        // sposób na okrętkę z dublowaniem kodu
//        double newX = center.getX() + moveDirection.getX();
//        double newY = center.getY() + moveDirection.getY();
//        center = new Point2D(newX, newY);
//
//        newX = point.getX() + moveDirection.getX();
//        newY = point.getY() + moveDirection.getY();
//        point = new Point2D(newX, newY);

    }

    @Override
    public String toString() {
        return "center: " + center + "\n point: " + point + "\n";
    }

    @Override
    public void resize(double resizeFactor) {
        double newx = point.getX() * resizeFactor;
        double newY = point.getY() * resizeFactor;
        point = new Point2D(newx, newY);
    }
}
