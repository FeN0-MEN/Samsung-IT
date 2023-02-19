import java.util.Scanner;

public class App6 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int[] array = new int[3];
            for (int i = 0; i < array.length; i++) {
                array[i] = input.nextInt();
            }
            int counter = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i]%2 == 0)
                {
                    counter = counter + 1;
                }
            }

            System.out.println(counter >= 2);
        }
    }
}
