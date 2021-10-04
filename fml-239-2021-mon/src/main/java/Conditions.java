import java.util.Scanner;

public class Conditions {

    public static void main(String[] args) {
        // ==, >, <, >=, <=, !=
        // &&, ||, !
        Scanner in = new Scanner(System.in);
        String[] values = in.nextLine().split(" ");
        double x = Double.parseDouble(values[0]);
        double y = Double.parseDouble(values[1]);

        if (y >= x * x - 2 && (y <= -1 || y <= x)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }


//        if (true) {
//
//        } else if (true) {
//
//        } else if (true) {
//
//        } else if (true) {
//
//        } else {
//
//        }
    }
}
