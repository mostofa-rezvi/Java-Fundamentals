// 4. How to get Using input using Scanner - Program in Java

import java.util.Scanner;

public class GetInputFromUser {
  public static void main(String[] args) {
    int a;
    float b;
    String s;

    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter a string.");
    s = scanner.nextLine();
    System.out.println("You entered string: " + s);

    System.out.println("Enter a integer.");
    a = scanner.nextInt();
    System.out.println("You entered integer: " + a);

    System.out.println("Enter a float.");
    b = scanner.nextFloat();
    System.out.println("You entered float: " + b);
  }
}
