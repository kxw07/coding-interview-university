# Week 09: Recursion + Dynamic Programming 入門

**學習時間**：2025/12/29 - 2026/01/02（30 小時）

## 本週目標
1. 深入理解遞迴思維
2. 掌握 Dynamic Programming 基本概念
3. 學習 DP 的常見模式

## 學習建議

**註：** 本週開始前請先完成上週未完成的內容與複習

### Day 1 (Monday) - 6 小時
- 上午（3h）：Week-08 複習 + 剩餘 LeetCode 題目
- 下午（3h）：Stanford Recursion Lecture 8 + Lecture 9

### Day 2 (Tuesday) - 6 小時
- 上午（3h）：Stanford Recursion Lecture 10 + Lecture 11
- 下午（3h）：Tail Recursion + 5 Steps for Solving Recursive Problems + Backtracking Blueprint

### Day 3 (Wednesday) - 6 小時
- 上午（3h）：Skiena DP Lecture 19 + Lecture 20 (Edit Distance)
- 下午（3h）：Skiena DP Lecture 20 (continued) + Lecture 21

### Day 4 (Thursday) - 6 小時
- 上午（3h）：Skiena DP Lecture 22 + Simonson DP 0
- 下午（3h）：Simonson DP I + Simonson DP II + Yale Lecture notes

### Day 5 (Friday) - 6 小時
- 上午（3h）：Coursera DP + LeetCode Easy Recursion × 2
- 下午（3h）：LeetCode Easy DP × 2 + Medium DP × 1

**註：** 剩餘 LeetCode 題目與本週複習移至下週開始進行

---

## 本週學習內容

### 📚 Recursion

**時間分配**：10 小時

- [ ] **Stanford lectures on recursion & backtracking**:
    - [ ] [Lecture 8 | Programming Abstractions (video)](https://www.youtube.com/watch?v=gl3emqCuueQ&list=PLFE6E58F856038C69&index=8)
    - [ ] [Lecture 9 | Programming Abstractions (video)](https://www.youtube.com/watch?v=uFJhEPrbycQ&list=PLFE6E58F856038C69&index=9)
    - [ ] [Lecture 10 | Programming Abstractions (video)](https://www.youtube.com/watch?v=NdF1QDTRkck&index=10&list=PLFE6E58F856038C69)
    - [ ] [Lecture 11 | Programming Abstractions (video)](https://www.youtube.com/watch?v=p-gpaIGRCQI&list=PLFE6E58F856038C69&index=11)

- [ ] **When it is appropriate to use it?**
- [ ] **How is tail recursion better than not?**
    - [ ] [What Is Tail Recursion Why Is It So Bad?](https://www.quora.com/What-is-tail-recursion-Why-is-it-so-bad)
    - [ ] [Tail Recursion (video)](https://www.coursera.org/learn/programming-languages/lecture/YZic1/tail-recursion)

- [ ] [5 Simple Steps for Solving Any Recursive Problem(video)](https://youtu.be/ngCos392W4w)

**Backtracking Blueprint**:
- [Java](https://leetcode.com/problems/combination-sum/discuss/16502/A-general-approach-to-backtracking-questions-in-Java-(Subsets-Permutations-Combination-Sum-Palindrome-Partitioning))
- [Python](https://leetcode.com/problems/combination-sum/discuss/429538/General-Backtracking-questions-solutions-in-Python-for-reference-%3A)

---

### 📚 Dynamic Programming

**時間分配**：15 小時

You probably won't see any dynamic programming problems in your interview, but it's worth being able to recognize a problem as being a candidate for dynamic programming.

This subject can be pretty difficult, as each DP soluble problem must be defined as a recursion relation, and coming up with it can be tricky.

I suggest looking at many examples of DP problems until you have a solid understanding of the pattern involved.

#### 理論影片（10 小時）

- [ ] **Videos**:
    - [ ] [Skiena: CSE373 2020 - Lecture 19 - Introduction to Dynamic Programming (video)](https://www.youtube.com/watch?v=wAA0AMfcJHQ&list=PLOtl7M3yp-DX6ic0HGT0PUX_wiNmkWkXx&index=18)
    - [ ] [Skiena: CSE373 2020 - Lecture 20 - Edit Distance (video)](https://www.youtube.com/watch?v=T3A4jlHlhtA&list=PLOtl7M3yp-DX6ic0HGT0PUX_wiNmkWkXx&index=19)
    - [ ] [Skiena: CSE373 2020 - Lecture 20 - Edit Distance (continued) (video)](https://www.youtube.com/watch?v=iPnPVcZmRbE&list=PLOtl7M3yp-DX6ic0HGT0PUX_wiNmkWkXx&index=20)
    - [ ] [Skiena: CSE373 2020 - Lecture 21 - Dynamic Programming (video)](https://www.youtube.com/watch?v=2xPE4Wq8coQ&list=PLOtl7M3yp-DX6ic0HGT0PUX_wiNmkWkXx&index=21)
    - [ ] [Skiena: CSE373 2020 - Lecture 22 - Dynamic Programming and Review (video)](https://www.youtube.com/watch?v=Yh3RzqQGsyI&list=PLOtl7M3yp-DX6ic0HGT0PUX_wiNmkWkXx&index=22)
    - [ ] [Simonson: Dynamic Programming 0 (starts at 59:18) (video)](https://youtu.be/J5aJEcOr6Eo?list=PLFDnELG9dpVxQCxuD-9BSy2E7BWY3t5Sm&t=3558)
    - [ ] [Simonson: Dynamic Programming I - Lecture 11 (video)](https://www.youtube.com/watch?v=0EzHjQ_SOeU&index=11&list=PLFDnELG9dpVxQCxuD-9BSy2E7BWY3t5Sm)
    - [ ] [Simonson: Dynamic programming II - Lecture 12 (video)](https://www.youtube.com/watch?v=v1qiRwuJU7g&list=PLFDnELG9dpVxQCxuD-9BSy2E7BWY3t5Sm&index=12)
    - [ ] List of individual DP problems (each is short):
        [Dynamic Programming (video)](https://www.youtube.com/playlist?list=PLrmLmBdmIlpsHaNTPP_jHHDx_os9ItYXr)

- [ ] **Yale Lecture notes**:
    - [ ] [Dynamic Programming](http://www.cs.yale.edu/homes/aspnes/classes/223/notes.html#dynamicProgramming)

- [ ] **Coursera**:
    - [ ] [The RNA secondary structure problem (video)](https://www.coursera.org/learn/algorithmic-thinking-2/lecture/80RrW/the-rna-secondary-structure-problem)
    - [ ] [A dynamic programming algorithm (video)](https://www.coursera.org/learn/algorithmic-thinking-2/lecture/PSonq/a-dynamic-programming-algorithm)
    - [ ] [Illustrating the DP algorithm (video)](https://www.coursera.org/learn/algorithmic-thinking-2/lecture/oUEK2/illustrating-the-dp-algorithm)
    - [ ] [Running time of the DP algorithm (video)](https://www.coursera.org/learn/algorithmic-thinking-2/lecture/nfK2r/running-time-of-the-dp-algorithm)
    - [ ] [DP vs. recursive implementation (video)](https://www.coursera.org/learn/algorithmic-thinking-2/lecture/M999a/dp-vs-recursive-implementation)
    - [ ] [Global pairwise sequence alignment (video)](https://www.coursera.org/learn/algorithmic-thinking-2/lecture/UZ7o6/global-pairwise-sequence-alignment)
    - [ ] [Local pairwise sequence alignment (video)](https://www.coursera.org/learn/algorithmic-thinking-2/lecture/WnNau/local-pairwise-sequence-alignment)

---

### 💻 LeetCode 練習

**時間分配**：10 小時

#### Recursion & Backtracking（6 題）

**Easy**：
1. [ ] [509. Fibonacci Number](https://leetcode.com/problems/fibonacci-number/)
2. [ ] [70. Climbing Stairs](https://leetcode.com/problems/climbing-stairs/)

**Medium**：
1. [ ] [46. Permutations](https://leetcode.com/problems/permutations/)
2. [ ] [78. Subsets](https://leetcode.com/problems/subsets/)
3. [ ] [39. Combination Sum](https://leetcode.com/problems/combination-sum/)
4. [ ] [22. Generate Parentheses](https://leetcode.com/problems/generate-parentheses/)

#### Dynamic Programming 基礎（6 題）

**Easy**:
1. [ ] [70. Climbing Stairs](https://leetcode.com/problems/climbing-stairs/) (用 DP 重做)
2. [ ] [746. Min Cost Climbing Stairs](https://leetcode.com/problems/min-cost-climbing-stairs/)
3. [ ] [198. House Robber](https://leetcode.com/problems/house-robber/)

**Medium**:
1. [ ] [5. Longest Palindromic Substring](https://leetcode.com/problems/longest-palindromic-substring/)
2. [ ] [62. Unique Paths](https://leetcode.com/problems/unique-paths/)
3. [ ] [322. Coin Change](https://leetcode.com/problems/coin-change/)

---

## 重要概念

### DP 解題步驟

1. **定義狀態**：dp[i] 或 dp[i][j] 代表什麼
2. **找出遞推關係**：dp[i] 如何從之前的狀態得出
3. **初始化**：base case
4. **計算順序**：從小到大或從大到小
5. **答案位置**：通常是 dp[n] 或 dp[n][m]

### DP 常見模式

#### 1. Fibonacci 類型
```java
// Climbing Stairs
public int climbStairs(int n) {
    if (n <= 2) return n;
    int[] dp = new int[n + 1];
    dp[1] = 1;
    dp[2] = 2;
    for (int i = 3; i <= n; i++) {
        dp[i] = dp[i-1] + dp[i-2];
    }
    return dp[n];
}
```

#### 2. 0/1 Knapsack 類型
```java
// House Robber
public int rob(int[] nums) {
    if (nums.length == 0) return 0;
    if (nums.length == 1) return nums[0];

    int[] dp = new int[nums.length];
    dp[0] = nums[0];
    dp[1] = Math.max(nums[0], nums[1]);

    for (int i = 2; i < nums.length; i++) {
        dp[i] = Math.max(dp[i-1], dp[i-2] + nums[i]);
    }

    return dp[nums.length - 1];
}
```

---

## 本週檢核清單

### 知識理解
- [ ] 理解遞迴的本質
- [ ] 理解 Tail Recursion
- [ ] 理解 Backtracking 模板
- [ ] 理解 DP 與遞迴的關係
- [ ] 理解 Memoization vs Tabulation

### 實作能力
- [ ] 能寫出 Backtracking 模板
- [ ] 能從遞迴轉換為 DP
- [ ] 能識別 DP 問題
- [ ] 能定義 DP 狀態

### 解題能力
- [ ] 完成至少 6 道 Recursion 題目
- [ ] 完成至少 6 道 DP 基礎題目
- [ ] 能識別 DP 的常見模式

---

## 學習心得記錄

### 本週收穫
[在這裡記錄你的學習心得]

### 遇到的困難
[記錄遇到的問題及解決方法]

---

**下週預告**：Week 10 將深入學習 Dynamic Programming
