// 8. How to add two number - Program in Java

import java.util.Scanner;

public class AddNumbers {
  public static void main(String[] args) {
    int x;
    int y;
    int z;

    try (Scanner scanner = new Scanner(System.in)) {
      System.out.println("Enter two integers to calculate their sumation.");
      System.out.print("First Number: ");
      x = scanner.nextInt();
      System.out.print("Second Number: ");
      y = scanner.nextInt();
    }

    z = x + y;
    System.out.println("Sum of entered integers = " + z);
  }
}
