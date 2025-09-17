import java.util.Scanner;

public class FindSubstringOfString {
    public static void main(String[] args) {
        String string;
        String subString;

        int i;
        int c;
        int length;

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter a string to print it's all substrings: ");
            string = scanner.nextLine();
        }

        length = string.length();

        System.out.println("SubStrings of \"" + string + "\" are: ");

        for (c = 0; c < length; c++) {
            for (i = 1; i <= length - c; i++) {
                subString = string.substring(c, c + i);
                System.out.println(subString);
            }
        }
    }
}
