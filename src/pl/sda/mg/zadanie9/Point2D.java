package pl.sda.mg.zadanie9;

public class Point2D implements Movable {
    private double x;
    private double y;

    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getY() {
        return y;
    }

    public double getX() {
        return x;
    }

    @Override
    public void move(MoveDirection moveDirection) {
        this.x = x + moveDirection.getX();
        this.y = y + moveDirection.getY();
    }

    @Override
    public String toString() {
        return "[x: " + x + ", y: " + y + "]";
    }
}
