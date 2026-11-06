
import java.util.Scanner;

public class PrimeorNot2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n;
    System.out.println("Enter the Number");
    n = sc.nextInt();

    if (n <= 1) {
      System.out.println("Neither Prime Nor Composite ");
      return;
    }
    int cnt = 0;// means prime Number
    for (int i = 2; i * i <= n; i++) {
      if (n % i == 0) {
        cnt++;
        if (n / i != i) {
          cnt++;
        }
      }
    }
    if (cnt == 0)
      System.out.println("Prime Number");
    else {
      System.out.println("Not Prime Number");
    }
     }
}
