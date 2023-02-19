import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[10];
        while (n > 0) {
            int d = n % 10;
            nums[d]++;
            n /= 10;
        }
        for (int num : nums) {
            if (num >= 2) {
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
        in.close();
    }

}
