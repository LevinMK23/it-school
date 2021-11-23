package module2.lesson1;

public class Vector {

    private final Point begin;
    private final Point end;
    private double dx;
    private double dy;

    public Vector(Point end) {
        this.end = end;
        begin = new Point(0, 0);
        calculateDifference();
    }

    public Vector(Point begin, Point end) {
        this.begin = begin;
        this.end = end;
        calculateDifference();
    }

    private void calculateDifference() {
        dx = end.getX() - begin.getX();
        dy = end.getY() - begin.getY();
    }

    public double getLength() {
        return Math.sqrt(dx * dx + dy * dy);
    }

    public Vector sum(Vector vector) {
        double x = end.getX() + vector.dx;
        double y = end.getY() + vector.dy;
        return new Vector(begin, new Point(x, y));
    }


    public Point getBegin() {
        return begin;
    }

    public Point getEnd() {
        return end;
    }
}
