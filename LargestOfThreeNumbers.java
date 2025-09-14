// 9. Find Large Number out of 3 Numbers - Program in Java

import java.util.Scanner;

public class LargestOfThreeNumbers {
  public static void main(String[] args) {
    int x;
    int y;
    int z;

    System.out.println("Find Large number out of 3 number.");
    try (Scanner scanner = new Scanner(System.in)) {
      System.out.print("Enter First Number: ");
      x = scanner.nextInt();
      System.out.print("Enter Second Number: ");
      y = scanner.nextInt();
      System.out.print("Enter Third Number: ");
      z = scanner.nextInt();
    }

    if (x > y && x > z) {
      System.out.println("First Number is Largest.");
    } else if (y > x && y > z) {
      System.out.println("Second Number is Largest.");
    } else if (z > x && z > y) {
      System.out.println("Third Number is Largest.");
    } else {
      System.out.println("Entered numbers are not distinct.");
    }
  }
}
