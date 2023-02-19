import java.util.Scanner;

public class App5 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int[] array = new int[3];
            for (int i = 0; i < array.length; i++) {
                array[i] = in.nextInt();
            }
            java.util.Arrays.sort(array);
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
        }
        
    }
}
