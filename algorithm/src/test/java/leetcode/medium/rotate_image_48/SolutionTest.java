package leetcode.medium.rotate_image_48;

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
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] expect = {{7, 4, 1}, {8, 5, 2}, {9, 6, 3}};

        sut.rotate(matrix);

        for (int i = 0; i < expect.length; i++) {
            Assertions.assertArrayEquals(expect[i], matrix[i]);
        }
    }

    @Test
    public void case2() {
        int[][] matrix = {{5, 1, 9, 11}, {2, 4, 8, 10}, {13, 3, 6, 7}, {15, 14, 12, 16}};
        int[][] expect = {{15, 13, 2, 5}, {14, 3, 4, 1}, {12, 6, 8, 9}, {16, 7, 10, 11}};

        sut.rotate(matrix);

        for (int i = 0; i < expect.length; i++) {
            Assertions.assertArrayEquals(expect[i], matrix[i]);
        }
    }
}