
import java.util.Scanner;

public class SubArrays {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] arr = { 2, 5, 1, 7, 10 };
    int k=14;
    int maxlength = 0;
    for (int i = 0; i < arr.length; i++) {
      int sum = 0;
      for (int j = i; j < arr.length; j++) {
        sum = sum + arr[j];
        if (sum <= k) {
          maxlength = Math.max(maxlength, j - i + 1);
        } else {
          if (sum > k)
            break;
        }
      }
    }
    System.out.println(maxlength);
  }
}
