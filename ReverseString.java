import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        String reverse = "";
        String original;
        int length;
        int i;

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter a string to reverse: ");
            original = scanner.nextLine();
        }

        length = original.length();

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