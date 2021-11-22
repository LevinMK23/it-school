package com.samsung.module2.lesson1;

public class Test {
    public static void main(String[] args) {
//        Point p = new Point();
//        p.x = 3;
//        p.y = 4;
//        System.out.println(p.distance());

        Point p1 = new Point(1, 2);
        Point p2 = new Point(3, 4);

        System.out.println(p1.distance(p2));

        Vector v1 = new Vector(new Point(2, 2));
        System.out.println(v1.distance());
        System.out.println(v1.alpha());
        System.out.println(v1.add(new Vector(new Point(2, 0))));
    }
}
