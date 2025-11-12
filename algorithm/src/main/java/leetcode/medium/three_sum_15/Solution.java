package leetcode.medium.three_sum_15;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if (nums.length < 3) {
            return new ArrayList<>();
        }

        int firstNumberPointer = 0;
        int secondaryNumberPointer = 1;
        int thirdNumberPointer = 2;

        List<List<Integer>> result = new ArrayList<>();

        while (firstNumberPointer < (nums.length - 2)) {
            List<Integer> temp = new ArrayList<>();
            int sum = nums[firstNumberPointer] + nums[secondaryNumberPointer] + nums[thirdNumberPointer];

            if (sum == 0) {
                temp.add(nums[firstNumberPointer]);
                temp.add(nums[secondaryNumberPointer]);
                temp.add(nums[thirdNumberPointer]);
                result.add(temp);
            }

            thirdNumberPointer++;
            if (thirdNumberPointer == nums.length) {
                secondaryNumberPointer++;
                thirdNumberPointer = secondaryNumberPointer + 1;

                if (secondaryNumberPointer == nums.length - 1) {
                    firstNumberPointer++;
                    secondaryNumberPointer = firstNumberPointer + 1;
                    thirdNumberPointer = secondaryNumberPointer + 1;
                }
            }
        }

        int max = result.size();
        int index = 0;
        while (max > 0 && index < result.size()) {
            List<Integer> first = result.get(index);
            first = first.stream().sorted().toList();

            for (int i = index + 1; i < result.size(); i++) {
                List<Integer> second = result.get(i);
                second = second.stream().sorted().toList();

                if (first.equals(second)) {
                    result.remove(i);
                    i--;
                }
            }

            max--;
            index++;
        }

        return result;
    }
}
