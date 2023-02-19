import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int previousNumber = in.nextInt();
        int currentNumber;
        int currentLength = 1;
        int maxLength = 1;
        boolean isIncreasing = true;

        while ((currentNumber = in.nextInt()) != 0) {
            if (previousNumber < currentNumber) {
                if (!isIncreasing) {
                    isIncreasing = true;
                    currentLength = 1;
                }
                currentLength++;
            } else if (previousNumber > currentNumber) {
                if (isIncreasing) {
                    isIncreasing = false;
                    currentLength = 1;
                }
                currentLength++;
            } else {
                currentLength = 1;
            }

            if (currentLength > maxLength) {
                maxLength = currentLength;
            }

            previousNumber = currentNumber;
        }

        System.out.println(maxLength);
        in.close();
    }
}
