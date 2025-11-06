package others;

public class DynamicArray {
    private int itemIndex = 0;
    private Object[] array;
    private int itemSize = 0;
    private int capacity = 16;

    public DynamicArray() {
        this.array = new Object[this.capacity];
    }

    public DynamicArray(int expectCapacity) {
        while (this.capacity < expectCapacity) {
            this.capacity = this.capacity << 1;
        }

        this.array = new Object[this.capacity];
    }

    public int size() {
        return this.itemSize;
    }

    public int capacity() {
        return this.capacity;
    }

    public boolean isEmpty() {
        return itemSize == 0;
    }

    public void push(Object item) {
        this.array[this.itemIndex] = item;
        this.itemIndex++;
        this.itemSize++;
    }

    public Object at(int index) {
        if (index < 0 || index > this.capacity) {
            throw new RuntimeException("out of bounds");
        }

        return this.array[index];
    }
}
