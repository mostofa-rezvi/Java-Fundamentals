// 5. How to convert Fahrenheit to Celsius - Program in Java

import java.util.Scanner;

public class FahrenheitToCelsius {
  public static void main(String[] args) {
    float temperature;
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter temperature in Fahrenheit: ");
    temperature = scanner.nextInt();

    temperature = ((temperature - 32) * 5) / 9;

    System.out.println("Temperature in Celsius: " + temperature);
  }
}
