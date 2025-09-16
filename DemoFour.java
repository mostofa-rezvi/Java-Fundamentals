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
        int a;
        int b;
        System.out.println("Enter an integer to print it's multiplication table: ");
        try (Scanner scanner = new Scanner(System.in)) {
            a = scanner.nextInt();
            System.out.println("Multiplication table of " + a + " is: ");
            for (b = 1; b <= 10; b++) {
                System.out.println(a + "*" + b + " = " + (a * b));
            }
        }
    }
}
