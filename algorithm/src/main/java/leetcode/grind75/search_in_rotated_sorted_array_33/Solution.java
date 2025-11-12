package leetcode.grind75.search_in_rotated_sorted_array_33;

public class Solution {
    public int search(int[] nums, int target) {
        if (nums.length == 1) {
            return target == nums[0]? 0: -1;
        }


        int resultIndex = -1;

        int head = 0;
        int tail = nums.length - 1;

        while(head < tail) {
            if (target == nums[head]) {
                return head;
            }

            if (target == nums[tail]) {
                return tail;
            }

            if (Math.abs((target - nums[head])) < Math.abs((target - nums[tail]))) {
                head++;
            } else {
                tail--;
            }
        }

        return resultIndex;
    }
}
