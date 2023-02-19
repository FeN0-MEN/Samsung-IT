import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int n = in.nextInt();
        int k = 0;

        for (int i = 0; i <= n / a; i++) {
            for (int j = 0; j <= (n - i * a) / b; j++) {
                int rest = n - i * a - j * b;
                if (rest % c == 0) {
                    k++;
                }
            }
        }

        System.out.println(k);
        for (int i = 0; i <= n / a; i++) {
            for (int j = 0; j <= (n - i * a) / b; j++) {
                int rest = n - i * a - j * b;
                if (rest % c == 0) {
                    int l = rest / c;
                    System.out.println(i + " " + j + " " + l);
                }
            }
        }
        in.close();
    }
}
