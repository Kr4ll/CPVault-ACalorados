public class CodeWars {
  // Iterative version using indexOf
  public static int strCount(String str, char letter) {
    int index = -1, counter = 0;
    while((index = str.indexOf(letter, index + 1)) != -1)
      counter++;
    return counter;
  }
}
