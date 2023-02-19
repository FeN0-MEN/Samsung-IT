public class App2 {
    public static void main(String[] args) {
        try (java.util.Scanner input = new java.util.Scanner(System.in)) {
            int a = input.nextInt();
            int sum = 0;
            for (int i = 0; i < 3; i++) {
                sum = sum + a % 10;
                a = a / 10;
            }

            System.out.println(sum);
        }
    }
}
