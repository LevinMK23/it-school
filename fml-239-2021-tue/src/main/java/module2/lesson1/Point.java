package module2.lesson1;

public class Point {

    private double x;
    private double y;

    // конструктор класса
    public Point() {
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // method - метод (функция класса)
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}
