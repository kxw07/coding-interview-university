package others;

public class BinarySearch {
    public int search(int[] array, int target) {
        int lowIndex = 0;
        int highIndex = array.length - 1;
        int goThroughCount = 0;

        while (lowIndex < highIndex) {
            int middleIndex = (lowIndex + highIndex) / 2;

            if (array[middleIndex] > target) {
                highIndex = middleIndex - 1;
            } else if (array[middleIndex] < target) {
                lowIndex = middleIndex + 1;
            } else {
                lowIndex = highIndex;
            }

            goThroughCount++;
        }

        return goThroughCount;
    }
}
