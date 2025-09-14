// 7. How to swap 2 number without using 3rd variable - Program in Java

import java.util.Scanner;

public class SwapNumbers2 {
  public static void main(String[] args) {
    int x;
    int y;

    try (Scanner scanner = new Scanner(System.in)) {
      System.out.println("Enter the value for x: ");
      x = scanner.nextInt();
      System.out.println("Enter the value for y: ");
      y = scanner.nextInt();
    }

    System.out.println("Before swapping, x: " + x + " and y: " + y);

    x = x + y;
    y = x - y;
    x = x - y;

    System.out.println("After swapping, x: " + x + " and y: " + y);
  }
}
