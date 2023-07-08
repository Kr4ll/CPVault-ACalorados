public class Kata {
  public static String tripleTrouble(String one, String two, String three) {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < one.length(); i++)
      sb.append(one.charAt(i))
        .append(two.charAt(i)).append(three.charAt(i));
    return sb.toString();
  }
}
