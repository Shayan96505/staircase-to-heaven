import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TiktokTest {

  private static final double[] getMinuteHandAngleInput = {
      0,
      15,
      30,
      42,
      27.5,
  };

  private static final int[] getHourHandAngleInput = {
      0,
      3,
      12,
      19,
      21
  };

  private static final double[] minuteHandAngleOutput = {
      0,
      90,
      180,
      252,
      165,
  };

  private static final double[] hourHandAngleOutput = {
      0,
      97.5,
      15,
      231,
      283.75,
  };


  @Test
  void getMinuteHandAngle() {
    for (int i = 0; i < getMinuteHandAngleInput.length; i++){
      assertEquals(Tiktok.getMinuteHandAngle(getMinuteHandAngleInput[i]),minuteHandAngleOutput[i]);
    }
  }

  @Test
  void getHourHandAngle() {
    for (int i = 0; i < getHourHandAngleInput.length; i++){
      assertEquals(
          Tiktok.getHourHandAngle(getHourHandAngleInput[i], getMinuteHandAngleInput[i])
          ,hourHandAngleOutput[i]);
    }
  }
}