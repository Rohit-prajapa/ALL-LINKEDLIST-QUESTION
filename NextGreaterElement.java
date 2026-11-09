
import java.util.Arrays;

public class NextGreaterElement {
  public static int[] nextgreaterElement(int[] arr) {
    int n = arr.length;
    int[] nge = new int[n];
    for (int i = 0; i < arr.length; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[j] > arr[i]) {
          nge[i] = arr[j];
          break;
        }
      }
    }
    return nge;
  }
  public static void main(String[] args) {
    int[] arr = { 6, 0, 8, 1, 3 };

    int[] ans = nextgreaterElement(arr);
    System.out.println(Arrays.toString(ans));
  }
}
