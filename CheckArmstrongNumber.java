import java.util.Scanner;

public class CheckArmstrongNumber {
    public static void main(String[] args) {
        int number;
        int sum = 0;
        int temp;
        int remainder;
        int digits = 0;

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Input a number to check if it is an Armstrong number: ");
            number = scanner.nextInt();
        }

        temp = number;
        while (temp != 0) {
            digits++;
            temp = temp / 10;
        }

        temp = number;
        while (temp != 0) {
            remainder = temp % 10;
            sum = sum + power(remainder, digits);
            temp = temp / 10;
        }

        if (number == sum) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }

    static int power(int number, int random) {
        int c;
        int p = 1;

        for (c = 1; c <= random; c++) {
            p = p * number;
        }

        return p;
    }
}
