import java.util.Scanner;

public class App1 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int counter = 0;
            while (true) {

                if (scanner.nextInt() > -1)
                    counter++;
                else {
                    counter++;
                    break;
                }
            }
            System.out.println(counter);
        }
    }
}