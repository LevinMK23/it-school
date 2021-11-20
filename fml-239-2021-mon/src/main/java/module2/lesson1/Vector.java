package module2.lesson1;

public class Vector {

    private Point begin;
    private Point end;

    public Vector() {
        begin = end = new Point();
    }

    public Vector(double x, double y) {
        begin = new Point();
        end = new Point(x, y);
    }

    public Vector(Point begin, Point end) {
        this.begin = begin;
        this.end = end;
    }

    public Vector sum(Vector vector) {
        return sum(this, vector);
    }

    public Point getBegin() {
        return begin;
    }

    public Point getEnd() {
        return end;
    }

    public Vector sum(Vector v1, Vector v2) {
        v1 = v1.normalize();
        v2 = v2.normalize();
        double x = v1.getEnd().getX() + v2.getEnd().getX();
        double y = v1.getEnd().getY() + v2.getEnd().getY();
        return new Vector(x, y);
    }

    public Vector normalize() {
        double sX = end.getX() - begin.getX();
        double sY = end.getY() - begin.getY();
        return new Vector(sX, sY);
    }

    public double getLength() {
        double dx = end.getX() - begin.getX();
        double dy = end.getY() - begin.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }

    @Override
    public String toString() {
        return "(" + begin + "; " + end + ")";
    }
}
