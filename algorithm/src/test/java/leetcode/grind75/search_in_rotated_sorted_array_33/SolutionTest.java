package leetcode.grind75.search_in_rotated_sorted_array_33;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private Solution sut;

    @BeforeEach
    void setUp() {
        sut = new Solution();
    }

    @Test
    public void case1() {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        int expect = 4;

        Assertions.assertEquals(expect, sut.search(nums, target));
    }

    @Test
    public void case2() {
        int[] nums = {4,5,6,7,0,1,2};
        int target = 3;
        int expect = -1;

        Assertions.assertEquals(expect, sut.search(nums, target));
    }

    @Test
    public void case3() {
        int[] nums = {1};
        int target = 0;
        int expect = -1;

        Assertions.assertEquals(expect, sut.search(nums, target));
    }

}