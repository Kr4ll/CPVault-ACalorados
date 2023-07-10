import java.util.regex.Pattern;
public class Solution {

	public static boolean validatePin(String pin) {
		try{
			Integer.parseInt(pin);
			Pattern pattern = Pattern.compile("\\d{4}|\\d{6}");
			return pattern.matcher(pin).matches();
		} catch (NumberFormatException e){
			return false;
		}
  }

}
