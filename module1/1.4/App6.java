public class App6 {
    public static void main(String[] args) {
        try (java.util.Scanner input = new java.util.Scanner(System.in)) {
            int A = input.nextInt();
            System.out.println(A & (A-1));
        }
    }
}