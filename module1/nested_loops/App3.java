import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        boolean flag = false;

        for (int i = a; i <= b; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
                flag = true;
            }
        }
        if (!flag) {
            System.out.print(0);
        }
        in.close();
    }
    private static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}
