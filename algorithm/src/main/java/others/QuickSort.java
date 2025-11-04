package others;

public class QuickSort {

    public static int[] exec(int[] array, int low, int high) {
        if (low < high) {
            int pivotIndex = findPivotIndex(array, low, high);
//            int pivotIndex = teacherFindPivotIndex(array, low, high);
            exec(array, low, pivotIndex - 1);
            exec(array, pivotIndex + 1, high);
        }

        return array;
    }

    private static int findPivotIndex(int[] array, int low, int high) {
        int pivotValue = array[high]; // let tail value as pivot, or can let user input.
        int pivotActualIndex = low -1;

        for (int idx = low; idx < high; idx++) {
            if (array[idx] < pivotValue) {
                pivotActualIndex++;

                // swap from small idx to big index, do many times
                swap(array, idx, pivotActualIndex);
            }
        }

        pivotActualIndex++; // pivot should insert after pivotActualIndex, so do ++

        swap(array, pivotActualIndex, high);

        return pivotActualIndex;
    }

    private static int teacherFindPivotIndex(int[] array, int left, int right) {
        int pivotValue = array[right]; // let tail value as pivot, or can let user input.

        int leftPointer = left - 1;
        int rightPointer = right;

        while (true) {
            // swap from left side and right side, do few times.
            while (array[++leftPointer] < pivotValue) ;

            while (rightPointer > 0 && array[--rightPointer] > pivotValue) ;

            if (leftPointer >= rightPointer) {
                break;
            } else {
                swap(array, leftPointer, rightPointer);
            }
        }

        swap(array, leftPointer, right);
        return leftPointer;
    }

    private static void swap(int[] array, int idx1, int idx2) {
        int temp = array[idx1];
        array[idx1] = array[idx2];
        array[idx2] = temp;
    }
}
