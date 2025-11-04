# Week 02: Linked Lists + Stack + Queue

**學習時間**：2025/11/10 - 2025/11/14（35 小時）

## 本週目標
1. 掌握 Linked List 的實作與應用
2. 理解 Stack 和 Queue 的特性
3. 比較不同資料結構的適用場景

## 本週學習內容

### 📚 Linked Lists

**時間分配**：20 小時

#### 理論影片（5 小時）

- [ ] **Description**:
	- [ ] [Linked Lists CS50 Harvard University](https://www.youtube.com/watch?v=2T-A_GFuoTo&t=650s) - this builds the intuition.
    - [ ] [Singly Linked Lists (video)](https://www.coursera.org/lecture/data-structures/singly-linked-lists-kHhgK)
    - [ ] [CS 61B - Linked Lists 1 (video)](https://archive.org/details/ucberkeley_webcast_htzJdKoEmO0)
    - [ ] [CS 61B - Linked Lists 2 (video)](https://archive.org/details/ucberkeley_webcast_-c4I3gFYe3w)
    - [ ] [[Review] Linked lists in 4 minutes (video)](https://youtu.be/F8AbOfQwl1c)
- [ ] [C Code (video)](https://www.youtube.com/watch?v=QN6FPiD0Gzo) - not the whole video, just portions about Node struct and memory allocation
- [ ] **Linked List vs Arrays**:
    - [Core Linked Lists Vs Arrays (video)](https://www.coursera.org/lecture/data-structures-optimizing-performance/core-linked-lists-vs-arrays-rjBs9)
    - [In The Real World Linked Lists Vs Arrays (video)](https://www.coursera.org/lecture/data-structures-optimizing-performance/in-the-real-world-lists-vs-arrays-QUaUd)
- [ ] [Why you should avoid linked lists (video)](https://www.youtube.com/watch?v=YQs6IC-vgmo)
- [ ] **Gotcha**: you need pointer to pointer knowledge:
    (for when you pass a pointer to a function that may change the address where that pointer points)
    This page is just to get a grasp on ptr to ptr. I don't recommend this list traversal style. Readability and maintainability suffer due to cleverness.
    - [Pointers to Pointers](https://www.eskimo.com/~scs/cclass/int/sx8.html)

#### 實作練習（15 小時）

- [ ] **Implement** (I did with tail pointer & without):
    - [ ] size() - returns the number of data elements in the list
    - [ ] empty() - bool returns true if empty
    - [ ] value_at(index) - returns the value of the nth item (starting at 0 for first)
    - [ ] push_front(value) - adds an item to the front of the list
    - [ ] pop_front() - remove the front item and return its value
    - [ ] push_back(value) - adds an item at the end
    - [ ] pop_back() - removes end item and returns its value
    - [ ] front() - get the value of the front item
    - [ ] back() - get the value of the end item
    - [ ] insert(index, value) - insert value at index, so the current item at that index is pointed to by the new item at the index
    - [ ] erase(index) - removes node at given index
    - [ ] value_n_from_end(n) - returns the value of the node at the nth position from the end of the list
    - [ ] reverse() - reverses the list
    - [ ] remove_value(value) - removes the first item in the list with this value

- [ ] **Doubly-linked List**
    - [Description (video)](https://www.coursera.org/lecture/data-structures/doubly-linked-lists-jpGKD)
    - No need to implement

---

### 📚 Stack

**時間分配**：3 小時

- [ ] [Stacks (video)](https://www.coursera.org/lecture/data-structures/stacks-UdKzQ)
- [ ] [[Review] Stacks in 3 minutes (video)](https://youtu.be/KcT3aVgrrpU)
- [ ] **Note**: Will not implement. Implementing with the array is trivial

**重點理解**：
- LIFO (Last In First Out) 特性
- 應用場景：function call stack, undo/redo, expression evaluation
- 時間複雜度：push O(1), pop O(1), peek O(1)

---

### 📚 Queue

**時間分配**：6 小時

#### 理論影片（2 小時）

- [ ] [Queue (video)](https://www.coursera.org/lecture/data-structures/queues-EShpq)
- [ ] [Circular buffer/FIFO](https://en.wikipedia.org/wiki/Circular_buffer)
- [ ] [[Review] Queues in 3 minutes (video)](https://youtu.be/D6gu-_tmEpQ)

#### 實作練習（4 小時）

- [ ] **Implement using linked-list, with tail pointer**:
    - enqueue(value) - adds value at a position at the tail
    - dequeue() - returns value and removes least recently added element (front)
    - empty()

- [ ] **Implement using a fixed-sized array**:
    - enqueue(value) - adds item at end of available storage
    - dequeue() - returns value and removes least recently added element
    - empty()
    - full()

- [ ] **Cost**:
    - a bad implementation using a linked list where you enqueue at the head and dequeue at the tail would be O(n) because you'd need the next to last element, causing a full traversal of each dequeue
    - enqueue: O(1) (amortized, linked list and array [probing])
    - dequeue: O(1) (linked list and array)
    - empty: O(1) (linked list and array)

**重點理解**：
- FIFO (First In First Out) 特性
- Circular buffer 的實作技巧
- 應用場景：BFS, task scheduling, buffering

---

### 💻 LeetCode 練習

**時間分配**：6 小時

#### Linked List 題目（5 題）

**Easy**：
1. [ ] [21. Merge Two Sorted Lists](https://leetcode.com/problems/merge-two-sorted-lists/)
2. [ ] [141. Linked List Cycle](https://leetcode.com/problems/linked-list-cycle/)
3. [ ] [206. Reverse Linked List](https://leetcode.com/problems/reverse-linked-list/)
4. [ ] [234. Palindrome Linked List](https://leetcode.com/problems/palindrome-linked-list/)

**Medium**：
1. [ ] [2. Add Two Numbers](https://leetcode.com/problems/add-two-numbers/)
2. [ ] [19. Remove Nth Node From End of List](https://leetcode.com/problems/remove-nth-node-from-end-of-list/)
3. [ ] [143. Reorder List](https://leetcode.com/problems/reorder-list/)

#### Stack 題目（3 題）

**Easy**：
1. [ ] [20. Valid Parentheses](https://leetcode.com/problems/valid-parentheses/)
2. [ ] [155. Min Stack](https://leetcode.com/problems/min-stack/)

**Medium**：
1. [ ] [150. Evaluate Reverse Polish Notation](https://leetcode.com/problems/evaluate-reverse-polish-notation/)

#### Queue 題目（2 題）

**Easy**：
1. [ ] [232. Implement Queue using Stacks](https://leetcode.com/problems/implement-queue-using-stacks/)

**Medium**：
1. [ ] [622. Design Circular Queue](https://leetcode.com/problems/design-circular-queue/)

---

## 學習建議

### Day 1 (Monday) - 7 小時
- 上午（3h）：Linked List 理論影片（CS50, Singly Linked Lists, CS 61B part 1）
- 下午（4h）：Linked List 理論影片（CS 61B part 2, C Code, Review）+ 開始實作

### Day 2 (Tuesday) - 7 小時
- 上午（4h）：實作 Linked List - size(), empty(), value_at(), push_front(), pop_front()
- 下午（3h）：實作 Linked List - push_back(), pop_back(), front(), back()

### Day 3 (Wednesday) - 7 小時
- 上午（4h）：實作 Linked List - insert(), erase(), value_n_from_end()
- 下午（3h）：實作 Linked List - reverse(), remove_value() + 測試

### Day 4 (Thursday) - 7 小時
- 上午（3h）：Stack 理論 + Queue 理論影片
- 下午（4h）：Queue 實作（linked-list 版本 + array 版本）

### Day 5 (Friday) - 7 小時
- 上午（3h）：LeetCode Linked List 題目 × 3
- 下午（4h）：LeetCode Stack × 2 + Queue × 2 + 本週複習

---

## 實作規範

### Singly Linked List (Java)
```java
public class SinglyLinkedList<T> {
    private static class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node<T> head;
    private Node<T> tail;  // optional, but makes push_back O(1)
    private int size;

    public SinglyLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    // TODO: Implement all methods
}
```

### Queue with Linked List (Java)
```java
public class QueueLinkedList<T> {
    private static class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
        }
    }

    private Node<T> front;
    private Node<T> rear;

    // TODO: Implement enqueue, dequeue, empty
}
```

### Queue with Array (Java)
```java
public class QueueArray<T> {
    private Object[] data;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    public QueueArray(int capacity) {
        this.capacity = capacity;
        this.data = new Object[capacity];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    // TODO: Implement circular queue logic
}
```

---

## 重要概念整理

### Linked List vs Array
| 特性 | Array | Linked List |
|------|-------|-------------|
| Random Access | O(1) | O(n) |
| Insert at beginning | O(n) | O(1) |
| Insert at end | O(1) | O(1) with tail, O(n) without |
| Delete at beginning | O(n) | O(1) |
| Memory | Contiguous | Scattered |
| Cache-friendly | Yes | No |

### 雙指標技巧（Two Pointers）
- Fast & Slow pointers（找中點、檢測環）
- 反轉鏈表
- 找倒數第 n 個節點

### Stack 應用
- 括號匹配
- 表達式求值
- DFS 實作
- Undo/Redo 功能

### Queue 應用
- BFS 實作
- Task scheduling
- Buffer management
- Level order traversal

---

## 本週檢核清單

### 知識理解
- [ ] 理解 Linked List 的優缺點
- [ ] 理解何時使用 Array vs Linked List
- [ ] 掌握 pointer/reference 的概念
- [ ] 理解 Stack 的 LIFO 特性與應用
- [ ] 理解 Queue 的 FIFO 特性與應用
- [ ] 理解 Circular Queue 的實作原理

### 實作能力
- [ ] 完成 Singly Linked List 完整實作
- [ ] 完成 Queue (Linked List 版本) 實作
- [ ] 完成 Queue (Array 版本) 實作
- [ ] 能處理 edge cases（空列表、單節點）
- [ ] 能實作 reverse linked list
- [ ] 能用 two pointers 技巧

### 解題能力
- [ ] 完成至少 6 道 Linked List 題目
- [ ] 完成至少 3 道 Stack 題目
- [ ] 完成至少 2 道 Queue 題目
- [ ] 能快速識別適合用 Stack/Queue 的場景

---

## Debug 技巧

### Linked List 常見錯誤
1. 忘記處理 head/tail 為 null 的情況
2. 忘記更新 tail pointer
3. 忘記更新 size
4. Memory leak（在 Java 中較少見，但要注意循環引用）
5. 指針斷裂（在修改過程中丟失節點）

### 建議的測試案例
```java
// Linked List 測試
- 空列表操作
- 單節點操作
- 在頭部插入/刪除
- 在尾部插入/刪除
- 在中間插入/刪除
- reverse 空列表、單節點、多節點

// Queue 測試
- enqueue 到 full
- dequeue 到 empty
- circular 邊界測試
```

---

## 學習心得記錄

### 本週收穫
[在這裡記錄你的學習心得]

### 遇到的困難
[記錄遇到的問題及解決方法]

### 重要發現
[記錄任何重要的領悟或技巧]

---

**下週預告**：Week 03 將學習 Hash Table, Binary Search, Bitwise Operations
