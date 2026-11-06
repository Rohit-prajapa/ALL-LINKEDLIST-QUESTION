import java.util.Scanner;
public class PrintAllPrime {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n;
    System.out.println("Enter the Number: ");
    n = sc.nextInt();
    int ans = 1;
    for (int i = 2; i <= n; i++) {
      if (n % i != 0) {
        ans = i;
      }
      System.out.println(ans);
    }
  }
}
