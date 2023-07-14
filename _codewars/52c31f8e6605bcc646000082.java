import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> integerIntegerMap = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            int complement = target - numbers[i];
            if (integerIntegerMap.containsKey(complement))
                return new int[] { integerIntegerMap.get(complement), i };
            integerIntegerMap.put(numbers[i], i);
        }
        return new int[0];
    }
}
