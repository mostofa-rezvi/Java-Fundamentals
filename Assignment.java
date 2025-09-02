public class Assignment {
  public static void main(String[] args) {
    System.out.println("Assignment: \n");

    int number1 = 7;
    int number2 = 5;
    
    int result1 = number1 + number2;
    System.out.println(result1);

    int result2 = number1 - number2;
    System.out.println(result2);

    int result3 = number1 * number2;
    System.out.println(result3);

    int result4 = number1 / number2;
    System.out.println(result4);

    int result = number1 % number2;
    System.out.println(result);

    System.out.println("");
    number1 += 2;
    System.out.println(number1);
    number1++;
    number1 -= 2;
    System.out.println(number1);
    number1--;
    number1 *= 2;
    System.out.println(number1);
    number1++;
    number1 /= 2;
    --number1;
    System.out.println(number1);

  }
}
