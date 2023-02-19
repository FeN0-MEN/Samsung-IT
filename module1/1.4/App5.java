import java.util.Scanner;

public class App5 {
    public static void main(String[] args)
    {
        try (Scanner input = new Scanner(System.in)) {
          int a = input.nextInt();
          int b = input.nextInt();
          
          System.out.print(a & ((1 << b) - 1));
        }
    }
}