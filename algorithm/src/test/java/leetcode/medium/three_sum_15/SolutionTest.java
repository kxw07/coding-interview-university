package leetcode.medium.three_sum_15;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class SolutionTest {

    private Solution sut;

    @BeforeEach
    void setUp() {
        sut = new Solution();
    }

    @Test
    public void case1() {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> expect = List.of(List.of(-1, -1, 2), List.of(-1, 0, 1));

        List<List<Integer>> actual = sut.threeSum(nums);
        Assertions.assertEquals(expect.size(), actual.size());

        boolean checkResult = false;
        for (int i = 0; i < expect.size(); i++) {
            List<Integer> e = expect.get(i).stream().sorted().toList();
            checkResult = false;

            for (int j = 0; j < actual.size(); j++) {
                List<Integer> a = actual.get(j).stream().sorted().toList();

                if (e.equals(a)) {
                    checkResult = true;
                }
            }
        }
        Assertions.assertTrue(checkResult);
    }

    @Test
    public void case2() {
        int[] nums = {0, 1, 1};
        List<List<Integer>> expect = new ArrayList<>();

        List<List<Integer>> actual = sut.threeSum(nums);
        Assertions.assertEquals(expect.size(), actual.size());

        boolean checkResult = true;
        for (int i = 0; i < expect.size(); i++) {
            List<Integer> e = expect.get(i).stream().sorted().toList();
            checkResult = false;

            for (int j = 0; j < actual.size(); j++) {
                List<Integer> a = actual.get(j).stream().sorted().toList();

                if (e.equals(a)) {
                    checkResult = true;
                }
            }
        }
        Assertions.assertTrue(checkResult);
    }

    @Test
    public void case3() {
        int[] nums = {0, 0, 0};
        List<List<Integer>> expect = List.of(List.of(0, 0, 0));

        List<List<Integer>> actual = sut.threeSum(nums);
        Assertions.assertEquals(expect.size(), actual.size());

        boolean checkResult = true;
        for (int i = 0; i < expect.size(); i++) {
            List<Integer> e = expect.get(i).stream().sorted().toList();
            checkResult = false;

            for (int j = 0; j < actual.size(); j++) {
                List<Integer> a = actual.get(j).stream().sorted().toList();

                if (e.equals(a)) {
                    checkResult = true;
                }
            }
        }
        Assertions.assertTrue(checkResult);
    }

    @Test
    public void case4() {
        int[] nums = {2, -3, 0, -2, -5, -5, -4, 1, 2, -2, 2, 0, 2, -4, 5, 5, -10};
        List<List<Integer>> expect = List.of(
                List.of(-10, 5, 5),
                List.of(-5, 0, 5),
                List.of(-4, 2, 2),
                List.of(-3, -2, 5),
                List.of(-3, 1, 2),
                List.of(-2, 0, 2));

        List<List<Integer>> actual = sut.threeSum(nums);
        Assertions.assertEquals(expect.size(), actual.size());

        boolean checkResult = true;
        for (int i = 0; i < expect.size(); i++) {
            List<Integer> e = expect.get(i).stream().sorted().toList();
            checkResult = false;

            for (int j = 0; j < actual.size(); j++) {
                List<Integer> a = actual.get(j).stream().sorted().toList();

                if (e.equals(a)) {
                    checkResult = true;
                }
            }
        }
        Assertions.assertTrue(checkResult);
    }
}