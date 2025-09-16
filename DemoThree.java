import java.math.BigInteger;
import java.util.Scanner;

public class DemoThree {
    public static void main(String[] args) {

        // 1
        // System.out.println("Hello world by Rezvi.");

        // 2
        // int c;
        // for (c = 1; c <= 5; c++) {
        // System.out.println(c);
        // }

        // 3
        // for (String t : args) {
        // System.out.println(t);
        // }

        // 4
        // int i;
        // float f;
        // String s;
        // try (Scanner scanner = new Scanner(System.in)) {
        // System.out.println("Enter a String: ");
        // s = scanner.nextLine();

        // System.out.println("Enter a Float: ");
        // f = scanner.nextFloat();

        // System.out.println("Enter an Integer: ");
        // i = scanner.nextInt();

        // System.out.println("Your entered String: " + s);
        // System.out.println("Your entered Float: " + f);
        // System.out.println("Your entered Integer: " + i);
        // }

        // // 5
        // float temperature;
        // try (Scanner scanner = new Scanner(System.in)) {
        // System.out.println("Enter temperature in Fahrenheit: ");
        // temperature = scanner.nextFloat();
        // }
        // temperature = ((temperature - 32) * 5) / 9;
        // System.out.println("Temperature in Celsius: " + temperature);

        // // 6
        // int a;
        // int b;
        // int temp;
        // System.out.println("Enter a and b: ");
        // try (Scanner scanner = new Scanner(System.in)) {
        // a = scanner.nextInt();
        // b = scanner.nextInt();
        // }
        // System.out.println("Before Swapping \na = " + a + " \nb = " + b);
        // temp = a;
        // a = b;
        // b = temp;
        // System.out.println("After Swapping \na = " + a + " \nb = " + b);

        // // 7
        // int a;
        // int b;
        // System.out.println("Enter a and b: ");
        // try(Scanner scanner = new Scanner(System.in)){
        // a = scanner.nextInt();
        // b = scanner.nextInt();
        // }
        // System.out.println("Before Swapping \na = " + a + " \nb = " + b);
        // a = a * b;
        // b = a / b;
        // a = a / b;
        // System.out.println("After Swapping \na = " + a + " \nb = " + b);

        // 8
        // // small number:
        // int a;
        // int b;
        // int sum;
        // System.out.println("Enter two integers to calculate their sum: ");
        // try (Scanner scanner = new Scanner(System.in)) {
        // a = scanner.nextInt();
        // b = scanner.nextInt();
        // }
        // sum = a + b;
        // System.out.println("Sum of entered integers = " + sum);

        // // for large number:
        // String numberOne;
        // String numberTwo;
        // try (Scanner scanner = new Scanner(System.in)) {
        // System.out.println("Enter first large number: ");
        // numberOne = scanner.nextLine();
        // System.out.println("Enter second large number: ");
        // numberTwo = scanner.nextLine();
        // }
        // BigInteger first = new BigInteger(numberOne);
        // BigInteger second = new BigInteger(numberTwo);
        // BigInteger sum = first.add(second);
        // System.out.println("Result of addition = " + sum);

        // // 9
        // int a;
        // int b;
        // int c;
        // System.out.println("Enter three(3) integers: ");
        // try (Scanner scanner = new Scanner(System.in)) {
        // a = scanner.nextInt();
        // b = scanner.nextInt();
        // c = scanner.nextInt();
        // }
        // if (a > b && a > c) {
        // System.out.println("First number is largest.");
        // } else if (b > a && b > c) {
        // System.out.println("Second number is largest.");
        // } else {
        // System.out.println("Third number is largest.");
        // }

        // // 10
        // boolean learning = true;
        // if (learning) {
        // System.out.println("Java Programmer");
        // } else {
        // System.out.println("What are you doing here?");
        // }

        // // 11
        // int marksObtained;
        // int passingMarks = 40;
        // try (Scanner scanner = new Scanner(System.in)) {
        // System.out.println("Input marks scored by you: ");
        // marksObtained = scanner.nextInt();
        // }
        // if (marksObtained >= passingMarks) {
        // System.out.println("You passed the exam.");
        // } else {
        // System.out.println("Unfortunately, you failed to pass the exam.");
        // }

        // 12
        // int marksObtained;
        // int passingMarks = 40;
        // char grade;
        // try (Scanner scanner = new Scanner(System.in)) {
        // System.out.println("Input marks scored by you: ");
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
        // System.out.println("You passed the exam and your grade is: " + grade);
        // } else {
        // grade = 'F';
        // System.out.println("You failed and your grade is: " + grade);
        // }

        // 13
        // int x;
        // System.out.println("Enter an integer to check if it is odd or even number:
        // ");
        // try (Scanner scanner = new Scanner(System.in)) {
        // x = scanner.nextInt();
        // }
        // if (x % 2 == 0) {
        // System.out.println("You entered an even number and the number: " + x);
        // } else {
        // System.out.println("You entered an odd number and the number: " + x);
        // }

        // 14
        // int a;
        // int b;
        // int factorial = 1;
        // System.out.println("Enter an integer to calculate it's factorial: ");
        // try (Scanner scanner = new Scanner(System.in)) {
        // a = scanner.nextInt();
        // }
        // if (a < 0) {
        // System.out.println("Number should be non-negative.");
        // } else {
        // for (b = 1; b <= a; b++) {
        // factorial = factorial * b;
        // }
        // System.out.println("Factorial of " + a + " is = " + factorial);
        // }

        // factorial for large number
        // int a;
        // int b;
        // BigInteger increasing = new BigInteger("1");
        // BigInteger factorial = new BigInteger("1");
        // try (Scanner scanner = new Scanner(System.in)) {
        // System.out.println("Input an Integer: ");
        // a = scanner.nextInt();
        // }
        // for (b = 1; b <= a; b++) {
        // factorial = factorial.multiply(increasing);
        // increasing = increasing.add(BigInteger.ONE);
        // }
        // System.out.println(a + "! = " + factorial);

        // 15
        // String one;
        // String two;
        // try (Scanner scanner = new Scanner(System.in)) {
        // System.out.println("Enter two Strings: ");
        // one = scanner.nextLine();
        // two = scanner.nextLine();
        // }
        // if (one.compareTo(two) > 0) {
        // System.out.println("First String is grater than Second String.");
        // } else if (one.compareTo(two) < 0) {
        // System.out.println("First String is smaller than Second String");
        // } else {
        // System.out.println("Both Strings are equal.");
        // }

        // 16
        // int c;
        // for (c = 1; c <= 4; c++) {
        // System.out.println(c);
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
        // System.out.print("Input an Integer: ");
        // while ((n = scanner.nextInt()) != 0) {
        // System.out.println("You entered: " + n);
        // System.out.print("Input an integer: ");
        // }
        // }
        // System.out.println("Out of loop.");

        // 20
        int number;
        int reverse = 0;
        System.out.print("Enter the number to reverse: ");
        try (Scanner scanner = new Scanner(System.in)) {
            number = scanner.nextInt();
        }
        while (number != 0) {
            reverse = reverse * 10;
            reverse = reverse + number % 10;
            number = number / 10;
        }
        System.out.println("Reverse of the entered number is: " + reverse);
    }
}