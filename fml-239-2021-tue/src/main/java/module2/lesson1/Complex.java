package module2.lesson1;

public class Complex {

    private double x;
    private double y;

    public Complex(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    // sum
    public Complex sum(Complex arg) {
        double x = this.x + arg.x;
        double y = this.y + arg.y;
        return new Complex(x, y);
    }

    // multiply
    public Complex multiply(Complex arg) {
        // (x1; y1) * (x2; y2)
        double x = this.x * arg.x - this.y * arg.y;
        double y = this.x * arg.y + this.y * arg.x;
        return new Complex(x, y);
    }

    // sumEmplace
    public void sumEmplace(Complex arg) {
        x += arg.x;
        y += arg.y;
    }

    public Complex sumEmplaceBuilder(Complex arg) {
        x += arg.x;
        y += arg.y;
        return this;
    }

    @Override
    public String toString() {
        return String.format("(%.2f; %.2f)", x, y);
    }
}
