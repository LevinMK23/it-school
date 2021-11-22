package module2.lesson1;

public class Rectangle extends Shape {

    private Point begin, end;

    public Rectangle(Point point) {
        begin = new Point(0,0);
        end = point;
    }

    public Rectangle(Point begin, Point end) {
        this.begin = begin;
        this.end = end;
    }

    public double getWidth() {
        return Math.abs(end.getX() - begin.getX());
    }

    public double getHeight() {
        return Math.abs(end.getY() - begin.getY());
    }

    public double getDiagonal() {
        double x = getWidth();
        double y = getHeight();
        return Math.sqrt(x * x + y * y);
    }

    @Override
    public double getSquare() {
        return getWidth() * getHeight();
    }

    @Override
    public double getPerimeter() {
        return 2 * (getWidth() + getHeight());
    }

}
