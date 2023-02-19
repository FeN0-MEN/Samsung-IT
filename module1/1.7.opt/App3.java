import java.util.Scanner;

public class App3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int counter = 0;
        while (counter != n * 2){
            counter++;
            if (counter % 2 == 0){
                System.out.print(counter + " ");
            }
        }
        in.close();
    }
}