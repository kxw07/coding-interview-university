package others;

public class BubbleSort {

    private int[] array;

    public BubbleSort() {
    }

    public BubbleSort(int[] array) {
        this.array = array;
    }

    public void sort() {
        for (int i = this.array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (this.array[j] > this.array[j + 1]) {
                    int temp = this.array[j];
                    this.array[j] = this.array[j + 1];
                    this.array[j + 1] = temp;
                }
            }
        }
    }

    public void generateRandomNumber(int size) {
        int[] randomValueArray = new int[size];
        for (int idx = 0; idx < randomValueArray.length; idx++) {
            randomValueArray[idx] = (int) (Math.random() * size);
        }

        this.array = randomValueArray;
    }

    public int[] getArray() {
        return this.array;
    }
}
