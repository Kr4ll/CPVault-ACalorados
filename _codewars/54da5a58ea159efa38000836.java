import java.util.HashMap;
import java.util.Map;

public class FindOdd {
	public static int findIt(int[] a) {
		Map<Integer, Integer> integerIntegerMap = new HashMap<>();
		for(int num: a)
			integerIntegerMap.put(num, integerIntegerMap.getOrDefault(num, 0) + 1);
		for(int num: a)
			if (integerIntegerMap.get(num) % 2 != 0)
				return num;
		return 0;
  }
}
