package leetcode.medium.three_sum_15;

import java.util.*;

public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> result = new HashSet<>();

        nums = Arrays.stream(nums).sorted().toArray();

        for (int i = 0; i < nums.length; i++) {
            int head = i + 1;
            int tail = nums.length - 1;

            while (head < tail) {
                int sum = nums[i] + nums[head] + nums[tail];

                if (sum == 0) {
                    List<Integer> triplet = Arrays.asList(nums[i], nums[head], nums[tail]);
                    result.add(triplet);
                    head++;
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
