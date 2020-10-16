public class Tiktok {

  private static double hourHandAngle;
  private static double hourHandDegree;

  public static double getMinuteHandAngle(double minutes) {

    double minuteHandAngle = (minutes * 6);

    return minuteHandAngle;
  }

  public static double getHourHandAngle(int hours, double minutes){
    if (hours >= 12) {
      hourHandDegree = hours - 12;
    }
    if (hours < 12){
      hourHandDegree = hours;
    }
    hourHandAngle = ((hourHandDegree * 30) + (.5 * minutes));

    return hourHandAngle;
  }
}
