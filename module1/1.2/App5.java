import java.text.DecimalFormat;
public class App5 {
    public static void main(String[] args) {
        try (java.util.Scanner input = new java.util.Scanner(System.in)) {
            int n = input.nextInt();
            int seconds = n % 60;
            int minutes = (n / 60) % 60;
            int hours = (n / 3600) % 24;
            DecimalFormat ft = new DecimalFormat("00");
            System.out.println(hours +":"+ ft.format(minutes) +":"+ ft.format(seconds));
        }
    }
}
