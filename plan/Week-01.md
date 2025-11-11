# Week 01: 演算法複雜度分析 + Arrays

**學習時間**：2025/11/04 - 2025/11/08（35 小時）

## 本週目標
1. 理解 Big-O 符號與演算法複雜度分析
2. 掌握 Array 資料結構的特性與實作
3. 開始建立解題思維

## 本週學習內容

### 📚 Algorithmic complexity / Big-O / Asymptotic analysis

**時間分配**：12 小時

**重要提醒**：
- Nothing to implement here, you're just watching videos and taking notes! Yay!
- There are a lot of videos here. Just watch enough until you understand it. You can always come back and review.
- Don't worry if you don't understand all the math behind it.
- You just need to understand how to express the complexity of an algorithm in terms of Big-O.

**影片清單**：

- [X] [Harvard CS50 - Asymptotic Notation (video)](https://www.youtube.com/watch?v=iOq5kSKqeR4)
  - 11/4, 10 mins
- [X] [Big O Notations (general quick tutorial) (video)](https://www.youtube.com/watch?v=V6mKVRU1evU)
  - 11/4, 21 mins
- [X] [Big O Notation (and Omega and Theta) - best mathematical explanation (video)](https://www.youtube.com/watch?v=ei-A_wy5Yxw&index=2&list=PL1BaGV1cIH4UhkL8a9bJGG356covJ76qN)
  - 11/4, 49 mins, not recommend, speak not fluently
- [X] [Skiena (video)](https://www.youtube.com/watch?v=z1mkCe3kVUA)
  - 11/5, 82 mins, good to review
- [X] [UC Berkeley Big O (video)](https://archive.org/details/ucberkeley_webcast_VIS4YDpuP98)
  - 11/5, 49 mins
- [X] [Amortized Analysis (video)](https://www.youtube.com/watch?v=B3SpQZaAZP4&index=10&list=PL1BaGV1cIH4UhkL8a9bJGG356covJ76qN)
  - 11/5, 32 mins, ???
- [X] TopCoder (includes recurrence relations and master theorem):
    - [Computational Complexity: Section 1](https://www.topcoder.com/thrive/articles/Computational%20Complexity%20part%20one)
      - 11/5
    - [Computational Complexity: Section 2](https://www.topcoder.com/thrive/articles/Computational%20Complexity%20part%20two)
      - 11/5, ???
- [X] [Cheat sheet](http://bigocheatsheet.com/)
  - 11/5
- [X] [[Review] Analyzing Algorithms (playlist) in 18 minutes (video)](https://www.youtube.com/playlist?list=PL9xmBV_5YoZMxejjIyFHWa-4nKg6sdoIv)
  - 11/5, 19 mins, good to review

**學習筆記重點**：
- Big-O, Big-Omega, Big-Theta 的差異
- 常見的時間複雜度：O(1), O(log n), O(n), O(n log n), O(n²), O(2ⁿ)
- 空間複雜度分析
- 均攤分析 (Amortized Analysis)

**額外閱讀**：
When you go through "Cracking the Coding Interview", there is a chapter on this, and at the end there is a quiz to see if you can identify the runtime complexity of different algorithms. It's a super review and test.

---

### 📚 Data Structures - Arrays

**時間分配**：15 小時

#### 理論影片（3 小時）

- [ ] About Arrays:
	- [X] [Arrays CS50 Harvard University](https://www.youtube.com/watch?v=tI_tIZFyKBw&t=3009s)
      - 11/6, 22 mins, from 01:03:45 to 01:25:39
    - [X] [Arrays (video)](https://www.coursera.org/learn/data-structures/lecture/OsBSF/arrays)
      - 11/6, 8 mins
    - [X] [UC Berkeley CS61B - Linear and Multi-Dim Arrays (video)](https://archive.org/details/ucberkeley_webcast_Wp8oiO_CZZE) (Start watching from 15m 32s)
      - 11/6, 35 mins
    - [X] [Dynamic Arrays (video)](https://www.coursera.org/learn/data-structures/lecture/EwbnV/dynamic-arrays)
      - 11/6, 9 mins
    - [X] [Jagged Arrays (video)](https://www.youtube.com/watch?v=1jtrQqYpt7g)
      - 11/6, 5 mins

#### 實作練習（12 小時）

- [ ] **Implement a vector (mutable array with automatic resizing)**:
    - [ ] Practice coding using arrays and pointers, and pointer math to jump to an index instead of using indexing.
    - [ ] New raw data array with allocated memory
        - can allocate int array under the hood, just not use its features
        - start with 16, or if the starting number is greater, use power of 2 - 16, 32, 64, 128
    - [ ] size() - number of items
    - [ ] capacity() - number of items it can hold
    - [ ] is_empty()
    - [ ] at(index) - returns the item at a given index, blows up if index out of bounds
    - [ ] push(item)
    - [ ] insert(index, item) - inserts item at index, shifts that index's value and trailing elements to the right
    - [ ] prepend(item) - can use insert above at index 0
    - [ ] pop() - remove from end, return value
    - [ ] delete(index) - delete item at index, shifting all trailing elements left
    - [ ] remove(item) - looks for value and removes index holding it (even if in multiple places)
    - [ ] find(item) - looks for value and returns first index with that value, -1 if not found
    - [ ] resize(new_capacity) // private function
        - when you reach capacity, resize to double the size
        - when popping an item, if the size is 1/4 of capacity, resize to half

#### 複雜度分析（重要！）

- [ ] **Time**
    - O(1) to add/remove at end (amortized for allocations for more space), index, or update
    - O(n) to insert/remove elsewhere
- [ ] **Space**
    - contiguous in memory, so proximity helps performance
    - space needed = (array capacity, which is >= n) * size of item, but even if 2n, still O(n)

---

### 💻 LeetCode 練習

**時間分配**：8 小時

完成以下 Array 相關題目（至少 8 題）：

**Easy（建議 5 題）**：
1. [X] [1. Two Sum](https://leetcode.com/problems/two-sum/)
   - before 11/11
2. [X] [26. Remove Duplicates from Sorted Array](https://leetcode.com/problems/remove-duplicates-from-sorted-array/)
   - 11/11
3. [X] [27. Remove Element](https://leetcode.com/problems/remove-element/)
   - 11/11
4. [X] [88. Merge Sorted Array](https://leetcode.com/problems/merge-sorted-array/)
   - 11/11
5. [X] [121. Best Time to Buy and Sell Stock](https://leetcode.com/problems/best-time-to-buy-and-sell-stock/)
   - 11/11

**Medium（建議 3 題）**：
1. [ ] [15. 3Sum](https://leetcode.com/problems/3sum/)
2. [ ] [33. Search in Rotated Sorted Array](https://leetcode.com/problems/search-in-rotated-sorted-array/)
3. [ ] [48. Rotate Image](https://leetcode.com/problems/rotate-image/)

---

## 學習建議

### Day 1 (Monday) - 7 小時
- 上午（3h）：Big-O 影片（Harvard CS50, Big O Notations, Big O Notation）
- 下午（4h）：Big-O 影片（Skiena, UC Berkeley, Amortized Analysis）+ 閱讀 TopCoder 文章

### Day 2 (Tuesday) - 7 小時
- 上午（3h）：完成剩餘 Big-O 複習 + Arrays 理論影片
- 下午（4h）：開始實作 Dynamic Array - 完成 size(), capacity(), is_empty(), at()

### Day 3 (Wednesday) - 7 小時
- 上午（4h）：實作 Dynamic Array - 完成 push(), insert(), prepend()
- 下午（3h）：實作 Dynamic Array - 完成 pop(), delete(), remove()

### Day 4 (Thursday) - 7 小時
- 上午（3h）：實作 Dynamic Array - 完成 find(), resize() + 測試所有功能
- 下午（4h）：LeetCode Easy 題目 × 3

### Day 5 (Friday) - 7 小時
- 上午（4h）：LeetCode Easy 題目 × 2 + Medium 題目 × 2
- 下午（3h）：LeetCode Medium 題目 × 1 + 本週總複習

---

## 實作規範

### Java 實作
```java
public class DynamicArray<T> {
    private Object[] data;
    private int size;
    private int capacity;

    public DynamicArray() {
        this.capacity = 16;
        this.size = 0;
        this.data = new Object[capacity];
    }

    // TODO: Implement all methods
}
```

### 測試要求
- 為每個方法撰寫測試案例
- 測試邊界條件（empty array, single element, full capacity）
- 測試 resize 功能

---

## 本週檢核清單

### 知識理解
- [ ] 能解釋 Big-O, Big-Omega, Big-Theta 的意義
- [ ] 能快速判斷常見操作的時間複雜度
- [ ] 理解 Amortized Analysis 的概念
- [ ] 理解 Array 的優缺點
- [ ] 理解 Dynamic Array 的 resize 機制

### 實作能力
- [ ] 完成 Dynamic Array 完整實作
- [ ] 所有方法都通過測試
- [ ] 能分析自己實作的時間與空間複雜度

### 解題能力
- [ ] 完成至少 5 道 Easy 題目
- [ ] 完成至少 3 道 Medium 題目
- [ ] 能解釋每道題的解法與複雜度

---

## 學習心得記錄

### 本週收穫
[在這裡記錄你的學習心得]

### 遇到的困難
[記錄遇到的問題及解決方法]

### 下週改進方向
[記錄需要調整的地方]

---

**下週預告**：Week 02 將學習 Linked Lists, Stack, Queue
