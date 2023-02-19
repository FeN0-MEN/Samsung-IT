import java.util.Scanner;

public class App3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        int[] array = new int[N];
        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextInt();
        }
        in.close();

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + " ");
            }
        }
    }
}
