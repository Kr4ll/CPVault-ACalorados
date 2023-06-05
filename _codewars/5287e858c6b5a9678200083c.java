public class NumberUtils {
    // Iterative solution to improve some time computing
    public static boolean isNarcissistic(int number) {
      final char[] trimNumber = Integer.toString(number).toCharArray();
      long acc = 0;
      final int numberLength = trimNumber.length;
      for (char c : trimNumber) {
        acc += Math.pow(c - '0', numberLength);
        if (acc > number)
          return false;
      }
      return acc == number;
    }
}
