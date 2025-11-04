# Week 05: Heap/Priority Queue + Sorting 基礎

**學習時間**：2025/12/02 - 2025/12/06（35 小時）

## 本週目標
1. 掌握 Heap 資料結構與 Priority Queue
2. 理解 Heap Sort 原理
3. 學習基本排序算法（Merge Sort, Quick Sort）

## 本週學習內容

### 📚 Heap / Priority Queue / Binary Heap

**時間分配**：18 小時

#### 理論影片（8 小時）

- [ ] visualized as a tree, but is usually linear in storage (array, linked list)
- [ ] [Heap](https://en.wikipedia.org/wiki/Heap_(data_structure))
- [ ] [Introduction (video)](https://www.coursera.org/lecture/data-structures/introduction-2OpTs)
- [ ] [Binary Trees (video)](https://www.coursera.org/learn/data-structures/lecture/GRV2q/binary-trees)
- [ ] [Tree Height Remark (video)](https://www.coursera.org/learn/data-structures/supplement/S5xxz/tree-height-remark)
- [ ] [Basic Operations (video)](https://www.coursera.org/learn/data-structures/lecture/0g1dl/basic-operations)
- [ ] [Complete Binary Trees (video)](https://www.coursera.org/learn/data-structures/lecture/gl5Ni/complete-binary-trees)
- [ ] [Pseudocode (video)](https://www.coursera.org/learn/data-structures/lecture/HxQo9/pseudocode)
- [ ] [Heap Sort - jumps to start (video)](https://youtu.be/odNJmw5TOEE?list=PLFDnELG9dpVxQCxuD-9BSy2E7BWY3t5Sm&t=3291)
- [ ] [Heap Sort (video)](https://www.coursera.org/lecture/data-structures/heap-sort-hSzMO)
- [ ] [Building a heap (video)](https://www.coursera.org/lecture/data-structures/building-a-heap-dwrOS)
- [ ] [MIT 6.006 Introduction to Algorithms: Binary Heaps](https://www.youtube.com/watch?v=Xnpo1atN-Iw&list=PLUl4u3cNGP63EdVPNLG3ToM6LaEUuStEY&index=12)
- [ ] [CS 61B Lecture 24: Priority Queues (video)](https://archive.org/details/ucberkeley_webcast_yIUFT6AKBGE)
- [ ] [Linear Time BuildHeap (max-heap)](https://www.youtube.com/watch?v=MiyLo8adrWw)
- [ ] [[Review] Heap (playlist) in 13 minutes (video)](https://www.youtube.com/playlist?list=PL9xmBV_5YoZNsyqgPW-DNwUeT8F8uhWc6)

#### 實作練習（10 小時）

- [ ] **Implement a max-heap**:
    - [ ] insert
    - [ ] sift_up - needed for insert
    - [ ] get_max - returns the max item, without removing it
    - [ ] get_size() - return number of elements stored
    - [ ] is_empty() - returns true if the heap contains no elements
    - [ ] extract_max - returns the max item, removing it
    - [ ] sift_down - needed for extract_max
    - [ ] remove(x) - removes item at index x
    - [ ] heapify - create a heap from an array of elements, needed for heap_sort
    - [ ] heap_sort() - take an unsorted array and turn it into a sorted array in place using a max heap or min heap

**核心概念**：
- Heap Property：Max-Heap (parent >= children), Min-Heap (parent <= children)
- Complete Binary Tree：除了最後一層，其他層都是滿的
- Array 表示：parent at i, left child at 2i+1, right child at 2i+2
- 時間複雜度：insert O(log n), extract O(log n), heapify O(n)

---

### 📚 Sorting - 基礎

**時間分配**：10 小時

#### 理論影片（6 小時）

- [ ] **Notes**:
    - Implement sorts & know best case/worst case, average complexity of each:
        - no bubble sort - it's terrible - O(n^2), except when n <= 16
    - [ ] **Stability in sorting algorithms** ("Is Quicksort stable?")
        - [Sorting Algorithm Stability](https://en.wikipedia.org/wiki/Sorting_algorithm#Stability)
        - [Stability In Sorting Algorithms](http://stackoverflow.com/questions/1517793/stability-in-sorting-algorithms)
        - [Stability In Sorting Algorithms](http://www.geeksforgeeks.org/stability-in-sorting-algorithms/)
        - [Sorting Algorithms - Stability](http://homepages.math.uic.edu/~leon/cs-mcs401-s08/handouts/stability.pdf)
    - [ ] **Which algorithms can be used on linked lists? Which on arrays? Which of both?**
        - I wouldn't recommend sorting a linked list, but merge sort is doable.
        - [Merge Sort For Linked List](http://www.geeksforgeeks.org/merge-sort-for-linked-list/)

- [ ] For heapsort, see the Heap data structure above. Heap sort is great, but not stable

- [ ] [Sedgewick - Mergesort (5 videos)](https://www.coursera.org/learn/algorithms-part1/home/week/3)
    - [ ] [1. Mergesort](https://www.coursera.org/lecture/algorithms-part1/mergesort-ARWDq)
    - [ ] [2. Bottom-up Mergesort](https://www.coursera.org/learn/algorithms-part1/lecture/PWNEl/bottom-up-mergesort)
    - [ ] [3. Sorting Complexity](https://www.coursera.org/lecture/algorithms-part1/sorting-complexity-xAltF)
    - [ ] [4. Comparators](https://www.coursera.org/lecture/algorithms-part1/comparators-9FYhS)
    - [ ] [5. Stability](https://www.coursera.org/learn/algorithms-part1/lecture/pvvLZ/stability)

- [ ] [Sedgewick - Quicksort (4 videos)](https://www.coursera.org/learn/algorithms-part1/home/week/3)
    - [ ] [1. Quicksort](https://www.coursera.org/lecture/algorithms-part1/quicksort-vjvnC)
    - [ ] [2. Selection](https://www.coursera.org/lecture/algorithms-part1/selection-UQxFT)
    - [ ] [3. Duplicate Keys](https://www.coursera.org/lecture/algorithms-part1/duplicate-keys-XvjPd)
    - [ ] [4. System Sorts](https://www.coursera.org/lecture/algorithms-part1/system-sorts-QBNZ7)

#### 實作練習（4 小時）

- [ ] **Merge sort code**:
    - [ ] [Using output array (C)](http://www.cs.yale.edu/homes/aspnes/classes/223/examples/sorting/mergesort.c)
    - [ ] [Using output array (Python)](https://github.com/jwasham/practice-python/blob/master/merge_sort/merge_sort.py)
    - [ ] [In-place (C++)](https://github.com/jwasham/practice-cpp/blob/master/merge_sort/merge_sort.cc)

- [ ] **Quick sort code**:
    - [ ] [Implementation (C)](http://www.cs.yale.edu/homes/aspnes/classes/223/examples/randomization/quick.c)
    - [ ] [Implementation (C)](https://github.com/jwasham/practice-c/blob/master/quick_sort/quick_sort.c)
    - [ ] [Implementation (Python)](https://github.com/jwasham/practice-python/blob/master/quick_sort/quick_sort.py)

---

### 💻 LeetCode 練習

**時間分配**：7 小時

#### Heap 題目（5 題）

**Easy**：
1. [ ] [703. Kth Largest Element in a Stream](https://leetcode.com/problems/kth-largest-element-in-a-stream/)
2. [ ] [1046. Last Stone Weight](https://leetcode.com/problems/last-stone-weight/)

**Medium**：
1. [ ] [215. Kth Largest Element in an Array](https://leetcode.com/problems/kth-largest-element-in-an-array/)
2. [ ] [347. Top K Frequent Elements](https://leetcode.com/problems/top-k-frequent-elements/)
3. [ ] [373. Find K Pairs with Smallest Sums](https://leetcode.com/problems/find-k-pairs-with-smallest-sums/)

**Hard**：
1. [ ] [295. Find Median from Data Stream](https://leetcode.com/problems/find-median-from-data-stream/)

#### Sorting 題目（4 題）

**Easy**：
1. [ ] [912. Sort an Array](https://leetcode.com/problems/sort-an-array/) (實作 Merge Sort & Quick Sort)

**Medium**：
1. [ ] [75. Sort Colors](https://leetcode.com/problems/sort-colors/)
2. [ ] [148. Sort List](https://leetcode.com/problems/sort-list/) (Linked List Merge Sort)
3. [ ] [179. Largest Number](https://leetcode.com/problems/largest-number/)

---

## 學習建議

### Day 1 (Monday) - 7 小時
- 上午（4h）：Heap 理論影片（Introduction, Binary Trees, Basic Operations）
- 下午（3h）：Heap 理論影片（Complete Binary Trees, Pseudocode, Heap Sort）

### Day 2 (Tuesday) - 7 小時
- 上午（4h）：Heap 理論影片（Building heap, MIT, CS 61B）
- 下午（3h）：開始實作 Max Heap - insert, sift_up, get_max

### Day 3 (Wednesday) - 7 小時
- 上午（4h）：實作 Max Heap - extract_max, sift_down, remove
- 下午（3h）：實作 Max Heap - heapify, heap_sort + 測試

### Day 4 (Thursday) - 7 小時
- 上午（4h）：Sorting 理論（Stability, Sedgewick Mergesort 5 videos）
- 下午（3h）：Sorting 理論（Sedgewick Quicksort 4 videos）

### Day 5 (Friday) - 7 小時
- 上午（4h）：實作 Merge Sort & Quick Sort + LeetCode Heap × 2
- 下午（3h）：LeetCode Heap × 2 + Sorting × 2 + 本週複習

---

## 重要概念整理

### Heap 操作實作

```java
public class MaxHeap {
    private int[] heap;
    private int size;
    private int capacity;

    public MaxHeap(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.heap = new int[capacity];
    }

    // Helper methods
    private int parent(int i) { return (i - 1) / 2; }
    private int leftChild(int i) { return 2 * i + 1; }
    private int rightChild(int i) { return 2 * i + 2; }

    private void swap(int i, int j) {
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    // Sift up (用於 insert)
    private void siftUp(int i) {
        while (i > 0 && heap[parent(i)] < heap[i]) {
            swap(i, parent(i));
            i = parent(i);
        }
    }

    // Sift down (用於 extract_max)
    private void siftDown(int i) {
        int maxIndex = i;
        int left = leftChild(i);
        int right = rightChild(i);

        if (left < size && heap[left] > heap[maxIndex]) {
            maxIndex = left;
        }
        if (right < size && heap[right] > heap[maxIndex]) {
            maxIndex = right;
        }

        if (i != maxIndex) {
            swap(i, maxIndex);
            siftDown(maxIndex);
        }
    }

    // Insert
    public void insert(int value) {
        if (size == capacity) {
            throw new IllegalStateException("Heap is full");
        }
        heap[size] = value;
        siftUp(size);
        size++;
    }

    // Extract Max
    public int extractMax() {
        if (size == 0) {
            throw new IllegalStateException("Heap is empty");
        }
        int max = heap[0];
        heap[0] = heap[size - 1];
        size--;
        siftDown(0);
        return max;
    }

    // Get Max (without removing)
    public int getMax() {
        if (size == 0) {
            throw new IllegalStateException("Heap is empty");
        }
        return heap[0];
    }

    // Heapify (Build heap from array)
    public static MaxHeap heapify(int[] array) {
        MaxHeap heap = new MaxHeap(array.length);
        heap.size = array.length;
        System.arraycopy(array, 0, heap.heap, 0, array.length);

        // Start from last non-leaf node
        for (int i = (array.length - 1) / 2; i >= 0; i--) {
            heap.siftDown(i);
        }
        return heap;
    }

    // Heap Sort
    public static void heapSort(int[] array) {
        MaxHeap heap = heapify(array);

        for (int i = array.length - 1; i >= 0; i--) {
            array[i] = heap.extractMax();
        }
    }
}
```

### Sorting 算法實作

```java
// Merge Sort
public void mergeSort(int[] arr, int left, int right) {
    if (left < right) {
        int mid = left + (right - left) / 2;

        mergeSort(arr, left, mid);
        mergeSort(arr, mid + 1, right);
        merge(arr, left, mid, right);
    }
}

private void merge(int[] arr, int left, int mid, int right) {
    int n1 = mid - left + 1;
    int n2 = right - mid;

    int[] L = new int[n1];
    int[] R = new int[n2];

    System.arraycopy(arr, left, L, 0, n1);
    System.arraycopy(arr, mid + 1, R, 0, n2);

    int i = 0, j = 0, k = left;

    while (i < n1 && j < n2) {
        if (L[i] <= R[j]) {
            arr[k++] = L[i++];
        } else {
            arr[k++] = R[j++];
        }
    }

    while (i < n1) arr[k++] = L[i++];
    while (j < n2) arr[k++] = R[j++];
}

// Quick Sort
public void quickSort(int[] arr, int low, int high) {
    if (low < high) {
        int pi = partition(arr, low, high);
        quickSort(arr, low, pi - 1);
        quickSort(arr, pi + 1, high);
    }
}

private int partition(int[] arr, int low, int high) {
    int pivot = arr[high];
    int i = low - 1;

    for (int j = low; j < high; j++) {
        if (arr[j] < pivot) {
            i++;
            swap(arr, i, j);
        }
    }

    swap(arr, i + 1, high);
    return i + 1;
}

private void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
}
```

### 排序算法比較

| Algorithm | Time (Best) | Time (Average) | Time (Worst) | Space | Stable |
|-----------|-------------|----------------|--------------|-------|--------|
| Bubble Sort | O(n) | O(n²) | O(n²) | O(1) | Yes |
| Selection Sort | O(n²) | O(n²) | O(n²) | O(1) | No |
| Insertion Sort | O(n) | O(n²) | O(n²) | O(1) | Yes |
| Merge Sort | O(n log n) | O(n log n) | O(n log n) | O(n) | Yes |
| Quick Sort | O(n log n) | O(n log n) | O(n²) | O(log n) | No |
| Heap Sort | O(n log n) | O(n log n) | O(n log n) | O(1) | No |

---

## 本週檢核清單

### 知識理解
- [ ] 理解 Heap 的性質與 array 表示法
- [ ] 理解 sift_up 與 sift_down 操作
- [ ] 理解 heapify 的 O(n) 複雜度
- [ ] 理解 Heap Sort 原理
- [ ] 理解 Merge Sort 的 divide and conquer
- [ ] 理解 Quick Sort 的 partition 策略
- [ ] 理解 stable vs unstable sorting

### 實作能力
- [ ] 完成 Max Heap 完整實作
- [ ] 實作 Heap Sort
- [ ] 實作 Merge Sort
- [ ] 實作 Quick Sort
- [ ] 能分析各排序算法的時空複雜度

### 解題能力
- [ ] 完成至少 4 道 Heap 題目
- [ ] 完成至少 3 道 Sorting 題目
- [ ] 能識別何時使用 Heap
- [ ] 能選擇合適的排序算法

---

## 學習心得記錄

### 本週收穫
[在這裡記錄你的學習心得]

### 遇到的困難
[記錄遇到的問題及解決方法]

### 重要發現
[記錄任何重要的領悟或技巧]

---

**下週預告**：Week 06 將深入學習更多排序算法與應用
