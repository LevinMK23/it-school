package module2.lesson2;

public class B extends A {


    public B(int x, int y) {
        super(x, y);

    }

    public void bFoo() {
        super.foo();
    }

    @Override
    public void foo() {
        System.out.println("B");
    }
}
