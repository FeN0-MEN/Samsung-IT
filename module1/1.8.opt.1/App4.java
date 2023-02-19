import java.util.Scanner;

public class App4 {
    static int factorial(int n) {
        if (n == 0)
            return 1;
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print(factorial(in.nextInt()));
        in.close();
    }
}
