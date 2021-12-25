package module3;

import java.util.ArrayList;

public class Exceptions {

    public static void main(String[] args) {
        // new Exceptions().div(1, 0);
        // деление на 0
        ArithmeticException ae;

        // Обращение к методу или свойству по несуществующему объекту
        // Ошибка нулевого указателя
        // NullPointerException - самая частая ошибка
        NullPointerException npe;
//        ArrayList<Integer> list = null;
//        list.add(5);
        String[] s = new String[10];
        s[0] = "124";
        System.out.println(s[0].charAt(0));

        // Ошибка индекса
        IndexOutOfBoundsException ioe;

        int[] a = new int[10];
        a[15] = 3;
    }

    public void throwCheckedException() throws Exception {
        throw new Exception("Checked exception");
    }

    public void throwCheckedExceptionTry() {
        try {
            throw new Exception("Checked exception");
        } catch (Exception e) {
            throw new RuntimeException(e.getCause());
        }
    }

    public void throwUncheckedException() {
        throw new RuntimeException("Unchecked exception");
    }

    public void throwError() {
        throw new OutOfMemoryError();
    }

    public int div(int a, int b) {
        return a / b;
    }

}
