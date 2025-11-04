package others;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import util.Usually;

import java.time.Instant;

class BubbleSortTest {

    @Test
    public void case1() {
        int[] input = {5, 3, 1, 2, 4, 6};
        int[] expect = {1, 2, 3, 4, 5, 6};

        int[] result = BubbleSort.sort(input);
        Assertions.assertThat(result).containsExactly(expect);
    }

    @Test
    public void biggest_number_at_begin() {
        int[] input = {100, 5, 3, 1, 2, 4, 6};
        int[] expect = {1, 2, 3, 4, 5, 6, 100};

        int[] result = BubbleSort.sort(input);
        Assertions.assertThat(result).containsExactly(expect);
    }

    @Test
    public void big_array_time_consumption() {
        int[] array = Usually.generateRandomNumber(10000);
        long start = Instant.now().toEpochMilli();

        BubbleSort.sort(array);

        long end = Instant.now().toEpochMilli();
        System.out.println(start);
        System.out.println(end);
        System.out.println("Time took: " + (end - start));

        array = Usually.generateRandomNumber(20000);
        start = Instant.now().toEpochMilli();

        BubbleSort.sort(array);

        end = Instant.now().toEpochMilli();
        System.out.println(start);
        System.out.println(end);
        System.out.println("Time took: " + (end - start));
    }
}