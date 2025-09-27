import java.util.Scanner;

public class FirstNoRepeat {
    public static void main(String[] args) {
        System.out.println();
        String string;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter String:: ");
            string = scanner.nextLine();
        }
        System.out.println("Answer is:: " + firstNonRepeatingNumber(string));
    }

    public static String firstNonRepeatingNumber(String string) {

        int i;
        String result = "";
        for (i = 0; i < string.length(); i++) {
            int count = 0;
            if (string.charAt(i) != ' ') {
                int j;
                for (j = 0; j < string.length(); j++) {
                    if (string.charAt(i) == string.charAt(j) && i != j) {
                        count++;
                        break;
                    }
                }
                if (count == 0) {
                    result += string.charAt(i);
                    break;
                }
            }
        }
        return result;
    }
}
