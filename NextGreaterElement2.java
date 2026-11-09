
import java.util.Arrays;

public class NextGreaterElement2 {
  public static int[] nextGreaterElement2(int[] arr) {
    int n = arr.length;
    int[] nge= new int[n];
    for (int i = 0; i < n; i++) {
      for (int j = i + 1; j < n; j++) {
        if (arr[j] > arr[i]) {
          nge[i] = arr[j];
          break;
        }
      }
    }
    return nge;
  }
  public static void main(String[] args) {
    int[] arr = { 4, 2, 7, 8, 3, 4, 9, 6 };
    int[] ans = nextGreaterElement2(arr);
   System.out.println(Arrays.toString(ans));  
  }
}
