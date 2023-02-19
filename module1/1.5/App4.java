import java.util.Scanner;

public class App4 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            double x = input.nextDouble();
            System.out.println((x >= 100) && (x < 1000) && (x % 5 == 0));
        }
    }
}
