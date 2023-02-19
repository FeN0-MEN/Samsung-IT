import java.util.Scanner;

public class App2 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            int[] array = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
            int mounth = input.nextInt();
            mounth = mounth - 1;
            if (mounth > 11 || mounth < 0) {
                System.out.println(-1);
            } else {
                int day = input.nextInt();
                if (day > array[mounth] || day < 1) {
                    System.out.println(-1);
                } else {

                    int days = array[mounth] - day;
                    for (int i = mounth + 1; i < 12; i++)
                    {
                        days = days + array[i];
                    }
                    System.out.println(days);
                }

            }
        }
    }
}
