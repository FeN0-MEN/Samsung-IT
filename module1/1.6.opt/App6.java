import java.util.Scanner;

public class App6 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int[] array = new int[3];
            for (int i = 0; i < array.length; i++) {
                array[i] = in.nextInt();
            }

            int a = array[0];
            int b = array[1];
            int c = array[2];

            int mx = 0;
            int mn = 0;
            int sr = 0;

            int d = 0;
            int e = 0;
            if ((a + b <= c) || (a + c <= b) || (b + c <= a)) {
                System.out.print("impossible");
            } else {

                if (a > b) {
                    mx = a;
                } else {
                    mx = b;
                }
                if (c > mx) {
                    mx = c;
                }
                if (a < b) {
                    mn = a;
                } else {
                    mn = b;
                }
                if (c < mn) {
                    mn = c;
                }
                sr = a + b + c - mx - mn;
                d = mn * mn + sr * sr;
                e = mx * mx;
                if (d > e)
                    System.out.print("acute");
                else if (d < e) {
                    System.out.print("obtuse");
                } else if (d == e) {
                    System.out.print("right");
                }
            }
        }
    }
}
