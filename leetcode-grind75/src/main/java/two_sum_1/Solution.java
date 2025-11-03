package two_sum_1;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int idxOutside = 0; idxOutside < nums.length; idxOutside++) {
            int diff = target - nums[idxOutside];

            for (int idxInside = idxOutside + 1; idxInside < nums.length; idxInside++) {
                if (diff == nums[idxInside]) {
                    return new int[]{idxOutside, idxInside};
                }
            }
        }

        return null;
    }
}
