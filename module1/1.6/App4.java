import java.util.Scanner;

public class App4 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            float A = in.nextInt();
            float B = in.nextInt();
            float x;
            String result = "";
            String part1 = "";
            String part2 = "";
            float x1 = 0;
            float x2 = 0;

            x = -B / A;
            if (Double.isInfinite(x)) {
                if (x < 0) {
                    result = "any x";
                } else {
                    result = "no such x";
                }
            } else if (x < 0 && ((A * x + B > 0) || (A * (-1 * x) + B > 0))) {
                result = "any x";
            } else if (x < 0 && ((A * x + B <= 0) || (A * (-1 * x) + B <= 0))) {
                result = "no such x";
            } else if (A == 0 && B == 0) {
                result = "no such x";
            } else {

                if (A * (-1 * x) + B > 0) {
                    x1 = x;
                    part2 = "" + String.format("%.1f", x1);
                } else {
                    x1 = -1 * x;
                    part1 = "x<" + String.format("%.1f", x1) + " or x>";
                }
                if (A * (x * -1.) + B > 0) {
                    x2 = -1 * x;
                    part1 = String.format("%.1f", x2) + "<x<";
                } else {
                    x2 = x;
                    part2 = "" + String.format("%.1f", x2);
                }
                result = part1 + part2;
            }
            System.out.println(result);
        }
    }
}