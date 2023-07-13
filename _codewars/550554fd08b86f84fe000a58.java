import java.util.*;

public class WhichAreIn { 
	
	public static String[] inArray(String[] array1, String[] array2) {
		List<String> sol = new ArrayList<>();
		for (String s : array1) {
			if (Arrays.toString(array2).contains(s))
				sol.add(s);
		}
		Collections.sort(sol);
		return sol.toArray(new String[0]);
	}
}
