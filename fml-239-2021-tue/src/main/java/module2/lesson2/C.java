package module2.lesson2;

public class C extends B {

    public C(int x, int y) {
        super(x, y);
    }

    @Override
    public void bFoo() {
        foo();
    }

    @Override
    public void foo() {
        System.out.println("C");
    }
}
