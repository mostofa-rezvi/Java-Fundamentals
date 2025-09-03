import java.util.Scanner;
import java.math.BigInteger;

public class DemoOne {
  public static void main(String[] args) {
    // 1
    // System.out.println("Simple Java Program.");
    // -------------------------

    // 2
    // int a;
    // for (a = 1; a <= 5; a++) {
    // System.out.println(a);
    // }
    // -------------------------

    // 3
    // for (String t : args) {
    // System.out.println(t);
    // }
    // -------------------------

    // 4
    // int a;
    // Scanner scanner = new Scanner(System.in);
    // System.out.print("Enter a number: ");
    // a = scanner.nextInt();
    // System.out.println(a);
    // -------------------------

    // 5
    // int temperature;
    // Scanner scanner = new Scanner(System.in);
    // System.out.print("Enter a Fahrenheite temperature: ");
    // temperature = scanner.nextInt();
    // temperature = ((temperature - 32) * 5) / 9;
    // System.out.println("Fahrenheit to Celsius Temperature is: " + temperature);
    // -------------------------

    // 6
    // int a;
    // int b;
    // int z;
    // System.out.println("");
    // Scanner scanner = new Scanner(System.in);
    // System.out.print("Enter first value: ");
    // a = scanner.nextInt();
    // System.out.print("Enter second value: ");
    // b = scanner.nextInt();
    // System.out.println("Before Swapping, first value: " + a + " and second value:
    // " + b);
    // z = a;
    // a = b;
    // b = z;
    // System.out.println("After Swapping, first value: " + a + " and second value:
    // " + b);
    // -------------------------

    // 7
    // int a;
    // int b;
    // System.out.println("");
    // Scanner scanner = new Scanner(System.in);
    // System.out.print("Enter First value: ");
    // a = scanner.nextInt();
    // System.out.print("Enter Second value: ");
    // b = scanner.nextInt();
    // System.out.println("Before Swapping, First value: " + a + " and Second value:
    // " + b);
    // a = a + b;
    // b = a - b;
    // a = a - b;
    // System.out.println("After Swapping, First value: " + a + " and Second value:
    // " + b);
    // System.out.println("");
    // a = a * b; // 5 & 6 = 30
    // b = a / b; // 30/6 = 5
    // a = a / b; // 30/5 = 6
    // System.out.println("First value: " + a + " and Second value: " + b);
    // -------------------------

    // 8
    // int number1;
    // int number2;
    // Scanner scanner = new Scanner(System.in);
    // System.out.print("Enter a number: ");
    // number1 = scanner.nextInt();
    // System.out.print("Enter another number: ");
    // number2 = scanner.nextInt();
    // int result = number1 + number2;
    // System.out.println("Sum of given numbers: " + result);
    // -------------------------

    // 9
    String number1;
    String number2;
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter first large number: ");
    number1 = scanner.nextLine();
    System.out.print("Enter second large number: ");
    number2 = scanner.nextLine();
    BigInteger first = new BigInteger(number1);
    BigInteger second = new BigInteger(number2);
    BigInteger result;
    result = first.add(second);
    System.out.println("Sum of two large numbers: " + result);
    // -------------------------

    // 10
    // boolean condition = false;
    // if (condition) {
    //   System.out.println("Condition is okay.");
    // } else {
    //   System.out.println("Condition has problems.");
    // }
    // -------------------------

  }
}