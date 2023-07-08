public class Consonants {
  public static int getCount(String str) {
    return str.replaceAll("[^a-zA-Z]", "").replaceAll("[AEIOUaeiou]", "").length();
  }
}
