package module2.lesson1;

import module2.lesson1.animals.Animal;
import module2.lesson1.animals.BlackCat;
import module2.lesson1.animals.Cat;
import module2.lesson1.animals.Dog;

public class Test {

    static void say(Animal animal) {
        animal.say();
    }

    public static void main(String[] args) {
        MathUtils utils = new MathUtils();
        double sum = utils.sum(1, 2.);
        System.out.println(sum);

        Animal cat = new Cat();
        Animal blackCat = new BlackCat();
        Animal dog = new Dog();

        cat.say();
        dog.say();
        blackCat.say();

//        say(cat);
//        say(dog);

        ShapeProcessor processor = new ShapeProcessor();
        processor.printShapeParams(new Circle(new Point(0, 0), 4));
        processor.printShapeParams(new Rectangle(new Point(2,2)));
        processor.printShapeParams(new Triangle(3, 4, 5));
        processor.printShapeParams(new Square(5));

        processor.printShapeParams(new Rectangle(new Point(2, 4), new Point(4, 8)));
    }
}
