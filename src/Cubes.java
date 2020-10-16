import java.lang.*;

public class Cubes {

  public static boolean isCube(long input){

    long round = Math.round(Math.cbrt(input));
    double cubeRt = Math.cbrt(input);

    System.out.println(cubeRt);
    System.out.println(round);
    System.out.println((cubeRt - round));


    return ((cubeRt - round) == 0);
  }
}
