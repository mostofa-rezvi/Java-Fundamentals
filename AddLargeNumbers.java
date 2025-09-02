// 8. How to add large two number - Program in Java

import java.util.Scanner;
import java.math.BigInteger;

public class AddLargeNumbers {
  public static void main(String[] args) {
    String number1;
    String number2;

    System.out.println("Adding Two Large Numbers,");
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter First Large Number: ");
    number1 = scanner.nextLine();
    System.out.print("Enter Second Large Number: ");
    number2 = scanner.nextLine();

    BigInteger first = new BigInteger(number1);
    BigInteger second = new BigInteger(number2);
    BigInteger sum;

    sum = first.add(second);
    System.out.println("Result of large numbers Addition: " + sum);
  }
}
