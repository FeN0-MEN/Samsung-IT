import java.util.Scanner;

public class App3 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            double x = input.nextDouble();
            System.out.println(!(((x >= -2) && (x <= 3) )|| ((x >= 6) && (x <= 9))));
        }
    }
}
