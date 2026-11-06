
import java.util.Scanner;

public class Power {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a;
    System.out.println("Enter the Value Of a: ");
    a = sc.nextInt();

    int b;
    System.out.println("Enter the Value of b: ");
    b = sc.nextInt();

    int pow = 1;
    for (int i = 1; i <= b; i++) {
      pow = pow * a;
    }
    System.out.println(a +" raised to Power "+b+" is "+pow);
  }
}
