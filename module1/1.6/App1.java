import java.util.Scanner;

public class App1 {

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int N = in.nextInt();
            String result = "";
            if (N >= 0 && N <= 9) {
                result = "DIGIT";
            } else if (N >= 10 && N <= 99) {
                result = "NUM";
            } else {
                result = "OTHER";
            }
            System.out.println(result);
        }
    }
}
