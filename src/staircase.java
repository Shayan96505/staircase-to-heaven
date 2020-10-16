public class staircase {


  public static String[] makeStairs(int length) {


    String [] steps = new String [length];
    StringBuilder spaces = new StringBuilder();
    StringBuilder asterisks = new StringBuilder();

    for(int i = 0; i < length; i++){
      for(int j = 1; j < length - i ; j++) {

        spaces.append(" ");


      }

      asterisks.append("*");

      steps[i] = spaces + asterisks.toString();

      spaces = new StringBuilder();

      System.out.println(steps[i]);
    }
    return steps;
  }
}