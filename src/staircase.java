import java.util.Arrays;

public class staircase {


  public static String[] makeStairs(int length) {


    String [] steps = new String [length];
    String spaces = "";
    String asterisks = "";

    for(int i = 0; i < length; i++){
      for(int j = 1; j < length - i ; j++) {

        spaces += " ";


      }

      asterisks += "*";

      steps[i] = spaces + asterisks;

      spaces = "";

      System.out.println(steps[i]);
    }
    return steps;
  }
}