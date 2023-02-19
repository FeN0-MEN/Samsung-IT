import java.util.Scanner;

public class App10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt() + 1;
        while (!IsPrime(N)) {
            N++;
        }
        System.out.println(N);
        in.close();
    }

    public static boolean IsPrime(int n) {
        for(int i = 2; i < n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}