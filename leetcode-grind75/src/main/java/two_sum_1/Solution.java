package two_sum_1;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> cache = new HashMap<>();

        for (int idxOutside = 0; idxOutside < nums.length; idxOutside++) {
            int diff = target - nums[idxOutside];

            if (cache.get(diff) != null) {
                return new int[]{idxOutside, cache.get(diff).intValue()};
            } else {
                cache.put(nums[idxOutside], idxOutside);
            }
        }

        return null;
    }
}
