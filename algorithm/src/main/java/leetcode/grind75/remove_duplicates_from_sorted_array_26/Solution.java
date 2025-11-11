package leetcode.grind75.remove_duplicates_from_sorted_array_26;

public class Solution {
    public int removeDuplicates(int[] nums) {
        int unduplicatedElements = 0;
        int lastElement = -999;

        // total: O(N)
        // O(N)
        for (int idx = 0; idx < nums.length; idx++) {
            // O(1)
            if (nums[idx] == lastElement) {
                nums[idx] = 999;
            } else {
                lastElement = nums[idx];
                unduplicatedElements++;
            }
        }

        // total: O(N^2)
        // O(N)
        for (int outsideIdx = 0; outsideIdx < nums.length; outsideIdx++) {
            // O(N)
            for (int insideIdx = outsideIdx + 1; insideIdx < nums.length; insideIdx++) {
                // O(1)
                if (nums[outsideIdx] > nums[insideIdx]) {
                    int temp = nums[outsideIdx];
                    nums[outsideIdx] = nums[insideIdx];
                    nums[insideIdx] = temp;
                }
            }
        }

        // O(N) + O(N^2) = O(N^2)

        return unduplicatedElements;
    }
}
