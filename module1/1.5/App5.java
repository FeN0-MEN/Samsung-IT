import java.util.Scanner;

public class App5 {
    public static Boolean opposite(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == -array[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int[] array = new int[4];
            for (int i = 0; i < 4; i++) {
                array[i] = input.nextInt();
            }
            System.out.println(opposite(array));
        }
    }
}
