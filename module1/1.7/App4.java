import java.util.Scanner;

public class App4 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int A = scanner.nextInt();
            int B = scanner.nextInt();
            int count = 0;

            while (A >= B) {
                count++;
                A = A - B;
            }
            System.out.println(count + " " + A);
        }
    }
}
