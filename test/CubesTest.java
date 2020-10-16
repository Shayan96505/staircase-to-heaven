import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CubesTest {

  private static final long[] cubeTestInput = {
      -1,
      0,
      1,
      8,
      27,
      28,
      2909384758475845L
  };

  private static final boolean[] cubeTestExpected = {
      true,
      true,
      true,
      true,
      true,
      false,
      false,
  };



  @Test
  void isCube() {
    for (int i = 0; i < cubeTestInput.length; i++) {
      assertEquals(cubeTestExpected[i], Cubes.isCube((cubeTestInput[i])));
    }
  }
}