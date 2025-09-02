// 6. How to swap 2 number using 3rd variable - Program in Java

import java.util.Scanner;

public class SwapNumbers3 {
  public static void main(String[] args) {
    int x, y, temp;

    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter a value for x:");
    x = scanner.nextInt();
    System.out.println("Enter a value for y:");
    y = scanner.nextInt();

    System.out.println("Before Swapping, x: " + x + " and y: " + y);

    temp = x;
    x = y;
    y = temp;

    System.out.println("After Swapping, x: " + x + " and y: " + y);
  }
}
