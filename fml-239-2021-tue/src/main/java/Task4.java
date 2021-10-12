import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x = in.nextDouble(), y = in.nextDouble();
        // &&, ||
        // >, <, >=, <=, !=, ==
        if (x >= 0 && y >= x && x * x + y * y <= 4) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        int a = 3, b = 4;

        int max = a > b ? a : b;

        int s = 31;

        Color color = Color.RED;

        switch (s) {
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            default:
                System.out.println("OTHER");
        }
    }
}
