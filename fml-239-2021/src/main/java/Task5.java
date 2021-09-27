import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int nSec = in.nextInt();
        int h = (nSec / 3600) % 24;
        int m = (nSec % 3600) / 60;
        int s = nSec % 60;

        System.out.printf("%d:%02d:%02d\n", h, m, s);
    }
}
