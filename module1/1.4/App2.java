public class App2 {
    public static void main(String[] args) {
        try (java.util.Scanner input = new java.util.Scanner(System.in)) {
            int A = input.nextInt();
            int answer = 1;
            answer = answer << A;

            System.out.println(answer);
        }
    }
}
