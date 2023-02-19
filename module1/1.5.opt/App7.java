import java.util.Scanner;

public class App7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x = in.nextDouble();
        double y = in.nextDouble();
        in.close();

        if (x >= 0 && x <= 1 && y > 1-x)
            System.out.println("YES");
        else if (x <= 0 && y > 1-x && y > Math.pow(x,2)*2)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
