package module2.lesson2.animals;

public class Dog extends Animal {

    public Dog() {
        super("dog");
    }

    @Override
    public void say() {
        System.out.println("WOW");
    }
}
