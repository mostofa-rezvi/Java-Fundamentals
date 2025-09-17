import java.util.Scanner;

public class FloydTriangle {
    public static void main(String[] args) {
        int n;
        int number = 1;
        int c;
        int d;

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter the number of rows of floyd's triangle you want: ");
            n = scanner.nextInt();
        }

        System.out.println("Floyd's Triangle: ");

        for (c = 1; c <= n; c++) {
            for (d = 1; d <= c; d++) {
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }
    }
}
