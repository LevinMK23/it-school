package com.samsung.module2.lesson1;

public class Vector {

    private Point begin;
    private Point end;
    private double dx;
    private double dy;

    public Vector(Point end) {
        begin = new Point(0, 0);
        this.end = end;
        dx = end.getX();
        dy = end.getY();
    }

    public Vector(Point begin, Point end) {
        this.begin = begin;
        this.end = end;
        dx = end.getX() - begin.getX();
        dy = end.getY() - begin.getY();
    }

    public double distance() {
        return Math.sqrt(dx * dx + dy * dy);
    }

    public Vector add(Vector vector) {
        // TODO: 13.11.2021
        double x = end.getX() + vector.dx;
        double y = end.getY() + vector.dy;
        return new Vector(begin, new Point(x, y));
    }

    public double alpha() {
        // cosA = dx / distance()
        return (Math.acos(dx / distance()) * 180) / Math.PI;
    }

    @Override
    public String toString() {
        return String.format("V(%s; %s)", begin, end);
    }
}
