# Week 04: Trees 基礎 + Binary Search Trees

**學習時間**：2025/11/24 - 2025/11/28（30 小時）

## 本週目標
1. 理解 Tree 的基本概念與遍歷方法
2. 掌握 Binary Search Tree 的特性與實作
3. 熟練 BFS 和 DFS 算法

## 學習建議

### Day 1 (Monday) - 6 小時
- 上午（3h）：Week-03 複習 + 完成 Week-03 剩餘 LeetCode (Binary Search × 1, Bitwise × 1, 其他剩餘題目)
- 下午（3h）：Trees Intro 影片（Intro to Trees, Tree Traversal）

### Day 2 (Tuesday) - 6 小時
- 上午（3h）：Trees Intro 影片（BFS & DFS）+ Review 影片
- 下午（3h）：練習手寫遍歷 + BST 理論影片（Review, Introduction）

### Day 3 (Wednesday) - 6 小時
- 上午（3h）：BST 理論影片（MIT）+ BST C/C++ 實作影片（前 4 個）
- 下午（3h）：BST C/C++ 實作影片（後 6 個：前 3 個）

### Day 4 (Thursday) - 6 小時
- 上午（3h）：BST C/C++ 實作影片（後 6 個：後 3 個）+ 開始實作 BST - insert, get_node_count
- 下午（3h）：實作 BST - print_values, delete_tree, is_in_tree

### Day 5 (Friday) - 6 小時
- 上午（3h）：實作 BST - get_height, get_min, get_max, is_binary_search_tree
- 下午（3h）：實作 BST - delete_value, get_successor + 開始 BST 測試

**註：** 完成 BST 測試、LeetCode Traversal 題目 × 3、LeetCode Tree & BST 題目各 2-3 題與本週複習移至 Week-05 開始進行

---

## 本週學習內容

### 📚 Trees - Intro

**時間分配**：8 小時

#### 理論影片（8 小時）

- [ ] [Intro to Trees (video)](https://www.coursera.org/lecture/data-structures/trees-95qda)
- [ ] [Tree Traversal (video)](https://www.coursera.org/lecture/data-structures/tree-traversal-fr51b)
- [ ] [BFS(breadth-first search) and DFS(depth-first search) (video)](https://www.youtube.com/watch?v=uWL6FJhq5fM)
    - **BFS notes**:
       - level order (BFS, using queue)
       - time complexity: O(n)
       - space complexity: best: O(1), worst: O(n/2)=O(n)
    - **DFS notes**:
        - time complexity: O(n)
        - space complexity:
            best: O(log n) - avg. height of tree
            worst: O(n)
        - inorder (DFS: left, self, right)
        - postorder (DFS: left, right, self)
        - preorder (DFS: self, left, right)
- [ ] [[Review] Breadth-first search in 4 minutes (video)](https://youtu.be/HZ5YTanv5QE)
- [ ] [[Review] Depth-first search in 4 minutes (video)](https://youtu.be/Urx87-NMm6c)
- [ ] [[Review] Tree Traversal (playlist) in 11 minutes (video)](https://www.youtube.com/playlist?list=PL9xmBV_5YoZO1JC2RgEi04nLy6D-rKk6b)

**核心概念**：
- Tree 的基本術語：root, leaf, parent, child, sibling, height, depth
- Binary Tree vs General Tree
- Complete Binary Tree, Full Binary Tree, Perfect Binary Tree
- Tree Traversal 的四種方式及其應用

---

### 📚 Binary Search Trees (BSTs)

**時間分配**：20 小時

#### 理論影片（8 小時）

- [ ] [Binary Search Tree Review (video)](https://www.youtube.com/watch?v=x6At0nzX92o&index=1&list=PLA5Lqm4uh9Bbq-E0ZnqTIa8LRaL77ica6)
- [ ] [Introduction (video)](https://www.coursera.org/learn/data-structures/lecture/E7cXP/introduction)
- [ ] [MIT (video)](https://www.youtube.com/watch?v=76dhtgZt38A&ab_channel=MITOpenCourseWare)

- [ ] **C/C++**:
    - [ ] [Binary search tree - Implementation in C/C++ (video)](https://www.youtube.com/watch?v=COZK7NATh4k&list=PL2_aWCzGMAwI3W_JlcBbtYTwiQSsOTa6P&index=28)
    - [ ] [BST implementation - memory allocation in stack and heap (video)](https://www.youtube.com/watch?v=hWokyBoo0aI&list=PL2_aWCzGMAwI3W_JlcBbtYTwiQSsOTa6P&index=29)
    - [ ] [Find min and max element in a binary search tree (video)](https://www.youtube.com/watch?v=Ut90klNN264&index=30&list=PL2_aWCzGMAwI3W_JlcBbtYTwiQSsOTa6P)
    - [ ] [Find the height of a binary tree (video)](https://www.youtube.com/watch?v=_pnqMz5nrRs&list=PL2_aWCzGMAwI3W_JlcBbtYTwiQSsOTa6P&index=31)
    - [ ] [Binary tree traversal - breadth-first and depth-first strategies (video)](https://www.youtube.com/watch?v=9RHO6jU--GU&list=PL2_aWCzGMAwI3W_JlcBbtYTwiQSsOTa6P&index=32)
    - [ ] [Binary tree: Level Order Traversal (video)](https://www.youtube.com/watch?v=86g8jAQug04&index=33&list=PL2_aWCzGMAwI3W_JlcBbtYTwiQSsOTa6P)
    - [ ] [Binary tree traversal: Preorder, Inorder, Postorder (video)](https://www.youtube.com/watch?v=gm8DUJJhmY4&index=34&list=PL2_aWCzGMAwI3W_JlcBbtYTwiQSsOTa6P)
    - [ ] [Check if a binary tree is a binary search tree or not (video)](https://www.youtube.com/watch?v=yEwSGhSsT0U&index=35&list=PL2_aWCzGMAwI3W_JlcBbtYTwiQSsOTa6P)
    - [ ] [Delete a node from Binary Search Tree (video)](https://www.youtube.com/watch?v=gcULXE7ViZw&list=PL2_aWCzGMAwI3W_JlcBbtYTwiQSsOTa6P&index=36)
    - [ ] [Inorder Successor in a binary search tree (video)](https://www.youtube.com/watch?v=5cPbNCrdotA&index=37&list=PL2_aWCzGMAwI3W_JlcBbtYTwiQSsOTa6P)

#### 實作練習（12 小時）

- [ ] **Implement**:
    - [ ] [insert // insert value into tree](https://leetcode.com/problems/insert-into-a-binary-search-tree/submissions/987660183/)
    - [ ] get_node_count // get count of values stored
    - [ ] print_values // prints the values in the tree, from min to max
    - [ ] delete_tree
    - [ ] is_in_tree // returns true if a given value exists in the tree
    - [ ] [get_height // returns the height in nodes (single node's height is 1)](https://www.geeksforgeeks.org/find-the-maximum-depth-or-height-of-a-tree/)
    - [ ] get_min // returns the minimum value stored in the tree
    - [ ] get_max // returns the maximum value stored in the tree
    - [ ] [is_binary_search_tree](https://leetcode.com/problems/validate-binary-search-tree/)
    - [ ] delete_value
    - [ ] get_successor // returns the next-highest value in the tree after given value, -1 if none

**BST 特性**：
- 左子樹所有節點 < 根節點 < 右子樹所有節點
- 中序遍歷會得到排序結果
- 查找、插入、刪除：平均 O(log n)，最壞 O(n)

---

### 💻 LeetCode 練習

**時間分配**：7 小時

#### Tree Traversal 題目（4 題）

**Easy**：
1. [ ] [94. Binary Tree Inorder Traversal](https://leetcode.com/problems/binary-tree-inorder-traversal/)
2. [ ] [144. Binary Tree Preorder Traversal](https://leetcode.com/problems/binary-tree-preorder-traversal/)
3. [ ] [145. Binary Tree Postorder Traversal](https://leetcode.com/problems/binary-tree-postorder-traversal/)
4. [ ] [102. Binary Tree Level Order Traversal](https://leetcode.com/problems/binary-tree-level-order-traversal/)

#### Binary Tree 基礎題目（5 題）

**Easy**：
1. [ ] [104. Maximum Depth of Binary Tree](https://leetcode.com/problems/maximum-depth-of-binary-tree/)
2. [ ] [100. Same Tree](https://leetcode.com/problems/same-tree/)
3. [ ] [226. Invert Binary Tree](https://leetcode.com/problems/invert-binary-tree/)
4. [ ] [101. Symmetric Tree](https://leetcode.com/problems/symmetric-tree/)

**Medium**：
1. [ ] [116. Populating Next Right Pointers in Each Node](https://leetcode.com/problems/populating-next-right-pointers-in-each-node/)

#### BST 題目（5 題）

**Easy**：
1. [ ] [700. Search in a Binary Search Tree](https://leetcode.com/problems/search-in-a-binary-search-tree/)
2. [ ] [108. Convert Sorted Array to Binary Search Tree](https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/)

**Medium**：
1. [ ] [98. Validate Binary Search Tree](https://leetcode.com/problems/validate-binary-search-tree/)
2. [ ] [701. Insert into a Binary Search Tree](https://leetcode.com/problems/insert-into-a-binary-search-tree/)
3. [ ] [450. Delete Node in a BST](https://leetcode.com/problems/delete-node-in-a-bst/)

---

## 重要概念整理

### Tree Traversal 方法

```java
// Inorder (Left, Root, Right) - BST 中會得到排序結果
void inorder(TreeNode root) {
    if (root == null) return;
    inorder(root.left);
    System.out.print(root.val + " ");
    inorder(root.right);
}

// Preorder (Root, Left, Right) - 用於複製樹
void preorder(TreeNode root) {
    if (root == null) return;
    System.out.print(root.val + " ");
    preorder(root.left);
    preorder(root.right);
}

// Postorder (Left, Right, Root) - 用於刪除樹
void postorder(TreeNode root) {
    if (root == null) return;
    postorder(root.left);
    postorder(root.right);
    System.out.print(root.val + " ");
}

// Level Order (BFS) - 用於層序遍歷
void levelOrder(TreeNode root) {
    if (root == null) return;
    Queue<TreeNode> queue = new LinkedList<>();
    queue.offer(root);

    while (!queue.isEmpty()) {
        TreeNode node = queue.poll();
        System.out.print(node.val + " ");

        if (node.left != null) queue.offer(node.left);
        if (node.right != null) queue.offer(node.right);
    }
}
```

### BST 操作

```java
// BST Insert
TreeNode insert(TreeNode root, int val) {
    if (root == null) return new TreeNode(val);

    if (val < root.val) {
        root.left = insert(root.left, val);
    } else if (val > root.val) {
        root.right = insert(root.right, val);
    }

    return root;
}

// BST Search
TreeNode search(TreeNode root, int val) {
    if (root == null || root.val == val) return root;

    if (val < root.val) return search(root.left, val);
    else return search(root.right, val);
}

// BST Delete (最複雜)
TreeNode delete(TreeNode root, int val) {
    if (root == null) return null;

    if (val < root.val) {
        root.left = delete(root.left, val);
    } else if (val > root.val) {
        root.right = delete(root.right, val);
    } else {
        // 找到要刪除的節點
        // Case 1: 沒有子節點或只有一個子節點
        if (root.left == null) return root.right;
        if (root.right == null) return root.left;

        // Case 2: 有兩個子節點
        // 找右子樹的最小值（或左子樹的最大值）
        TreeNode minNode = findMin(root.right);
        root.val = minNode.val;
        root.right = delete(root.right, minNode.val);
    }

    return root;
}

TreeNode findMin(TreeNode root) {
    while (root.left != null) {
        root = root.left;
    }
    return root;
}

// Validate BST
boolean isValidBST(TreeNode root) {
    return validate(root, null, null);
}

boolean validate(TreeNode node, Integer min, Integer max) {
    if (node == null) return true;

    if ((min != null && node.val <= min) ||
        (max != null && node.val >= max)) {
        return false;
    }

    return validate(node.left, min, node.val) &&
           validate(node.right, node.val, max);
}
```

### BFS vs DFS

| 特性 | BFS | DFS |
|------|-----|-----|
| 資料結構 | Queue | Stack (或 Recursion) |
| 空間複雜度 | O(w) w=最大寬度 | O(h) h=高度 |
| 找最短路徑 | 適合 | 不適合 |
| 記憶體使用 | 較高（完全樹） | 較低（平衡樹） |
| 實作難度 | 較簡單（iterative） | 較簡單（recursive） |

### Tree 的時間複雜度

**BST（平衡時）**：
- Search: O(log n)
- Insert: O(log n)
- Delete: O(log n)
- Traversal: O(n)

**BST（退化成鏈表）**：
- Search: O(n)
- Insert: O(n)
- Delete: O(n)

---

## 實作規範

### TreeNode 定義 (Java)
```java
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}
```

### BST 類別 (Java)
```java
public class BinarySearchTree {
    private TreeNode root;

    public BinarySearchTree() {
        this.root = null;
    }

    // Public interface
    public void insert(int val) {
        root = insertHelper(root, val);
    }

    public boolean search(int val) {
        return searchHelper(root, val);
    }

    public void delete(int val) {
        root = deleteHelper(root, val);
    }

    // Helper methods (private, recursive)
    private TreeNode insertHelper(TreeNode node, int val) {
        // TODO: Implement
    }

    private boolean searchHelper(TreeNode node, int val) {
        // TODO: Implement
    }

    private TreeNode deleteHelper(TreeNode node, int val) {
        // TODO: Implement
    }

    // Other methods: getHeight, getMin, getMax, etc.
}
```

---

## 本週檢核清單

### 知識理解
- [ ] 理解 Tree 的基本術語與特性
- [ ] 掌握四種 Tree Traversal 方法
- [ ] 理解 BFS 與 DFS 的差異
- [ ] 理解 BST 的特性與不變量
- [ ] 理解 BST 三種刪除情況

### 實作能力
- [ ] 能實作四種遍歷方法（recursive & iterative）
- [ ] 完成 BST 完整實作
- [ ] 能正確實作 BST 的 insert, search, delete
- [ ] 能驗證一棵樹是否為 BST
- [ ] 能找到 BST 的 successor

### 解題能力
- [ ] 完成所有 Traversal 題目
- [ ] 完成至少 5 道 Binary Tree 題目
- [ ] 完成至少 5 道 BST 題目
- [ ] 能快速識別 DFS vs BFS 的使用時機

---

## Debug 技巧

### 常見錯誤
1. **邊界條件**：忘記處理 null root
2. **遞迴終止**：沒有正確的 base case
3. **BST Delete**：忘記處理有兩個子節點的情況
4. **Validate BST**：只比較父子節點（錯誤！）
5. **Level Order**：忘記檢查子節點是否為 null

### 測試案例
```java
// Tree Structure for Testing
//       5
//      / \
//     3   8
//    / \   \
//   1   4   9

BST bst = new BST();
bst.insert(5);
bst.insert(3);
bst.insert(8);
bst.insert(1);
bst.insert(4);
bst.insert(9);

// Test cases
assert bst.search(4) == true;
assert bst.search(10) == false;
assert bst.getMin() == 1;
assert bst.getMax() == 9;
assert bst.getHeight() == 3;

bst.delete(3);  // Delete node with 2 children
bst.delete(9);  // Delete leaf
bst.delete(5);  // Delete root
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

**下週預告**：Week 05 將學習 Heap/Priority Queue 與 Sorting 基礎
