import java.util.Scanner;

public class App7 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int A = in.nextInt();
            int count = 0;

            while (A > 0) {
                A /= 10;
                count++;
            }

            System.out.println(count);
        }
    }
}