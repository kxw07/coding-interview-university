# Week 03: Hash Table + Binary Search + Bitwise Operations

**學習時間**：2025/11/17 - 2025/11/21（30 小時）

## 本週目標
1. 掌握 Hash Table 的原理與實作
2. 精通 Binary Search 及其變形
3. 理解 Bitwise Operations 的應用

## 學習建議

### Day 1 (Monday) - 6 小時
- 上午（3h）：Week-02 複習 + 完成 Week-02 剩餘 Queue LeetCode × 1
- 下午（3h）：Hash Table 理論影片（Hashing with Chaining, Table Doubling, Open Addressing）

### Day 2 (Tuesday) - 6 小時
- 上午（3h）：Hash Table 理論影片（PyCon, Advanced Hashing）
- 下午（3h）：Hash Table Online Courses（Core Hash Tables, Phone Book Problem）

### Day 3 (Wednesday) - 6 小時
- 上午（3h）：開始實作 Hash Table - hash(), add(), exists()
- 下午（3h）：完成 Hash Table 實作 - get(), remove() + 測試

### Day 4 (Thursday) - 6 小時
- 上午（3h）：Binary Search 理論 + 實作（iterative & recursive）
- 下午（3h）：Bitwise Operations 影片與練習

### Day 5 (Friday) - 6 小時
- 上午（3h）：LeetCode Hash Table 題目 × 3
- 下午（3h）：LeetCode Binary Search × 2 + Bitwise × 1

**註：** 剩餘 LeetCode Binary Search × 1、Bitwise × 1、其他剩餘題目與本週複習移至 Week-04 開始進行

---

## 本週學習內容

### 📚 Hash Table

**時間分配**：18 小時

#### 理論影片（6 小時）

- [ ] **Videos**:
    - [ ] [Hashing with Chaining (video)](https://www.youtube.com/watch?v=0M_kIqhwbFo&list=PLUl4u3cNGP61Oq3tWYp6V_F-5jb5L2iHb&index=8)
    - [ ] [Table Doubling, Karp-Rabin (video)](https://www.youtube.com/watch?v=BRO7mVIFt08&index=9&list=PLUl4u3cNGP61Oq3tWYp6V_F-5jb5L2iHb)
    - [ ] [Open Addressing, Cryptographic Hashing (video)](https://www.youtube.com/watch?v=rvdJDijO2Ro&index=10&list=PLUl4u3cNGP61Oq3tWYp6V_F-5jb5L2iHb)
    - [ ] [PyCon 2010: The Mighty Dictionary (video)](https://www.youtube.com/watch?v=C4Kc8xzcA68)
    - [ ] [PyCon 2017: The Dictionary Even Mightier (video)](https://www.youtube.com/watch?v=66P5FMkWoVU)
    - [ ] [(Advanced) Randomization: Universal & Perfect Hashing (video)](https://www.youtube.com/watch?v=z0lJ2k0sl1g&list=PLUl4u3cNGP6317WaSNfmCvGym2ucw3oGp&index=11)
    - [ ] [(Advanced) Perfect hashing (video)](https://www.youtube.com/watch?v=N0COwN14gt0&list=PL2B4EEwhKD-NbwZ4ezj7gyc_3yNrojKM9&index=4)
    - [ ] [[Review] Hash tables in 4 minutes (video)](https://youtu.be/knV86FlSXJ8)

- [ ] **Online Courses**:
    - [ ] [Core Hash Tables (video)](https://www.coursera.org/lecture/data-structures-optimizing-performance/core-hash-tables-m7UuP)
    - [ ] [Data Structures (video)](https://www.coursera.org/learn/data-structures/home/week/4)
    - [ ] [Phone Book Problem (video)](https://www.coursera.org/lecture/data-structures/phone-book-problem-NYZZP)
    - [ ] **distributed hash tables**:
        - [Instant Uploads And Storage Optimization In Dropbox (video)](https://www.coursera.org/lecture/data-structures/instant-uploads-and-storage-optimization-in-dropbox-DvaIb)
        - [Distributed Hash Tables (video)](https://www.coursera.org/lecture/data-structures/distributed-hash-tables-tvH8H)

#### 實作練習（12 小時）

- [ ] **Implement with array using linear probing**
    - hash(k, m) - m is the size of the hash table
    - add(key, value) - if the key already exists, update value
    - exists(key)
    - get(key)
    - remove(key)

**重點理解**：
- Hashing 函數的設計
- Collision resolution: Chaining vs Open Addressing
- Load factor 與 resizing
- 時間複雜度分析：平均 O(1)，最壞 O(n)

---

### 📚 Binary Search

**時間分配**：8 小時

#### 理論影片（3 小時）

- [ ] [Binary Search (video)](https://www.youtube.com/watch?v=D5SrAga1pno)
- [ ] [Binary Search (video)](https://www.khanacademy.org/computing/computer-science/algorithms/binary-search/a/binary-search)
- [ ] [detail](https://www.topcoder.com/thrive/articles/Binary%20Search)
- [ ] [blueprint](https://leetcode.com/discuss/general-discussion/786126/python-powerful-ultimate-binary-search-template-solved-many-problems)
- [ ] [[Review] Binary search in 4 minutes (video)](https://youtu.be/fDKIpRe8GW4)

#### 實作練習（5 小時）

- [ ] **Implement**:
    - binary search (on a sorted array of integers)
    - binary search using recursion

**重要模板**：
```java
// 標準 Binary Search
public int binarySearch(int[] nums, int target) {
    int left = 0, right = nums.length - 1;

    while (left <= right) {
        int mid = left + (right - left) / 2;

        if (nums[mid] == target) {
            return mid;
        } else if (nums[mid] < target) {
            left = mid + 1;
        } else {
            right = mid - 1;
        }
    }

    return -1;
}
```

---

### 📚 Bitwise Operations

**時間分配**：5 小時

- [ ] [Bits cheat sheet](https://github.com/jwasham/coding-interview-university/blob/main/extras/cheat%20sheets/bits-cheat-sheet.pdf) - you should know many of the powers of 2 from (2^1 to 2^16 and 2^32)

- [ ] **Get a really good understanding of manipulating bits with: &, |, ^, ~, >>, <<**
    - [ ] [words](https://en.wikipedia.org/wiki/Word_(computer_architecture))
    - [ ] **Good intro**:
        [Bit Manipulation (video)](https://www.youtube.com/watch?v=7jkIUgLC29I)
    - [ ] [C Programming Tutorial 2-10: Bitwise Operators (video)](https://www.youtube.com/watch?v=d0AwjSpNXR0)
    - [ ] [Bit Manipulation](https://en.wikipedia.org/wiki/Bit_manipulation)
    - [ ] [Bitwise Operation](https://en.wikipedia.org/wiki/Bitwise_operation)
    - [ ] [Bithacks](https://graphics.stanford.edu/~seander/bithacks.html)
    - [ ] [The Bit Twiddler](https://bits.stephan-brumme.com/)
    - [ ] [The Bit Twiddler Interactive](https://bits.stephan-brumme.com/interactive.html)
    - [ ] [Bit Hacks (video)](https://www.youtube.com/watch?v=ZusiKXcz_ac)
	- [ ] [Practice Operations](https://pconrad.github.io/old_pconrad_cs16/topics/bitOps/)

- [ ] **2s and 1s complement**
    - [Binary: Plusses & Minuses (Why We Use Two's Complement) (video)](https://www.youtube.com/watch?v=lKTsv6iVxV4)
    - [1s Complement](https://en.wikipedia.org/wiki/Ones%27_complement)
    - [2s Complement](https://en.wikipedia.org/wiki/Two%27s_complement)

- [ ] **Count set bits**
    - [4 ways to count bits in a byte (video)](https://youtu.be/Hzuzo9NJrlc)
    - [Count Bits](https://graphics.stanford.edu/~seander/bithacks.html#CountBitsSetKernighan)
    - [How To Count The Number Of Set Bits In a 32 Bit Integer](http://stackoverflow.com/questions/109023/how-to-count-the-number-of-set-bits-in-a-32-bit-integer)

- [ ] **Swap values**:
    - [Swap](https://bits.stephan-brumme.com/swap.html)

- [ ] **Absolute value**:
    - [Absolute Integer](https://bits.stephan-brumme.com/absInteger.html)

---

### 💻 LeetCode 練習

**時間分配**：4 小時

#### Hash Table 題目（5 題）

**Easy**：
1. [ ] [1. Two Sum](https://leetcode.com/problems/two-sum/) (用 HashMap 解)
2. [ ] [217. Contains Duplicate](https://leetcode.com/problems/contains-duplicate/)
3. [ ] [242. Valid Anagram](https://leetcode.com/problems/valid-anagram/)
4. [ ] [383. Ransom Note](https://leetcode.com/problems/ransom-note/)

**Medium**：
1. [ ] [49. Group Anagrams](https://leetcode.com/problems/group-anagrams/)
2. [ ] [128. Longest Consecutive Sequence](https://leetcode.com/problems/longest-consecutive-sequence/)
3. [ ] [146. LRU Cache](https://leetcode.com/problems/lru-cache/)

#### Binary Search 題目（4 題）

**Easy**：
1. [ ] [704. Binary Search](https://leetcode.com/problems/binary-search/)
2. [ ] [35. Search Insert Position](https://leetcode.com/problems/search-insert-position/)

**Medium**：
1. [ ] [33. Search in Rotated Sorted Array](https://leetcode.com/problems/search-in-rotated-sorted-array/)
2. [ ] [153. Find Minimum in Rotated Sorted Array](https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/)
3. [ ] [34. Find First and Last Position of Element in Sorted Array](https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/)

#### Bitwise Operations 題目（3 題）

**Easy**：
1. [ ] [191. Number of 1 Bits](https://leetcode.com/problems/number-of-1-bits/)
2. [ ] [268. Missing Number](https://leetcode.com/problems/missing-number/)
3. [ ] [136. Single Number](https://leetcode.com/problems/single-number/)

**Medium**：
1. [ ] [137. Single Number II](https://leetcode.com/problems/single-number-ii/)

---

## 重要概念整理

### Hash Table 核心概念

**Hash Function 設計原則**：
- Deterministic：相同輸入永遠產生相同輸出
- Uniform distribution：均勻分布，減少 collision
- Fast to compute：計算快速

**Collision Resolution**：
1. **Chaining**：用 linked list 存放碰撞的元素
   - 優點：簡單，適合 load factor > 1
   - 缺點：需要額外記憶體存指針

2. **Open Addressing**：尋找下一個空位
   - Linear Probing：線性搜尋下一個位置
   - Quadratic Probing：平方搜尋
   - Double Hashing：用第二個 hash function

**Load Factor**：α = n / m (n = 元素數量, m = table size)
- Chaining：建議 α < 1
- Open Addressing：建議 α < 0.7
- 當超過閾值時，需要 resize (通常擴大 2 倍)

### Binary Search 重要模板

**標準模板**：找到 target，回傳 index
```java
int left = 0, right = nums.length - 1;
while (left <= right) {
    int mid = left + (right - left) / 2;
    if (nums[mid] == target) return mid;
    else if (nums[mid] < target) left = mid + 1;
    else right = mid - 1;
}
return -1;
```

**找左邊界**：找第一個 >= target 的位置
```java
int left = 0, right = nums.length;
while (left < right) {
    int mid = left + (right - left) / 2;
    if (nums[mid] < target) left = mid + 1;
    else right = mid;
}
return left;
```

**找右邊界**：找最後一個 <= target 的位置
```java
int left = 0, right = nums.length;
while (left < right) {
    int mid = left + (right - left) / 2;
    if (nums[mid] <= target) left = mid + 1;
    else right = mid;
}
return left - 1;
```

### Bitwise Operations 常用技巧

**基本操作**：
```java
// 設置第 i 位為 1
x | (1 << i)

// 清除第 i 位為 0
x & ~(1 << i)

// 切換第 i 位
x ^ (1 << i)

// 檢查第 i 位是否為 1
(x & (1 << i)) != 0

// 清除最右邊的 1
x & (x - 1)

// 取得最右邊的 1
x & (-x)

// 判斷是否為 2 的冪次
x != 0 && (x & (x - 1)) == 0

// 兩數交換（不用暫存變數）
a ^= b;
b ^= a;
a ^= b;
```

**Powers of 2**（需要記住）：
- 2^1 = 2
- 2^2 = 4
- 2^3 = 8
- 2^4 = 16
- 2^5 = 32
- 2^6 = 64
- 2^7 = 128
- 2^8 = 256
- 2^10 = 1024 (1K)
- 2^16 = 65536 (64K)
- 2^20 = 1048576 (1M)
- 2^32 = 4294967296 (4B)

---

## 實作規範

### Hash Table (Java)
```java
public class HashTable<K, V> {
    private static class Entry<K, V> {
        K key;
        V value;
        Entry<K, V> next;  // for chaining

        Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    private Entry<K, V>[] table;
    private int size;
    private int capacity;
    private static final double LOAD_FACTOR = 0.75;

    @SuppressWarnings("unchecked")
    public HashTable(int capacity) {
        this.capacity = capacity;
        this.table = (Entry<K, V>[]) new Entry[capacity];
        this.size = 0;
    }

    private int hash(K key, int m) {
        return Math.abs(key.hashCode()) % m;
    }

    // TODO: Implement add, exists, get, remove
}
```

---

## 本週檢核清單

### 知識理解
- [ ] 理解 Hash Function 的設計原則
- [ ] 理解 Chaining vs Open Addressing
- [ ] 理解 Load Factor 與 Resizing
- [ ] 掌握 Binary Search 的三種模板
- [ ] 理解 Bitwise Operations 的常用技巧
- [ ] 記住 2 的冪次（2^1 到 2^32）

### 實作能力
- [ ] 完成 Hash Table 完整實作（with chaining）
- [ ] 完成 Binary Search（iterative & recursive）
- [ ] 能正確處理 Binary Search 的邊界條件
- [ ] 能運用 Bitwise Operations 解決問題

### 解題能力
- [ ] 完成至少 5 道 Hash Table 題目
- [ ] 完成至少 4 道 Binary Search 題目
- [ ] 完成至少 3 道 Bitwise 題目
- [ ] 能識別何時使用 Hash Table
- [ ] 能識別 Binary Search 的變形問題

---

## 常見陷阱

### Hash Table
1. 忘記處理 key 為 null 的情況
2. Hash function 回傳負數（要取絕對值）
3. Resize 時忘記 rehash 所有元素
4. Collision 處理不當

### Binary Search
1. 無限迴圈（left/right 更新錯誤）
2. Integer overflow：`mid = (left + right) / 2` 可能溢位
   - 正確寫法：`mid = left + (right - left) / 2`
3. 邊界條件：`left <= right` vs `left < right`
4. 忘記檢查空陣列

### Bitwise Operations
1. 優先序錯誤（需要加括號）
2. Signed vs Unsigned 的差異
3. 左移可能導致符號位元改變

---

## 學習心得記錄

### 本週收穫
[在這裡記錄你的學習心得]

### 遇到的困難
[記錄遇到的問題及解決方法]

### 重要發現
[記錄任何重要的領悟或技巧]

---

**下週預告**：Week 04 將學習 Trees 基礎與 Binary Search Trees
