import java.util.Scanner;

public class App1 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int N = input.nextInt();

            System.out.println(N % 10);
        }
    }
}
