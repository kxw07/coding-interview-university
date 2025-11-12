package leetcode.medium.rotate_image_48;

public class Solution {
    public void rotate(int[][] matrix) {
        if (matrix.length == 1) {
            return;
        }

        // total: O(N＾2/4) -> O(N^2)
        // O(N/2)
        // y
        for (int i = 0; i < (matrix.length / 2 + matrix.length % 2); i++) {

            // O(N/2)
            // x
            for (int j = 0; j < matrix.length / 2; j++) {

                int temp = matrix[i][j];
                matrix[i][j] = matrix[matrix.length - 1 - j][i];
                matrix[matrix.length - 1 - j][i] = matrix[matrix.length - 1 - i][matrix.length - 1 - j];
                matrix[matrix.length - 1 - i][matrix.length - 1 - j] = matrix[j][matrix.length - 1 - i];
                matrix[j][matrix.length - 1 - i] = temp;
            }
        }
    }
}
