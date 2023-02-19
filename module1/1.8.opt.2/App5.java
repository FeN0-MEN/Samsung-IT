import java.util.Scanner;

public class App5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        int[] array = new int[N];
        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextInt();
        }
        in.close();

        int counter = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[i-1]) {
                counter++;
            }
        }
        System.out.print(counter);

    }
}
