
import java.util.Scanner;

public class PrimeOrNot {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n;
    System.out.println("Enter the Number");
    n = sc.nextInt();
    Boolean flag = true;
    if (n <= 1) {
      System.out.println("Neither prime Not Composite");
      return;
    }
    for (int i = 2; i <n; i++) {
      if (n % i == 0) {
        flag = false;
        break;
      }
    }
    if (flag == true)
       System.out.println("Number is Prime");
    else System.out.println("Number is Not Prime");
  }
}
