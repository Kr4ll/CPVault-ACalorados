public class Kata {
public static String add(String a, String b) {
        int carry = 0, sum = 0, i = 0, n = Math.max(a.length(), b.length());
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        int[] result = new int[n + 1];
        for (i = 0; i < a.length(); i++)
            arr1[n - a.length() + i] = a.charAt(i) - '0';
        for (i = 0; i < b.length(); i++)
            arr2[n - b.length() + i] = b.charAt(i) - '0';
        for (i = n - 1; i >= 0; i--) {
            sum = arr1[i] + arr2[i] + carry;
            result[i + 1] = sum % 10;
            carry = sum / 10;
        }
        result[0] = carry;
        StringBuilder sb = new StringBuilder();
        for (int digit : result)
            sb.append(digit);
        i = 0;
        while (i < sb.length() - 1 && sb.charAt(i) == '0')
            i++;
        return sb.substring(i);
  }
}
