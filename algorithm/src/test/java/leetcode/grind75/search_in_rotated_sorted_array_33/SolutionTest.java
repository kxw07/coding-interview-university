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
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
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

    @Test
    public void case4() {
        int[] nums = {1, 3, 5};
        int target = 1;
        int expect = 0;

        Assertions.assertEquals(expect, sut.search(nums, target));
    }

    @Test
    public void case5() {
        int[] nums = {1, 3, 5};
        int target = 5;
        int expect = 2;

        Assertions.assertEquals(expect, sut.search(nums, target));
    }

    @Test
    public void case6() {
        int[] nums = {4, 5, 6, 7, 8, 1, 2, 3};
        int target = 8;
        int expect = 4;

        Assertions.assertEquals(expect, sut.search(nums, target));
    }

    @Test
    public void case7() {
        int[] nums = {3, 5, 1};
        int target = 3;
        int expect = 0;

        Assertions.assertEquals(expect, sut.search(nums, target));
    }

}