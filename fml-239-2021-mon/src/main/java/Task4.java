import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(), b = in.nextInt(), n = in.nextInt();
        int cop = (a * 100 + b) * n;
        System.out.println(cop / 100 + " " + cop % 100);
    }
}
