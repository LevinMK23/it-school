package com.samsung.module2.lesson1;

public class Point {
    // ""(package private) private public protected
    private final double x;
    private final double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double distance() {
        return Math.sqrt(x * x + y * y);
    }

    public double distance(Point point) {
        double dx = point.x - x;
        double dy = point.y - y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    @Override
    public String toString() {
        return String.format("O(%.2f; %.2f)", x, y);
    }
}
