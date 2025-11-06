package others;

public class DynamicArray {
    private int dataIndex = -1;
    private Object[] array;
    private int arraySize = 16;

    public DynamicArray(int size) {
        while (this.arraySize <= size) {
            this.arraySize = this.arraySize << 1;
        }

        this.array = new Object[this.arraySize];
    }

    public int size() {
        return this.arraySize;
    }
}
