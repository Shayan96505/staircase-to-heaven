import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CubesTest {

  private static final long[] cubeTestInput = {
      0,
      -1,
      4096,
      549755813888L,
      4,
      65536,
  };

  private static final boolean[] cubeTestExpected = {
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