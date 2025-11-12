package leetcode.medium.three_sum_15;

import java.util.*;

public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> result = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            if (nums[i] > 0) break;

            int head = i + 1;
            int tail = nums.length - 1;

            while (head < tail) {
                int sum = nums[i] + nums[head] + nums[tail];

                if (sum == 0) {
                    List<Integer> triplet = Arrays.asList(nums[i], nums[head], nums[tail]);
                    result.add(triplet);
                    head++;
                    tail--;
                    while (head < tail && nums[head] == nums[head - 1]) {
                        head++;
                    }
                    while (head < tail && nums[tail] == nums[tail + 1]) {
                        tail--;
                    }
                } else if (sum > 0) {
                    tail--;
                } else if (sum < 0) {
                    head++;
                }
            }
        }

        return new ArrayList<>(result);
    }
}
