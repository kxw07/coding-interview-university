package others;

public class DynamicArray {
    private Object[] array;
    private int itemIndex = 0;
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

    // O(1)
    public int size() {
        return this.itemSize;
    }

    // O(1)
    public int capacity() {
        return this.capacity;
    }


    // O(1)
    public boolean isEmpty() {
        return itemSize == 0;
    }

    // O(n) when worst case, O(1) when best case
    public void push(Object item) {
        if (this.itemSize == this.capacity) {
            int newCapacity = this.capacity << 1;
            resize(newCapacity);
            this.capacity = newCapacity;
        }

        this.array[this.itemIndex] = item;
        this.itemIndex++;
        this.itemSize++;
    }

    public void insert(int index, Object item) {
        checkBounds(index);

        Object[] newArray = new Object[this.capacity];
        for (int i = 0; i < index; i++) {
            newArray[i] = this.array[i];
        }

        for (int i = index; i < this.itemSize; i++) {
            newArray[i + 1] = this.array[i];
        }

        newArray[index] = item;

        this.itemIndex++;
        this.itemSize++;
        this.array = newArray;
    }

    public void prepend(Object item) {
        insert(0, item);
    }

    // O(n)
    private void resize(int expectCapacity) {
        Object[] newArray = new Object[expectCapacity];

        for (int i = 0; i < this.itemIndex; i++) {
            newArray[i] = this.array[i];
        }

        this.array = newArray;
    }

    // O(1)
    public Object at(int index) {
        checkBounds(index);

        return this.array[index];
    }

    private void checkBounds(int index) {
        if (index < 0 || index >= this.capacity) {
            throw new RuntimeException("out of bounds");
        }
    }

    public Object[] get() {
        return this.array;
    }
}
