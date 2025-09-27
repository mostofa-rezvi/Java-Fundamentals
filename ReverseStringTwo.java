import java.util.Scanner;

public class ReverseStringTwo {
    public static void main(String[] args) {

        // Idea: 1
        String value;
        int i;

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter String to Reverse: ");
            value = scanner.nextLine();
        }

        for (i = value.length() - 1; i >= 0; i--) {
            System.out.print(value.charAt(i));
        }

        // Idea: 2
        String string;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter String to Reverse: ");
            string = scanner.nextLine();
        }

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder.reverse();

        System.out.println(stringBuilder);

    }
}