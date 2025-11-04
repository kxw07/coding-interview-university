package others;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.Instant;

class BubbleSortTest {

    @Test
    public void case1() {
        int[] input = {5, 3, 1, 2, 4, 6};
        int[] expect = {1, 2, 3, 4, 5, 6};

        BubbleSort bubbleSort = new BubbleSort(input);
        bubbleSort.sort();
        Assertions.assertThat(bubbleSort.getArray()).containsExactly(expect);
    }

    @Test
    public void biggest_number_at_begin() {
        int[] input = {100, 5, 3, 1, 2, 4, 6};
        int[] expect = {1, 2, 3, 4, 5, 6, 100};

        BubbleSort bubbleSort = new BubbleSort(input);
        bubbleSort.sort();
        Assertions.assertThat(bubbleSort.getArray()).containsExactly(expect);
    }

    @Test
    public void big_array_time_consumption() {
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.generateRandomNumber(100000);
        long start = Instant.now().toEpochMilli();

        bubbleSort.sort();

        long end = Instant.now().toEpochMilli();
        System.out.println(start);
        System.out.println(end);
        System.out.println(end - start);

        bubbleSort.generateRandomNumber(200000);
        start = Instant.now().toEpochMilli();

        bubbleSort.sort();

        end = Instant.now().toEpochMilli();
        System.out.println(start);
        System.out.println(end);
        System.out.println(end - start);
    }
}