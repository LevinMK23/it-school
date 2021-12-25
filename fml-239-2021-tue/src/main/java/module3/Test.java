package module3;

public class Test {
    public static void main(String[] args) {
        CustomList<Integer> list = new CustomList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        for (Integer item : list) {
            System.out.print(item + " ");
        }
        System.out.println();
        list.removeLast();
        for (Integer item : list) {
            System.out.print(item + " ");
        }
        System.out.println();
        list.removeLast();
        list.removeLast();
        list.removeLast();
    }
}
