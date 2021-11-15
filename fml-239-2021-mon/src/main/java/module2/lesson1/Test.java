package module2.lesson1;

public class Test {

    public static void main(String[] args) {
        // new Point() - конструктор класса
        // специальная функция создающая ссылку на объект
        // в оперативной памяти
        Point p1 = new Point(5, 4);

        double distance = p1.distance();
        System.out.println(distance);

//        Point p2 = null;
//        System.out.println(p2.distance());
//        for (int i = 0; i < 5; i++) {
//            new Point();
//        }
//        System.out.println(Point.cnt);

        Vector v1 = new Vector(2, 2);
        Vector v2 = new Vector(4, 1);
        Vector sum = v1.sum(v2);
        System.out.println(sum);

        Vector v3 = new Vector(3, 4);
        System.out.println(v3.getLength());

        Point p3 = new Point(2, 2);
        Point p4 = new Point(5, 6);
        Vector v4 = new Vector(p3, p4);
        System.out.println(v4.getLength());
        System.out.println(v4);
        System.out.println(v4.normalize());
    }
}
