package module2.lesson2.animals;

public abstract class Animal {

    private static int counter = 0;

    private final String type;
    private final long id;

    public Animal(String type) {
        this.type = type;
        counter++;
        id = counter;
    }

    public void printType() {
        System.out.println("I'm a " + type);
    }

    public long getId() {
        return id;
    }

    public abstract void say();

    @Override
    public String toString() {
        return type + "-" + id;
    }
}
