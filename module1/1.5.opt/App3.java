import java.util.Scanner;

public class App3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x = in.nextDouble();
        double y = in.nextDouble();
        in.close();

        if (x <= 0 && Math.pow(x,2)+y < 2 && y > x)
            System.out.println("YES");
        else if (x > 0 && Math.pow(x,2)+y < 2 && y > 0)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}