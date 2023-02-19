import java.util.Scanner;

public class App2 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            double x = input.nextDouble();
            System.out.println(((x >= -3) && (x <= 5) )|| ((x >= 9) && (x <= 15)));
        }
    }
}
