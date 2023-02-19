import java.util.Scanner;

public class App4 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int[] array = new int[3];
            for (int i = 0; i < array.length; i++)
            {
                array[i] = in.nextInt();
            }
            int max = array[0];
            for (int i = 1; i < array.length; i++)
            {
                if (array[i] > max)
                {
                    max = array[i];
                }
            }
            System.out.println(max);
        }
    }
}
