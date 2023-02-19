import java.util.Scanner;

public class App1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();

        in.close();

        int[] m = new int[n + 1];

        for (int i = 1; i <= n; i++)
            m[i] = i;

        for (; a < b; a++, b--) {
            int temp = m[a];
            m[a] = m[b];
            m[b] = temp;

        }
        for (; c < d; c++, d--) {
            int temp = m[c];
            m[c] = m[d];
            m[d] = temp;

        }
        for (int i = 1; i <= n; i++)
            System.out.printf("%d ", m[i]);
        in.close();
    }
}
