package module2.lesson2.animals;

public class Cat extends Animal {

    public Cat() {
        super("cat");
    }

    @Override
    public void say() {
        System.out.println("MEOW");
    }
}
