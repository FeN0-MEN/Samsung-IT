import java.util.Scanner;

public class App3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        in.close();

        int[][] arr1 = new int[N][N];

        int counter = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                counter++;
                arr1[i][j] = counter;
            }
        }

        counter = 0;
        for (int j = 0; j < N; j++) {
            for (int i = 0; i < N; i++) {
                counter++;
                if (arr1[i][j] == counter) {
                    System.out.print(counter + " ");
                }
            }
        }
    }
}
