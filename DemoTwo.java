
// import java.math.BigInteger;
// import java.util.Scanner;

public class DemoTwo {
    public static void main(String[] args) {
        // System.out.println("Assalamu Alaikum.");

        // int a;
        // for (a = 1; a <= 5; a++) {
        // System.out.println(a);
        // }

        // for (String t : args) {
        // System.out.println(t);
        // }

        // int a;
        // try (Scanner scanner = new Scanner(System.in)) {
        // System.out.println("Enter a number:");
        // a = scanner.nextInt();
        // }
        // System.out.println(a);

        // int temperature;
        // try (Scanner scanner = new Scanner(System.in)) {
        // System.out.println("Enter Fahrenheite temperature: ");
        // temperature = scanner.nextInt();
        // }
        // temperature = ((temperature - 32) * 5) / 9;
        // System.out.println("Fahrenheit to Celsius Temperature: " + temperature);

        // int a;
        // int b;
        // int c;
        // System.out.println("");
        // try (Scanner scanner = new Scanner(System.in)) {
        // System.out.println("Enter First Value: ");
        // a = scanner.nextInt();
        // System.out.println("Enter Second Value: ");
        // b = scanner.nextInt();
        // }
        // System.out.println("Before Swapping, First Value: " + a + " & Second Value: "
        // + b);
        // c = a;
        // a = b;
        // b = c;
        // System.out.println("After Swapping, First Value: " + a + " & Second Value: "
        // + b);

        // int a;
        // int b;
        // System.out.println("");
        // try(Scanner scanner = new Scanner(System.in)){
        // System.out.println("Enter First Value: ");
        // a = scanner.nextInt();
        // System.out.println("Enter Second Value: ");
        // b = scanner.nextInt();
        // }
        // System.out.println("Before Swapping, First Value: " + a + " & Second Value: "
        // + b);
        // a = a * b;
        // b = a / b;
        // a = a / b;
        // System.out.println("After Swapping, First Value: " + a + " & Second Value: "
        // + b);

        // int numberOne;
        // int numberTwo;
        // try(Scanner scanner = new Scanner(System.in)){
        // System.out.println("Enter first number: ");
        // numberOne = scanner.nextInt();
        // System.out.println("Enter second number: ");
        // numberTwo = scanner.nextInt();
        // }
        // int result = numberOne + numberTwo;
        // System.out.println("Sum of given number: " + result);

        // String numberOne;
        // String numberTwo;
        // try (Scanner scanner = new Scanner(System.in)) {
        // System.out.println("Enter First Large number: ");
        // numberOne = scanner.nextLine();
        // System.out.println("Enter Second Large number: ");
        // numberTwo = scanner.nextLine();
        // }
        // BigInteger first = new BigInteger(numberOne);
        // BigInteger second = new BigInteger(numberTwo);
        // BigInteger result = first.add(second);
        // System.out.println("Sum of two large numbers are: " + result);

        // int a;
        // int b;
        // int c;
        // System.out.println("");
        // try (Scanner scanner = new Scanner(System.in)) {
        // System.out.println("Enter First number: ");
        // a = scanner.nextInt();
        // System.out.println("Enter Second number: ");
        // b = scanner.nextInt();
        // System.out.println("Enter Third number: ");
        // c = scanner.nextInt();
        // }
        // if (a > b && a > c) {
        // System.out.println(a + " is the largest number.");
        // } else if (b > a && b > c) {
        // System.out.println(b + " is the largest number.");
        // } else {
        // System.out.println(c + " is the largest number.");
        // }

        // boolean condition = true;
        // if (condition) {
        // System.out.println("Condition is true.");
        // } else {
        // System.out.println("Condition is false.");
        // }

        // 11
        // int marksObtained;
        // int passingMarks = 40;
        // try (Scanner scanner = new Scanner(System.in)) {
        // System.out.println("Input your marks: ");
        // marksObtained = scanner.nextInt();
        // }
        // if (marksObtained >= passingMarks) {
        // System.out.println("You pass the exam.");
        // } else {
        // System.out.println("Unfortunately, you failed in the exam.");
        // }

        // 12
        // int marksObtained;
        // int passingMarks = 40;
        // char grade;
        // try (Scanner scanner = new Scanner(System.in)) {
        // System.out.println("Input your marks: ");
        // marksObtained = scanner.nextInt();
        // }
        // if (marksObtained >= passingMarks) {
        // if (marksObtained > 90) {
        // grade = 'A';
        // } else if (marksObtained > 80) {
        // grade = 'B';
        // } else if (marksObtained > 70) {
        // grade = 'C';
        // } else {
        // grade = 'D';
        // }
        // System.out.println("You passed in the exam and your grade is: " + grade);
        // } else {
        // grade = 'F';
        // System.out.println("You failed in the exam and your grade is: " + grade);
        // }
        // have some errors.

        // 13
        // int x;
        // try (Scanner scanner = new Scanner(System.in)) {
        // System.out.println("Enter an integer to check if it is odd or even number:
        // ");
        // x = scanner.nextInt();
        // }
        // if (x % 2 == 0) {
        // System.out.println(x + " - this is an even number.");
        // } else {
        // System.out.println(x + " - this is an odd number.");
        // }

        // 14
        // int a;
        // int b;
        // int factorial = 1;
        // try (Scanner scanner = new Scanner(System.in)) {
        // System.out.println("Enter an integer to calculate it's factorial: ");
        // a = scanner.nextInt();
        // }
        // if (a < 0) {
        // System.out.println("Number should be non-negative.");
        // } else {
        // for (b = 1; b <= a; b++) {
        // factorial = factorial * b;
        // }
        // System.out.println("Factorial of " + a + " is " + factorial);
        // }

        // 14 : factorial for large number
        // int number;
        // int calculation;
        // BigInteger increasing = new BigInteger("1");
        // BigInteger factorial = new BigInteger("1");
        // try (Scanner scanner = new Scanner(System.in)) {
        // System.out.println("Input an integer: ");
        // number = scanner.nextInt();
        // }
        // for (calculation = 1; calculation <= number; calculation++) {
        // factorial = factorial.multiply(increasing);
        // increasing = increasing.add(BigInteger.ONE);
        // }
        // System.out.println(number + "! = " + factorial);

        // 15
        // String s1;
        // String s2;
        // try (Scanner scanner = new Scanner(System.in)) {
        // System.out.println("Enter the first String: ");
        // s1 = scanner.nextLine();
        // System.out.println("Enter the second String: ");
        // s2 = scanner.nextLine();
        // }
        // if (s1.compareTo(s2) > 0) {
        // System.out.println("First String is greater than Second String.");
        // } else if (s1.compareTo(s2) < 0) {
        // System.out.println("First String is smaller than Second String.");
        // } else {
        // System.out.println("Both Strings are equal.");
        // }

        // // 16
        // int a;
        // for (a = 1; a <= 5; a++) {
        // System.out.println(a);
        // }

        // 17
        // int row;
        // int numberOfStars;
        // for (row = 1; row <= 10; row++) {
        // for (numberOfStars = 1; numberOfStars <= row; numberOfStars++) {
        // System.out.print("*");
        // }
        // System.out.println();
        // }

        // 18

        // 19
        // int n;
        // try (Scanner scanner = new Scanner(System.in)) {
        // System.out.println("Input an integer: ");

        // while ((n = scanner.nextInt()) != 0) {
        // System.out.println("You entered: " + n);
        // System.out.println("Input an integer: ");
        // }
        // }
        // System.out.println("Out of loop.");

        // 20
        // int number;
        // int reverse = 0;
        // try (Scanner scanner = new Scanner(System.in)) {
        //     System.out.println("Enter the number to reverse: ");
        //     number = scanner.nextInt();
        // }
        // while (number != 0) {
        //     reverse = reverse * 10;
        //     reverse = reverse + number % 10;
        //     number = number / 10;
        // }
        // System.out.println("Reverse of entered number is: " + reverse);
    }
}
