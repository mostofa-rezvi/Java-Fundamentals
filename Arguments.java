// 3. Command Line Argument - Program in Java

public class Arguments {
  public static void main(String[] args) {
    for (String t : args) {
      System.out.println(t);
    }
  }
}


// in terminal
// javac Arguments.java
// java Arguments hello world 123
// output:
// hello
// world
// 123

// args is like a "List of  words" here. 
// programs reads those words and uses them.
