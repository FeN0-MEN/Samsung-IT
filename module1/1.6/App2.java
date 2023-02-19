import java.util.Scanner;
import java.util.Arrays;

public class App2 {

  public static void main(String[] args) {
    try (Scanner in = new Scanner(System.in)) {

      int[] array = new int[3];
      array[0] = in.nextInt();
      array[1] = in.nextInt();
      array[2] = in.nextInt();
      Arrays.sort(array);
      System.out.println(array[0] + " " + array[1] + " " + array[2]);
    }
  }
}