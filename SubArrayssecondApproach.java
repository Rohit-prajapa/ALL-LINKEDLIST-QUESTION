public class SubArrayssecondApproach {
  public static void main(String[] args) {
    int[] arr = { 2, 5, 1, 7, 10 };
    int l = 0;
    int r = 0;
    int sum = 0;
    int maxlength = 0;
    int k=14;
    while (r < arr.length) {
      sum = sum + arr[r];
      while (sum > k) {
        sum = sum - arr[l];
        l++;
      }
      if (sum <= k) {
        maxlength = Math.max(maxlength, r - l + 1);
      }
      r++;
    }

    System.out.println(maxlength);
  }
}
