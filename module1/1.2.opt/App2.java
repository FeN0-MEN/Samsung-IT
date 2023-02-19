import java.util.Scanner;

public class App2 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int N = input.nextInt();

            System.out.println(N / 10);
        }
    }
}
