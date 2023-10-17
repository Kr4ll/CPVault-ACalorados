import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> integerIntegerMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (integerIntegerMap.containsKey(complement))
                return new int[] { integerIntegerMap.get(complement), i };
            integerIntegerMap.put(nums[i], i);
        }
        return new int[0];
    }
}
