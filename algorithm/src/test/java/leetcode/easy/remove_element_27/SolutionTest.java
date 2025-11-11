package leetcode.easy.remove_element_27;

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
        int[] nums = {3, 2, 2, 3};
        int shouldRemoveValue = 3;

        int[] expectedArray = {2, 2};
        int expectedUnremovedCount = 2;

        Assertions.assertEquals(expectedUnremovedCount, sut.removeElement(nums, shouldRemoveValue));

        for (int i = 0; i < expectedUnremovedCount; i++) {
            Assertions.assertEquals(expectedArray[i], nums[i]);
        }
    }

    @Test
    public void case2() {
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        int shouldRemoveValue = 2;

        int[] expectedArray = {0, 1, 3, 0, 4};
        int expectedUnremovedCount = 5;

        Assertions.assertEquals(expectedUnremovedCount, sut.removeElement(nums, shouldRemoveValue));

        for (int i = 0; i < expectedUnremovedCount; i++) {
            Assertions.assertEquals(expectedArray[i], nums[i]);
        }
    }
}