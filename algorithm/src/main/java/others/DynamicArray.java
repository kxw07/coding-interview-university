package others;

public class DynamicArray {
    private Object[] array;
    private int contentIndex = 0;
    private final int defaultCapacity = 16;
    private int capacity = defaultCapacity;

    public DynamicArray() {
        this.array = new Object[this.defaultCapacity];
    }

    public DynamicArray(int expectCapacity) {
        while (this.capacity < expectCapacity) {
            this.capacity = this.capacity << 1;
        }

        this.array = new Object[this.capacity];
    }

    // O(1)
    public int size() {
        return this.contentIndex;
    }

    // O(1)
    public boolean isEmpty() {
        return contentIndex == 0;
    }

    // O(1)
    public int capacity() {
        return this.capacity;
    }

    // O(1)
    public Object[] get() {
        return this.array;
    }

    // O(1)
    public Object at(int index) {
        checkBounds(index);

        return this.array[index];
    }

    // O(1)
    private void checkBounds(int index) {
        if (index < 0 || index >= this.capacity) {
            throw new RuntimeException("out of bounds");
        }
    }

    // O(n) when worst case, O(1) when best case
    public void push(Object obj) {
        if (this.contentIndex == this.capacity) {
            resize(this.capacity << 1);
        }

        this.array[this.contentIndex] = obj;
        this.contentIndex++;
    }

    // O(n)
    public void prepend(Object obj) {
        insert(0, obj);
    }

    // O(n)
    public void insert(int index, Object obj) {
        checkBounds(index);

        Object[] newArray = new Object[this.capacity];
        for (int i = 0; i < index; i++) {
            newArray[i] = this.array[i];
        }

        for (int i = index; i < this.contentIndex; i++) {
            newArray[i + 1] = this.array[i];
        }

        newArray[index] = obj;

        this.contentIndex++;
        this.array = newArray;
    }

    // O(n)
    private void resize(int expectCapacity) {
        Object[] newArray = new Object[expectCapacity];

        for (int i = 0; i < this.contentIndex; i++) {
            newArray[i] = this.array[i];
        }

        this.array = newArray;
        this.capacity = expectCapacity;
    }

    // O(1)
    public Object pop() {
        if (this.contentIndex == 0) {
            throw new RuntimeException("no objects");
        }

        Object value = this.array[this.contentIndex - 1];
        this.array[this.contentIndex - 1] = null;
        this.contentIndex--;

        if (this.capacity > this.defaultCapacity && this.contentIndex <= (this.capacity / 4)) {
            resize(this.capacity >> 1);
        }

        return value;
    }

    // O(n)
    public void delete(int index) {
        checkBounds(index);

        Object[] newArray = new Object[this.capacity];
        for (int i = 0; i < index; i++) {
            newArray[i] = this.array[i];
        }

        for (int i = index; i < this.contentIndex; i++) {
            newArray[i] = this.array[i + 1];
        }

        this.contentIndex--;
        this.array = newArray;
    }

    // O(n)
    public void remove(Object obj) {
        for (int i = 0; i < this.contentIndex; i++) {
            if (obj.equals(this.array[i])) {
                this.array[i] = null;
            }
        }
    }

    // O(n)
    public int find(Object obj) {
        for (int i = 0; i < this.contentIndex; i++) {
            if (obj.equals(this.array[i])) {
                return i;
            }
        }

        return -1;
    }
}
