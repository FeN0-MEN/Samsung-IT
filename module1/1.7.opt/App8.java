import java.util.Scanner;

public class App8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        int n = in.nextInt();
        System.out.println(power(a, n));
        in.close();
    }
    public static double  power(double  a, int n) {
        if (n == 0) {
            return 1;
        } else if (n == 1) {
            return a;
        } else if (n % 2 != 0) {
            return a * power(a, n - 1);
        } else if (n % 2 == 0) {
            return power(a * a, n / 2);
        }
        return 0;
    }
}