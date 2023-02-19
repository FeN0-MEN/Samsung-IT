import java.util.Scanner;

public class App7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.close();
        if (n < 2) {
            System.out.println("composite");
            return;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                System.out.println("composite");
                return;
            }
        }
        System.out.println("prime");
        in.close();
    }
}