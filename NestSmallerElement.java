import java.util.Arrays;

public class NestSmallerElement {
  public static int[] nextsmallerElement(int[] arr) {
    int n = arr.length;
    int[] nse = new int[n];
    for (int i = 0; i < n; i++) {
      for (int j = i - 1; j >=  0; j--) {
        if (arr[j] < arr[i]) {
          nse[i] = arr[j];
          break;
        }
      }
    }
    return nse;
  }
  public static void main(String[] args) {
    int[] arr = { 4, 5, 2, 10, 8 };
    int[] ans = nextsmallerElement(arr);
    System.out.println(Arrays.toString(ans));
  }
}
