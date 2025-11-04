package others;

import org.junit.jupiter.api.Test;
import util.Usually;

import java.time.Instant;

class BinarySearchTest {

    @Test
    public void case1() {
        int[] array = Usually.generateRandomNumber(10000);
        int[] sortedArray = BubbleSort.sort(array);

        long start = Instant.now().toEpochMilli();
        int goThroughCount = BinarySearch.search(sortedArray, 20);
        long end = Instant.now().toEpochMilli();
        System.out.println(start);
        System.out.println(end);
        System.out.println("Time took: " + (end - start));
        System.out.println("goThroughCount: " + goThroughCount);


        array = Usually.generateRandomNumber(20000);
        sortedArray = BubbleSort.sort(array);

        start = Instant.now().toEpochMilli();
        goThroughCount = BinarySearch.search(sortedArray, 20);
        end = Instant.now().toEpochMilli();
        System.out.println(start);
        System.out.println(end);
        System.out.println("Time took: " + (end - start));
        System.out.println("goThroughCount: " + goThroughCount);
    }

}