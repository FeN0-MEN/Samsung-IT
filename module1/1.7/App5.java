import java.util.Scanner;

public class App5 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int A = scanner.nextInt();
            int count = 0;

            while (A > 0) {
                A = A >> 1;
                count++;
            }
            System.out.println(count);
        }
    }
}
