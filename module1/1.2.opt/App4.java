import java.util.Scanner;

public class App4 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int A = input.nextInt();
            int B = input.nextInt();

            System.out.println(A * A + B * B);
        }
    }
}
