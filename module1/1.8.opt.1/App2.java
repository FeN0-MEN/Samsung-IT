import java.util.Scanner;

public class App2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        int[] array = new int[N - 1];
        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextInt();
        }
        in.close();

        java.util.Arrays.sort(array);
        ;

        for (int i = 0; i < array.length; i++) {
            if (array[i] != i + 1) {
                System.out.println(i + 1);
                return;

            }
        }
        System.out.println(N);

    }
}
