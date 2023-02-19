import java.util.Scanner;

public class App6 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();
            int sum = 0;

            for (int i = 26; i <= N; i = i + 2) {
                sum += i;
            }
            System.out.println(sum);
        }
    }
}
