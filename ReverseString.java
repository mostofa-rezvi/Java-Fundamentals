import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        String original;
        String reverse = "";

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter a string to reverse: ");
            original = scanner.nextLine();
        }

        int length = original.length();
        int i;

        for (i = length - 1; i >= 0; i--) {
            reverse = reverse + original.charAt(i);
        }

        System.out.println("Reverse of entered string is: " + reverse);
    }
}

class InvertString {
    public static void main(String[] args) {
        StringBuffer a = new StringBuffer("Java Programming is Fun");
        System.out.println(a.reverse());
    }
}