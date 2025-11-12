package leetcode.grind75.search_in_rotated_sorted_array_33;

public class Solution {
    public int search(int[] nums, int target) {
        if (nums.length == 1) {
            return target == nums[0] ? 0 : -1;
        }

        // O(log n), split to 1/2 every time
        return search(nums, target, 0, nums.length - 1);
    }

    private int search(int[] nums, int target, int head, int tail) {
        if (head > tail) return -1;
        int mid = head + (tail - head) / 2;

        if (target == nums[mid]) {
            return mid;
        }

        if (nums[mid] >= nums[head]) {
            if (target >= nums[head] && target <= nums[mid]) {
                return search(nums, target, head, mid - 1);
            } else {
                return search(nums, target, mid + 1, tail);
            }
        } else {
            if (target >= nums[mid] && target <= nums[tail]) {
                return search(nums, target, mid + 1, tail);
            } else {
                return search(nums, target, head, mid - 1);
            }
        }
    }
}
