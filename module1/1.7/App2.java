import java.util.Scanner;

public class App2 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int counter = 0;
            int answ;
            while (true) {
                answ = scanner.nextInt();
                if (answ % 5 != 0) {
                    if (answ > 10) {
                        counter += answ;
                    }
                } else {
                    if (answ > 10) {
                        counter += answ;
                    }
                    break;
                }
            }
            System.out.println(counter);
        }
    }
}