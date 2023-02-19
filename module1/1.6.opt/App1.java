import java.util.Scanner;

public class App1 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int[] array = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
            int a = input.nextInt();
            
            if (a > 12 || a < 1) {
                System.out.println(0);
            } else {
                System.out.println(array[a - 1]);
            }
        }
    }
}
