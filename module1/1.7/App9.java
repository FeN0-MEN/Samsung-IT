import java.util.Scanner;

public class App9 {
    public static void main(String[] args){
        try (Scanner in = new Scanner(System.in)) {
            int A = in.nextInt();
            int answer = 9;

            while (A > 0) {
                int digit = A % 10;
                if ( digit != 0)
                {
                    if (digit < answer)
                    {
                        answer = digit;
                    }
                }
                A /= 10;
            }
            System.out.println(answer); 
        }
    }
}