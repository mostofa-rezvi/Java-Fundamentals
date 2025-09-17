import java.util.Scanner;

public class ListOfPrimeNumber {
    public static void main(String[] args) {

        int n;
        int status = 1;
        int number = 3;
        int count = 2;

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter the number of prime numbers you want: ");
            n = scanner.nextInt();
        }

        if (n >= 1) {
            System.out.println("First " + n + " prime numbers are: ");
            System.out.println(2);
        }

        while (count <= n) {
            for (int x = 2; x <= Math.sqrt(number); x++) {
                if (number % x == 0) {
                    status = 0;
                    break;
                }
            }

            if (status != 0) {
                System.out.println(number);
                count++;
            }
            status = 1;
            number++;
        }

    }
}
