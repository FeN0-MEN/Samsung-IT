public class App3 {
      public static void main(String[] args) {
        try (java.util.Scanner input = new java.util.Scanner(System.in)) {
            int A = input.nextInt();
            int i = input.nextInt();
            
            A = A | (1 << i);
            System.out.println(A);
        }
    }
}
