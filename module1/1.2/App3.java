public class App3 {
    public static void main(String[] args) {
        try (java.util.Scanner input = new java.util.Scanner(System.in)) {
            int a = input.nextInt();
            a = ((a + 2) / 2) * 2;

            System.out.println(a);
        }
    }
}
