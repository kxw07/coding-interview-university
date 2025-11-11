package leetcode.easy.remove_duplicates_from_sorted_array_26;

import leetcode.easy.remove_duplicates_from_sorted_array_26.Solution;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private Solution sut;

    @BeforeEach
    public void setup() {
        sut = new Solution();
    }

    @Test
    public void case1() {
        int[] nums = {1, 1, 2};
        int expectedK = 2;
        int[] expectedNums = {1, 2};

        Assertions.assertEquals(expectedK, sut.removeDuplicates(nums));
        for (int i = 0; i < expectedK; i++) {
            Assertions.assertEquals(expectedNums[i], nums[i]);
        }
    }

    @Test
    public void case2() {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int expectedK = 5;
        int[] expectedNums = {0, 1, 2, 3, 4};

        Assertions.assertEquals(expectedK, sut.removeDuplicates(nums));

        for (int i = 0; i < expectedK; i++) {
            Assertions.assertEquals(expectedNums[i], nums[i]);
        }
    }

}