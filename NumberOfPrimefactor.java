
import java.util.Scanner;

public class NumberOfPrimefactor {
  public static boolean isPrime(int n) {
    boolean flag = true;
    for (int i = 2; i * i <= n; i++) {
      if (n % i == 0) {
        flag = false;
        break;
      }
    }
    if (flag)
      return true;
    else
      return false; 
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n;
    System.out.println("Enter the Number");
    n = sc.nextInt();
    if (n == 1) {
      System.out.println(n);
      return;
    }
    for (int i = 2; i <= n; i++) {
      if (n % i == 0) {
        if (isPrime(i)) {
          System.out.println(i);
        }
      }
    }
  }
}
