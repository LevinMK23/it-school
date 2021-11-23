package module2.lesson1;

import module2.lesson2.A;
import module2.lesson2.B;
import module2.lesson2.C;

public class Test {
    public static void main(String[] args) {
        Point point = new Point(1, 3);
        point.setX(5);
        point.setY(4);

        Complex z1 = new Complex(1,2);
        z1.sumEmplaceBuilder(new Complex(2, 3))
                .sumEmplaceBuilder(new Complex(2, 3))
                .sumEmplaceBuilder(new Complex(2, 3));

        Complex result = z1.sum(new Complex(1, 2));
        System.out.println(result);

        B b = new B(1, 2);
        b.bFoo();
        System.out.println(b.getX());
        System.out.println(b.getY());

        C a = new C(1, 2);
        a.bFoo();
        // C c = new A(1,2);
    }
}
