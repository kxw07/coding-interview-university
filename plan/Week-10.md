# Week 10: Dynamic Programming 深入

**學習時間**：2026/01/06 - 2026/01/10（35 小時）

## 本週目標
1. 掌握 DP 的各種模式
2. 大量練習 DP 題目
3. 能快速識別並解決 DP 問題

## 本週學習內容

### 📚 Dynamic Programming 進階

**時間分配**：10 小時

- 重新複習上週的 DP 影片
- 深入研究各種 DP 模式
- 學習空間優化技巧

---

### 💻 LeetCode 密集練習

**時間分配**：25 小時

本週專注於大量 DP 練習，每天至少完成 3-4 題

#### Linear DP（5 題）

1. [ ] [300. Longest Increasing Subsequence](https://leetcode.com/problems/longest-increasing-subsequence/)
2. [ ] [152. Maximum Product Subarray](https://leetcode.com/problems/maximum-product-subarray/)
3. [ ] [139. Word Break](https://leetcode.com/problems/word-break/)
4. [ ] [279. Perfect Squares](https://leetcode.com/problems/perfect-squares/)
5. [ ] [91. Decode Ways](https://leetcode.com/problems/decode-ways/)

#### 2D DP（6 題）

1. [ ] [62. Unique Paths](https://leetcode.com/problems/unique-paths/)
2. [ ] [63. Unique Paths II](https://leetcode.com/problems/unique-paths-ii/)
3. [ ] [64. Minimum Path Sum](https://leetcode.com/problems/minimum-path-sum/)
4. [ ] [72. Edit Distance](https://leetcode.com/problems/edit-distance/)
5. [ ] [1143. Longest Common Subsequence](https://leetcode.com/problems/longest-common-subsequence/)
6. [ ] [97. Interleaving String](https://leetcode.com/problems/interleaving-string/)

#### Knapsack DP（4 題）

1. [ ] [416. Partition Equal Subset Sum](https://leetcode.com/problems/partition-equal-subset-sum/)
2. [ ] [494. Target Sum](https://leetcode.com/problems/target-sum/)
3. [ ] [474. Ones and Zeroes](https://leetcode.com/problems/ones-and-zeroes/)
4. [ ] [518. Coin Change 2](https://leetcode.com/problems/coin-change-2/)

#### String DP（3 題）

1. [ ] [647. Palindromic Substrings](https://leetcode.com/problems/palindromic-substrings/)
2. [ ] [5. Longest Palindromic Substring](https://leetcode.com/problems/longest-palindromic-substring/)
3. [ ] [516. Longest Palindromic Subsequence](https://leetcode.com/problems/longest-palindromic-subsequence/)

#### Hard DP（3 題）

1. [ ] [10. Regular Expression Matching](https://leetcode.com/problems/regular-expression-matching/)
2. [ ] [44. Wildcard Matching](https://leetcode.com/problems/wildcard-matching/)
3. [ ] [123. Best Time to Buy and Sell Stock III](https://leetcode.com/problems/best-time-to-buy-and-sell-stock-iii/)

---

## DP 常見模式總結

### 1. Linear DP
```java
// 一維 DP，通常 dp[i] 依賴 dp[i-1], dp[i-2] 等
for (int i = 1; i < n; i++) {
    dp[i] = f(dp[i-1], dp[i-2], ...);
}
```

### 2. 2D DP
```java
// 二維 DP，dp[i][j] 依賴 dp[i-1][j], dp[i][j-1] 等
for (int i = 1; i <= m; i++) {
    for (int j = 1; j <= n; j++) {
        dp[i][j] = f(dp[i-1][j], dp[i][j-1], ...);
    }
}
```

### 3. Knapsack DP
```java
// 0/1 Knapsack
for (int i = 0; i < items.length; i++) {
    for (int j = capacity; j >= weight[i]; j--) {
        dp[j] = Math.max(dp[j], dp[j - weight[i]] + value[i]);
    }
}
```

### 4. Interval DP
```java
// 區間 DP，從小區間到大區間
for (int len = 2; len <= n; len++) {
    for (int i = 0; i <= n - len; i++) {
        int j = i + len - 1;
        dp[i][j] = f(dp[i][k], dp[k+1][j], ...);
    }
}
```

---

## 本週學習計劃

### Day 1 (Monday) - Linear DP
完成 5 道 Linear DP 題目

### Day 2 (Tuesday) - 2D DP (Part 1)
完成 3 道 2D DP 題目

### Day 3 (Wednesday) - 2D DP (Part 2)
完成 3 道 2D DP 題目

### Day 4 (Thursday) - Knapsack & String DP
完成 4 道 Knapsack + 2 道 String DP

### Day 5 (Friday) - Hard DP & 複習
完成 3 道 Hard DP + 複習本週所有題目

---

## 本週檢核清單

### 知識理解
- [ ] 掌握 Linear DP 模式
- [ ] 掌握 2D DP 模式
- [ ] 掌握 Knapsack DP 模式
- [ ] 掌握 Interval DP 模式
- [ ] 理解空間優化技巧

### 實作能力
- [ ] 能快速寫出 DP 模板
- [ ] 能進行空間優化
- [ ] 能處理複雜的狀態轉移

### 解題能力
- [ ] 完成至少 20 道 DP 題目
- [ ] 能在 30 分鐘內解決 Medium DP 題目
- [ ] 能識別 DP 問題的類型

---

## 學習心得記錄

### 本週收穫
[在這裡記錄你的學習心得]

### DP 解題心得
[記錄 DP 解題的技巧與心得]

---

**下週預告**：Week 11 將學習 Design Patterns
