package two_sum_1;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class SolutionTest {

    @Test
    public void case1() {
        int[] input = {3, 2, 4};
        int target = 6;
        int[] expected = {1, 2};

        Solution solution = new Solution();
        Assertions.assertThat(expected).containsExactlyInAnyOrder(solution.twoSum(input, target));
    }
}