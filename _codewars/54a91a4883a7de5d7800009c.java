import java.math.BigInteger;

public class Kata {
  public static String incrementString(String str) {
    StringBuilder sb = new StringBuilder(str);
    int i;
    if (sb.isEmpty())
      return "1";
    if (!Character.isDigit(sb.charAt(sb.length() - 1)))
      return sb.append("1").toString();
    i = sb.length() - 1;
    while(i >= 0 && Character.isDigit(sb.charAt(i)))
      i--;
    return sb.substring(0, i + 1) + String.format("%0" + sb.substring(i + 1).length() + "d",
            new BigInteger(sb.substring(i + 1)).add(BigInteger.ONE));
  }
}
