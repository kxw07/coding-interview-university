# Week 13: Testing, String Algorithms, Tries

**學習時間**：2026/01/26 - 2026/01/30（30 小時）

## 本週目標
1. 理解軟體測試的概念（利用你的經驗）
2. 學習字串匹配演算法
3. 掌握 Trie 資料結構

## 本週學習內容

### 📚 Testing

**時間分配**：8 小時

- **To cover**:
    - how unit testing works
    - what are mock objects
    - what is integration testing
    - what is dependency injection
- [ ] [Agile Software Testing with James Bach (video)](https://www.youtube.com/watch?v=SAhJf36_u5U)
- [ ] [Open Lecture by James Bach on Software Testing (video)](https://www.youtube.com/watch?v=ILkT_HV9DVU)
- [ ] [Steve Freeman - Test-Driven Development (that's not what we meant) (video)](https://vimeo.com/83960706)
- [ ] **Dependency injection**:
    - [ ] [video](https://www.youtube.com/watch?v=IKD2-MAkXyQ)
    - [ ] [Tao Of Testing](http://jasonpolites.github.io/tao-of-testing/ch3-1.1.html)
- [ ] [How to write tests](http://jasonpolites.github.io/tao-of-testing/ch4-1.1.html)

---

### 📚 String Searching & Manipulations

**時間分配**：10 小時

- [ ] [Sedgewick - Suffix Arrays (video)](https://www.coursera.org/learn/algorithms-part2/lecture/TH18W/suffix-arrays)
- [ ] [Sedgewick - Substring Search (videos)](https://www.coursera.org/learn/algorithms-part2/home/week/4)
    - [ ] [1. Introduction to Substring Search](https://www.coursera.org/lecture/algorithms-part2/introduction-to-substring-search-n3ZpG)
    - [ ] [2. Brute-Force Substring Search](https://www.coursera.org/learn/algorithms-part2/lecture/2Kn5i/brute-force-substring-search)
    - [ ] [3. Knuth-Morris Pratt](https://www.coursera.org/learn/algorithms-part2/lecture/TAtDr/knuth-morris-pratt)
    - [ ] [4. Boyer-Moore](https://www.coursera.org/learn/algorithms-part2/lecture/CYxOT/boyer-moore)
    - [ ] [5. Rabin-Karp](https://www.coursera.org/lecture/algorithms-part2/rabin-karp-3KiqT)
- [ ] [Search pattern in a text (video)](https://www.coursera.org/learn/data-structures/lecture/tAfHI/search-pattern-in-text)

---

### 📚 Tries

**時間分配**：8 小時

- Note there are different kinds of tries. Some have prefixes, some don't, and some use strings instead of bits to track the path
- I read through the code, but will not implement
- [ ] [Sedgewick - Tries (3 videos)](https://www.coursera.org/learn/algorithms-part2/home/week/4)
    - [ ] [1. R Way Tries](https://www.coursera.org/learn/algorithms-part2/lecture/CPVdr/r-way-tries)
    - [ ] [2. Ternary Search Tries](https://www.coursera.org/learn/algorithms-part2/lecture/yQM8K/ternary-search-tries)
    - [ ] [3. Character Based Operations](https://www.coursera.org/learn/algorithms-part2/lecture/jwNmV/character-based-operations)
- [ ] [Notes on Data Structures and Programming Techniques](http://www.cs.yale.edu/homes/aspnes/classes/223/notes.html#Tries)
- [ ] **Short course videos**:
    - [ ] [Introduction To Tries (video)](https://www.coursera.org/learn/data-structures-optimizing-performance/lecture/08Xyf/core-introduction-to-tries)
    - [ ] [Performance Of Tries (video)](https://www.coursera.org/learn/data-structures-optimizing-performance/lecture/PvlZW/core-performance-of-tries)
    - [ ] [Implementing A Trie (video)](https://www.coursera.org/learn/data-structures-optimizing-performance/lecture/DFvd3/core-implementing-a-trie)
- [ ] [The Trie: A Neglected Data Structure](https://www.toptal.com/java/the-trie-a-neglected-data-structure)
- [ ] [TopCoder - Using Tries](https://www.topcoder.com/thrive/articles/Using%20Tries)
- [ ] [Stanford Lecture (real-world use case) (video)](https://www.youtube.com/watch?v=TJ8SkcUSdbU)
- [ ] [MIT, Advanced Data Structures, Strings (can get pretty obscure about halfway through) (video)](https://www.youtube.com/watch?v=NinWEPPrkDQ&index=16&list=PLUl4u3cNGP61hsJNdULdudlRL493b-XZf)

---

### 📚 其他主題（選修）

**時間分配**：4 小時

- [ ] **Floating Point Numbers**
    - [ ] simple 8-bit: [Representation of Floating Point Numbers - 1 (video)](https://www.youtube.com/watch?v=ji3SfClm8TU)

- [ ] **Unicode**
    - [ ] [The Absolute Minimum Every Software Developer Must Know About Unicode](http://www.joelonsoftware.com/articles/Unicode.html)
    - [ ] [What Every Programmer Needs To Know About Encodings And Character Sets](http://kunststube.net/encoding/)

- [ ] **Endianness**
    - [ ] [Big And Little Endian](https://web.archive.org/web/20180107141940/http://www.cs.umd.edu:80/class/sum2003/cmsc311/Notes/Data/endian.html)
    - [ ] [Big Endian Vs Little Endian (video)](https://www.youtube.com/watch?v=JrNF0KRAlyo)

---

### 💻 LeetCode - String & Trie 題目

**時間分配**：5 小時

#### String 題目（5 題）

**Easy**:
1. [ ] [28. Implement strStr()](https://leetcode.com/problems/implement-strstr/)

**Medium**:
1. [ ] [3. Longest Substring Without Repeating Characters](https://leetcode.com/problems/longest-substring-without-repeating-characters/)
2. [ ] [5. Longest Palindromic Substring](https://leetcode.com/problems/longest-palindromic-substring/)
3. [ ] [647. Palindromic Substrings](https://leetcode.com/problems/palindromic-substrings/)

**Hard**:
1. [ ] [76. Minimum Window Substring](https://leetcode.com/problems/minimum-window-substring/)

#### Trie 題目（4 題）

**Medium**:
1. [ ] [208. Implement Trie (Prefix Tree)](https://leetcode.com/problems/implement-trie-prefix-tree/)
2. [ ] [211. Design Add and Search Words Data Structure](https://leetcode.com/problems/design-add-and-search-words-data-structure/)
3. [ ] [677. Map Sum Pairs](https://leetcode.com/problems/map-sum-pairs/)
4. [ ] [648. Replace Words](https://leetcode.com/problems/replace-words/)

---

## Trie 實作

```java
class TrieNode {
    Map<Character, TrieNode> children;
    boolean isEndOfWord;

    public TrieNode() {
        children = new HashMap<>();
        isEndOfWord = false;
    }
}

class Trie {
    private TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    public void insert(String word) {
        TrieNode node = root;
        for (char ch : word.toCharArray()) {
            node.children.putIfAbsent(ch, new TrieNode());
            node = node.children.get(ch);
        }
        node.isEndOfWord = true;
    }

    public boolean search(String word) {
        TrieNode node = searchPrefix(word);
        return node != null && node.isEndOfWord;
    }

    public boolean startsWith(String prefix) {
        return searchPrefix(prefix) != null;
    }

    private TrieNode searchPrefix(String prefix) {
        TrieNode node = root;
        for (char ch : prefix.toCharArray()) {
            if (!node.children.containsKey(ch)) {
                return null;
            }
            node = node.children.get(ch);
        }
        return node;
    }
}
```

---

## 學習建議

**註：** 本週開始前請先完成上週未完成的內容與複習

### Day 1 (Monday) - 6 小時
- 上午（3h）：Week-12 複習 + Testing 影片（如未完成）
- 下午（3h）：String Searching 影片（Rabin-Karp, KMP）

### Day 2 (Tuesday) - 6 小時
- 上午（3h）：Tries 理論影片
- 下午（3h）：實作 Trie

### Day 3 (Wednesday) - 6 小時
- 上午（3h）：完成 Trie 實作 + 測試
- 下午（3h）：LeetCode String × 3

### Day 4 (Thursday) - 6 小時
- 上午（3h）：LeetCode Trie × 2
- 下午（3h）：LeetCode 混合題目 × 3

### Day 5 (Friday) - 6 小時
- 上午（3h）：LeetCode 混合題目 × 3
- 下午（3h）：本週總複習

---

## 本週檢核清單

### 知識理解
- [ ] 理解單元測試與整合測試
- [ ] 理解 Mock 與 Dependency Injection
- [ ] 理解字串匹配演算法（KMP, Boyer-Moore）
- [ ] 理解 Trie 的特性與應用
- [ ] 理解 Unicode 與編碼

### 實作能力
- [ ] 能實作 Trie
- [ ] 能實作基本的字串匹配
- [ ] 理解如何撰寫單元測試

### 解題能力
- [ ] 完成至少 5 道 String 題目
- [ ] 完成至少 4 道 Trie 題目

---

## 學習心得記錄

### 本週收穫
[在這裡記錄你的學習心得]

---

**下週預告**：Week 14 將學習 Networking 與其他剩餘主題
