public class App1 {
    public static void main(String[] args) {
        try (java.util.Scanner input = new java.util.Scanner(System.in)) {
            int A = input.nextInt();
            int i = input.nextInt();
            A = A>>>i;
            A = A << i;
            System.out.println(A);
        }
    }
}