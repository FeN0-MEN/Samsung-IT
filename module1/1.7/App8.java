import java.util.Scanner;

public class App8 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int A = in.nextInt();
            int answer = 0;

            while (A > 0) {
                answer = A % 10;
                if ( answer % 2 == 1)
                {
                    System.out.println(answer); 
                    return;
                }
                A /= 10;
            }
            
            System.out.println("NO");
        }
    }
}