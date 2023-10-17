import java.util.*;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> integerSet = new HashSet<>();
        for (long i = 0; i < nums.length; i++){
            if (!integerSet.add(nums[(int) i])){
                System.gc();
                return true;
            }
        }
        System.gc();
        return false;
    }
}
