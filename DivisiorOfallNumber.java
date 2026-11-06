import java.util.Scanner;

public class DivisiorOfallNumber {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n;
    System.out.println("Enter the Number");
    n = sc.nextInt();

    for (int i = 1; i <= n; i++) {
      if (n % i == 0) {
        System.out.println("Divisior of "+n+" is :"+i);
      }
    }
  }
}
