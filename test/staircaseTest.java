import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class staircaseTest {

  private static int[] inputs = {0, 1, 3, 5, 10};

  private static String[][] outputs = {
      {""},

      {" *"},

      {   "  *",
          " **",
          "***"},

      {   "    *",
          "   **",
          "  ***",
          " ****",
          "*****"},

      {   "         *",
          "        **",
          "       ***",
          "      ****",
          "     *****",
          "    ******",
          "   *******",
          "  ********",
          " *********",
          "**********"}

  };


  @Test
  void makeStairs() {

    for (int i = 0; i < inputs.length; i++) {
      assertArrayEquals(outputs, staircase.makeStairs(inputs[i]));
    }
  }
}