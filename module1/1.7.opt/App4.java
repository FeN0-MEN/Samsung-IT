import java.util.Scanner;

public class App4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        boolean flag = false;
        for (int i = 10000; i <= 99999; i++) {
            if (i % a == b && i % c == d) {
                System.out.print(i + " ");
                flag = true;
            }
        }
        if (!flag)
        {
            System.out.println(-1);
        }
        in.close();
    }
}