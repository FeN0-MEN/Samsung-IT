import java.util.Scanner;

public class App4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        int[] array = new int[N];
        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextInt();
        }
        in.close();

        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                counter++;
            }
        }
        System.out.print(counter);

    }
}
