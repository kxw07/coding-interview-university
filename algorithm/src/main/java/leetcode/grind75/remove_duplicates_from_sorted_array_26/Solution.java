package leetcode.grind75.remove_duplicates_from_sorted_array_26;

public class Solution {
    public int removeDuplicates(int[] nums) {
        if (1 == nums.length) {
            return 1;
        }

        int lastElement = -999;
        int unduplicatedIndex = 0;

        // O(N)
        for (int idx = 0; idx < nums.length; idx++) {
            // O(1)
            if (nums[idx] != lastElement) {
                lastElement = nums[idx];
                nums[unduplicatedIndex] = nums[idx];
                unduplicatedIndex++;
            }
        }

        return unduplicatedIndex;
    }
}
