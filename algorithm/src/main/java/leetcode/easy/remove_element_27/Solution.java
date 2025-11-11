package leetcode.easy.remove_element_27;

public class Solution {
    public int removeElement(int[] nums, int val) {
        if (nums.length == 0) {
            return 0;
        }

        int shouldReplacedIndex = -1;

        // O(N)
        for (int idx = 0; idx < nums.length; idx++) {

            // O(1)
            if (nums[idx] != val) {
                nums[++shouldReplacedIndex] = nums[idx];
            }
        }

        return shouldReplacedIndex + 1;
    }
}
