package module2.lesson1;

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
    }
}
