public class App4 {
    public static void main(String[] args) {
        try (java.util.Scanner input = new java.util.Scanner(System.in)) {
            int a = input.nextInt();
            int b = input.nextInt();
            int n = input.nextInt();

            b = b * n;
            a = a * n + b / 100;
            b = b % 100;

            System.out.println(a + " " + b);
        }
    }
}
