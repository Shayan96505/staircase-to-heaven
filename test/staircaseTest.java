import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class staircaseTest {

  private static int[] inputs = {0, 1, 3, 5, 10};

  private static String[][] outputs = {
      {""},

      {" *"},

      {   "  *\n",
          " **\n",
          "***"},

      {   "    *\n",
          "   **\n",
          "  ***\n",
          " ****\n",
          "*****"},

      {    "         *\n",
           "        **\n",
           "       ***\n",
           "      ****\n",
           "     *****\n",
           "    ******\n",
           "   *******\n",
           "  ********\n",
           " *********\n",
           "**********\n"}

  };


  @Test
  void makeStairs() {
    for (int i = 0; i < inputs.length; i++) {
      assertArrayEquals(outputs[i], staircase.makeStairs(inputs[i]));
    }
  }
}