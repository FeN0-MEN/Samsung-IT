import java.util.Scanner;

public class App1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x = in.nextDouble();
        double y = in.nextDouble();
        in.close();

        if (x > 0  && y > 0 && x < 2 && y < x && Math.pow(x,2)+Math.pow(y,2) > 4)
            System.out.println("YES");
        else 
            System.out.println("NO");
    }
}
