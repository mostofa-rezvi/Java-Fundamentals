import java.util.Scanner;

public class DemoFour {
    public static void main(String[] args) {

        // 21
        // int a;
        // try (Scanner scanner = new Scanner(System.in)) {
        // while (true) {
        // System.out.println("Input an integer: ");
        // a = scanner.nextInt();
        // if (a == 0) {
        // break;
        // }
        // System.out.println("You entered: " + a);
        // }
        // }

        // 22
        // int a;
        // try (Scanner scanner = new Scanner(System.in)) {
        // while (true) {
        // System.out.println("Input an integer: ");
        // a = scanner.nextInt();
        // if (a != 0) {
        // System.out.println("You entered: " + a);
        // } else {
        // break;
        // }
        // }
        // }

        // 23
        // char alphabet;
        // for (alphabet = 'A'; alphabet <= 'Z'; alphabet++) {
        // System.out.print(alphabet + " ");
        // }

        // 24
        // int numbers[] = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29 };
        // for (int t : numbers) {
        // System.out.print(t + " ");
        // }

        // 25
        // int a;
        // int b;
        // System.out.println("Enter an integer to print it's multiplication table: ");
        // try (Scanner scanner = new Scanner(System.in)) {
        // a = scanner.nextInt();
        // System.out.println("Multiplication table of " + a + " is: ");
        // for (b = 1; b <= 10; b++) {
        // System.out.println(a + "*" + b + " = " + (a * b));
        // }
        // }

        // 26
        // int a;
        // int status = 1;
        // int number = 3;
        // try (Scanner scanner = new Scanner(System.in)) {
        // System.out.println("Enter the number of prime numbers you want: ");
        // a = scanner.nextInt();
        // }
        // if (a >= 1) {
        // System.out.println("First " + a + " prime number are: ");
        // System.out.println(2);
        // }
        // int count = 2;
        // while (count <= a) {
        // for (int b = 2; b <= Math.sqrt(number); b++) {
        // if (number % b == 0) {
        // status = 0;
        // break;
        // }
        // }
        // if (status != 0) {
        // System.out.println(number);
        // count++;
        // }
        // status = 1;
        // number++;
        // }

        // 27
        // Armstrong Number
        // // // // //
        // int number;
        // int sum = 0;
        // int temp;
        // int remainder;
        // int digits = 0;
        // try (Scanner scanner = new Scanner(System.in)) {
        // System.out.println("Input a number to check if it is an Armstrong number or
        // not.");
        // number = scanner.nextInt();
        // }
        // temp = number;
        // while (temp != 0) {
        // digits++;
        // temp = temp / 10;
        // }
        // temp = number;
        // while (temp != 0) {
        // remainder = temp % 10;
        // sum = sum + power(remainder, digits); // power methods writes in the last
        // temp = temp / 10;
        // }
        // if (number == sum) {
        // System.out.println(number + " is an Armstrong number.");
        // } else {
        // System.out.println(number + " is not an Armstrong number.");
        // }

        // 28
        // Floyd's Triangle
        // // // // //
        // int a;
        // int number = 1;
        // int c;
        // int d;
        // try (Scanner scanner = new Scanner(System.in)) {
        // System.out.println("Enter the number of rows of floyd's triangle you want:
        // ");
        // a = scanner.nextInt();
        // }
        // System.out.println("Floyd's triangle: ");
        // for (c = 1; c <= a; c++) {
        // for (d = 1; d <= c; d++) {
        // System.out.print(number + " ");
        // number++;
        // }
        // System.out.println();
        // }

        // 29
        // Find all substring fo string
        // // // // //
        // String string;
        // String subString;
        // int i;
        // int c;
        // int length;
        // try (Scanner scanner = new Scanner(System.in)) {
        // System.out.println("Enter a string to print it's all substrings: ");
        // string = scanner.nextLine();
        // }
        // length = string.length();
        // System.out.print("Substrings of \"" + string + "\" are: ");
        // for (i = 0; i < length; i++) {
        // for (c = 1; c <= length - i; c++) {
        // subString = string.substring(i, i + c);
        // System.out.println(subString);
        // }
        // }

        // 30
        // Reverse String
        // // // // //
        String original;
        String reverse = "";
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter a string to reverse: ");
            original = scanner.nextLine();
        }
        int length = original.length();
        for (int i = length - 1; i >= 0; i--) {
            reverse = reverse + original.charAt(i);
        }
        System.out.println("Reverse of entered string is: " + reverse);
        StringBuffer a = new StringBuffer("Java programming is fun");
        System.out.println("Another sentence: " + a.reverse());

    }

    // static int power(int number, int random) {
    // int c;
    // int p = 1;
    // for (c = 1; c <= random; c++) {
    // p = p * number;
    // }
    // return p;
    // }
}
