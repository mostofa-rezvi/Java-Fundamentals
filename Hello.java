class Hello {
  public static void main(String[] args) {
    System.out.println("Hello World");

    int number1 = 4;
    int number2 = 8;
    int result = number1 + number2;
    System.out.println(result);

    int number = 10;
    byte byt = 127;
    short sh = 40;
    long lg = 50l; // l - use

    float ft = 5.5f; // f - use
    double dl = 10.5;

    char c = 'A'; // donot use " "

    boolean bool = true;

    System.out.println(" int: " + number + " \n byte: " + byt + " \n short: " + sh + " \n long: " + lg + " \n float: "
        + ft + " \n double: " + dl + " \n char: " + c + " \n boolean: " + bool);

    int number11 = 0b101;
    System.out.println(number11);

    int number12 = 0xE7;
    System.out.println(number12);

    int number13 = 100_000_000;
    System.out.println(number13);

    double number14 = 55;
    System.out.println(number14);

    double number15 = 5e2;
    System.out.println(number15);

    char ch1 = 'a';
    ch1++;
    System.out.println(ch1);
    ch1++;
    System.out.println(ch1);
  
    byte b = 127;
    int a = b;
    System.out.println(a);

    // type casting
    int a1 = 12;
    byte k = (byte) a1;
    System.out.println(k);

    // type convertion
    byte number21 = 10;
    byte number22 = 30;
    int result2 = number21 * number22;
    System.out.println(result2);
  }
}