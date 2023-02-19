import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int a = input.nextInt();
            int b = input.nextInt();

            System.out.println(a + b);
        }
    }
}