import java.util.Scanner;

public class App1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = 0, n, i, h;
        n = in.nextInt();
        in.close();
        for (i = 1; i <= n && k == 0; i++) {
            h = in.nextInt();
            if (h <= 437) k = i;
        }
        if (k != 0) {
            System.out.println("Crash " + k);
        } else {
            System.out.println("No crash");
        }
    }
}