package leetcode.easy.merge_sorted_array_88;

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
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;
        int[] expected = {1, 2, 2, 3, 5, 6};

        sut.merge(nums1, m, nums2, n);

        Assertions.assertArrayEquals(expected, nums1);
    }

    @Test
    public void case2() {
        int[] nums1 = {1};
        int m = 1;
        int[] nums2 = {};
        int n = 0;
        int[] expected = {1};

        sut.merge(nums1, m, nums2, n);

        Assertions.assertArrayEquals(expected, nums1);
    }

    @Test
    public void case3() {
        int[] nums1 = {0};
        int m = 0;
        int[] nums2 = {1};
        int n = 1;
        int[] expected = {1};

        sut.merge(nums1, m, nums2, n);

        Assertions.assertArrayEquals(expected, nums1);
    }

    @Test
    public void case4() {
        int[] nums1 = {0,0,0,0,0};
        int m = 0;
        int[] nums2 = {1,2,3,4,5};
        int n = 5;
        int[] expected = {1,2,3,4,5};

        sut.merge(nums1, m, nums2, n);

        Assertions.assertArrayEquals(expected, nums1);
    }

    @Test
    public void case5() {
        int[] nums1 = {2,0};
        int m = 1;
        int[] nums2 = {1};
        int n = 1;
        int[] expected = {1,2};

        sut.merge(nums1, m, nums2, n);

        Assertions.assertArrayEquals(expected, nums1);
    }

}