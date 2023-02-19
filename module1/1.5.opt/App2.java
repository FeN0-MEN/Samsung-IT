import java.util.Scanner;

public class App2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x = in.nextDouble();
        double y = in.nextDouble();
        in.close();

        if (x > 0  && x < Math.PI && y > 0 && y < 0.5 && y - Math.sin(x) < 0)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}