import java.util.Scanner;

public class App3 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int sum = 0;
            while (scanner.hasNext()) {
                int number = scanner.nextInt();
                if (number < 10 || number > 99) {
                    break;
                }
                sum += number % 10;
                sum += (number - (number % 10)) / 10;

            }
            System.out.println(sum);
        }
    }
}
