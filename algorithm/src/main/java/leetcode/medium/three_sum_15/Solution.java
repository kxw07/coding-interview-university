package leetcode.medium.three_sum_15;

import java.util.*;

public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<Integer> checked = new HashSet<>();
        Set<List<Integer>> result = new HashSet<>();
        Map<Integer, Integer> seen = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            seen.clear();

            if (checked.add(nums[i])) {

                for (int j = i + 1; j < nums.length; j++) {
                    int wantToFind = -(nums[i] + nums[j]);

                    if (seen.containsKey(wantToFind)) {
                        List<Integer> triplet = Arrays.asList(nums[i], nums[j], wantToFind);
                        Collections.sort(triplet);
                        result.add(triplet);
                    }

                    seen.put(nums[j], i);
                }
            }
        }

        return new ArrayList<>(result);
    }
}
