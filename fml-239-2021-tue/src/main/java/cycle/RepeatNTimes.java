package cycle;

public class RepeatNTimes {
    public static void main(String[] args) {
        int n = 5;
        // while, for
//        while (true) {
//
//        }
//
//        do {
//            System.out.println(1);
//        } while (true);

        int i = 0;
        while (i < n) {
            System.out.print(" * ");
            i++;
        }
        System.out.println();

        for (int ii = 0; ii < n; ii++) {
            System.out.print(" * ");
        }
        System.out.println();
        // n -> 3
        // ()(())((()))
    }
}
