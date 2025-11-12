package leetcode.grind75.search_in_rotated_sorted_array_33;

public class Solution {
    public int search(int[] nums, int target) {
        if (nums.length == 1) {
            return target == nums[0] ? 0 : -1;
        }

        return search(nums, 0, nums.length - 1, target);
    }

    private int search(int[] nums, int head, int tail, int target) {
        int mid = (head + tail) / 2;

        if (mid == head || mid == tail) {
            if (target == nums[head]) {
                return head;
            } else if (target == nums[tail]) {
                return tail;
            } else {
                return -1;
            }
        }

        if (target == nums[mid]) {
            return mid;
        }

        if (nums[tail] > nums[head]) {
            if (target > nums[mid]) {
                return search(nums, mid, tail, target);
            } else {
                return search(nums, head, mid, target);
            }
        } else {
            if (target > nums[mid]) {
                if (target <= nums[tail] || nums[mid] > nums[tail]) {
                    return search(nums, mid, tail, target);
                } else {
                    return search(nums, head, mid, target);
                }

            } else {
                if (target >= nums[head] || nums[mid] < nums[head]) {
                    return search(nums, head, mid, target);
                } else {
                    return search(nums, mid, tail, target);
                }
            }
        }
    }
}
