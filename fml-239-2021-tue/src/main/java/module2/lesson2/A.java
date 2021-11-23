package module2.lesson2;

public class A {

    private int x;
    protected int y;

    public A(int x, int y) {
        this.x = x;
        this.y = y;
    }

    private void bar() {
        System.out.println("NO");
    }

    protected void pFoo() {
        System.out.println("PA");
    }

    public void foo() {
        System.out.println("A");
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
