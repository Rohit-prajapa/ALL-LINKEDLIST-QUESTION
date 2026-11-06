
import java.util.Scanner;

public class Power2 {
  public static int pow(int a, int b) {
    if (b == 0)
      return 1;
    return a * pow(a, b - 1);
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a;
    System.out.println("Enter the base Number ");
    a = sc.nextInt();

    int b;
    System.out.println("Enter the exponent number");
    b = sc.nextInt();

    int c = pow(a, b);
    System.out.println(a+" raised to power "+b+" is :"+c);
  }
}
