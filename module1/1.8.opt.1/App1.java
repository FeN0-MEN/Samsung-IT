import java.util.Scanner;

public class App1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        String str = Integer.toBinaryString(N);
        
        for (int i=str.length() - 1; i>=0; i--)
        {
            System.out.print(str.charAt(i));
        }
        in.close();
    }
}
