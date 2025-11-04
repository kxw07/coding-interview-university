package others;

import org.junit.jupiter.api.Test;

import java.time.Instant;

class BinarySearchTest {

    @Test
    public void case1() {
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.generateRandomNumber(10000);
        bubbleSort.sort();

        BinarySearch binarySearch = new BinarySearch();

        long start = Instant.now().toEpochMilli();
        int goThroughCount = binarySearch.search(bubbleSort.getArray(), 20);
        long end = Instant.now().toEpochMilli();
        System.out.println(start);
        System.out.println(end);
        System.out.println(end - start);
        System.out.println("goThroughCount:" + goThroughCount);


        bubbleSort.generateRandomNumber(20000);
        bubbleSort.sort();

        start = Instant.now().toEpochMilli();
        goThroughCount = binarySearch.search(bubbleSort.getArray(), 20);
        end = Instant.now().toEpochMilli();
        System.out.println(start);
        System.out.println(end);
        System.out.println(end - start);
        System.out.println("goThroughCount:" + goThroughCount);
    }

}