import java.util.Scanner;

public class App3 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int num = in.nextInt();
            String word = " TORT";
            int last = num % 10;
            int last2 = num % 100;
            if (last == 0) {
                word = " TORTOV";
            } else if (num >= 0 && num <= 9) {
                if (num >= 2 && num <= 4) {
                    word = " TORTA";
                } else if (num >= 5 && num <= 9) {
                    word = " TORTOV";
                }
            } else if (num >= 5 && num <= 9) {
                word = " TORTOV";
            } else if (last2 >= 10 && last2 <= 19) {
                word = " TORTOV";
            } else if (last >= 2 && last <= 4) {
                word = " TORTA";
            } else if (last >= 5) {
                word = " TORTOV";
            }
            System.out.print(num + word);
        }
    }
}