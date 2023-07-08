public class ScrollingTextMachine {
  public String[] rotate(String text) {
    String[] sol = new String[text.length()];
    StringBuilder textBuilder = new StringBuilder(text);
    for(int i = 0; i < text.length(); i++)
      sol[i] = textBuilder.append(textBuilder.charAt(0)).deleteCharAt(0).toString();
    return sol;
  }
}
