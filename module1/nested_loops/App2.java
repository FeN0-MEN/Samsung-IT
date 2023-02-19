import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int steps = 1;

        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
            ++steps;
        }

        System.out.println(a + " " + steps);
        in.close();
    }

}
