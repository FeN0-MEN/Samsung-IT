import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n, max = 0, count = 0;
        while ((n = in.nextInt()) != 0) {
            if (n > max) {
                max = n;
                count = 1;
            } else if (n == max) {
                count++;
            }
        }
        System.out.println(count);
        in.close();
    }
}
