import java.util.Scanner;

public class App6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        int[] array = new int[N];
        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextInt();
        }
        in.close();

        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.print(max);

    }
}
