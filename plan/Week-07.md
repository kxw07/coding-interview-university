# Week 07: Graphs 基礎

**學習時間**：2025/12/16 - 2025/12/20（35 小時）

## 本週目標
1. 理解圖的表示方法
2. 掌握 BFS 和 DFS 在圖上的應用
3. 學習基本圖算法

## 本週學習內容

### 📚 Graphs

**時間分配**：28 小時

Graphs can be used to represent many problems in computer science, so this section is long, like trees and sorting.

#### 基本概念

- **Notes**:
    - There are 4 basic ways to represent a graph in memory:
        - objects and pointers
        - adjacency matrix
        - adjacency list
        - adjacency map
    - Familiarize yourself with each representation and its pros & cons
    - BFS and DFS - know their computational complexity, their trade-offs, and how to implement them in real code
    - When asked a question, look for a graph-based solution first, then move on if none

#### 理論影片（12 小時）

- [ ] **MIT (videos)**:
    - [ ] [Breadth-First Search](https://www.youtube.com/watch?v=oFVYVzlvk9c&t=14s&ab_channel=MITOpenCourseWare)
    - [ ] [Depth-First Search](https://www.youtube.com/watch?v=IBfWDYSffUU&t=32s&ab_channel=MITOpenCourseWare)

- [ ] **Skiena Lectures - great intro**:
    - [ ] [CSE373 2020 - Lecture 10 - Graph Data Structures (video)](https://www.youtube.com/watch?v=Sjk0xqWWPCc&list=PLOtl7M3yp-DX6ic0HGT0PUX_wiNmkWkXx&index=10)
    - [ ] [CSE373 2020 - Lecture 11 - Graph Traversal (video)](https://www.youtube.com/watch?v=ZTwjXj81NVY&list=PLOtl7M3yp-DX6ic0HGT0PUX_wiNmkWkXx&index=11)
    - [ ] [CSE373 2020 - Lecture 12 - Depth First Search (video)](https://www.youtube.com/watch?v=KyordYB3BOs&list=PLOtl7M3yp-DX6ic0HGT0PUX_wiNmkWkXx&index=12)
    - [ ] [CSE373 2020 - Lecture 13 - Minimum Spanning Trees (video)](https://www.youtube.com/watch?v=oolm2VnJUKw&list=PLOtl7M3yp-DX6ic0HGT0PUX_wiNmkWkXx&index=13)
    - [ ] [CSE373 2020 - Lecture 14 - Minimum Spanning Trees (con't) (video)](https://www.youtube.com/watch?v=RktgPx0MarY&list=PLOtl7M3yp-DX6ic0HGT0PUX_wiNmkWkXx&index=14)
    - [ ] [CSE373 2020 - Lecture 15 - Graph Algorithms (con't 2) (video)](https://www.youtube.com/watch?v=MUe5DXRhyAo&list=PLOtl7M3yp-DX6ic0HGT0PUX_wiNmkWkXx&index=15)

- [ ] **Graphs (review and more)**:
    - [ ] [6.006 Single-Source Shortest Paths Problem (video)](https://www.youtube.com/watch?v=Aa2sqUhIn-E&index=15&list=PLUl4u3cNGP61Oq3tWYp6V_F-5jb5L2iHb)
    - [ ] [6.006 Dijkstra (video)](https://www.youtube.com/watch?v=NSHizBK9JD8&t=1731s&ab_channel=MITOpenCourseWare)
    - [ ] [6.006 Bellman-Ford (video)](https://www.youtube.com/watch?v=f9cVS_URPc0&ab_channel=MITOpenCourseWare)
    - [ ] [6.006 Speeding Up Dijkstra (video)](https://www.youtube.com/watch?v=CHvQ3q_gJ7E&list=PLUl4u3cNGP61Oq3tWYp6V_F-5jb5L2iHb&index=18)

#### 實作練習（16 小時）

- [ ] **I'll implement**:
    - [ ] DFS with adjacency list (recursive)
    - [ ] DFS with adjacency list (iterative with stack)
    - [ ] DFS with adjacency matrix (recursive)
    - [ ] DFS with adjacency matrix (iterative with stack)
    - [ ] BFS with adjacency list
    - [ ] BFS with adjacency matrix
    - [ ] single-source shortest path (Dijkstra)
    - [ ] minimum spanning tree
    - **DFS-based algorithms** (see Aduni videos above):
        - [ ] check for a cycle (needed for topological sort, since we'll check for the cycle before starting)
        - [ ] topological sort
        - [ ] count connected components in a graph
        - [ ] list strongly connected components
        - [ ] check for bipartite graph

---

### 💻 LeetCode 練習

**時間分配**：7 小時

#### Graph Traversal 基礎（6 題）

**Easy**：
1. [ ] [997. Find the Town Judge](https://leetcode.com/problems/find-the-town-judge/)

**Medium**：
1. [ ] [200. Number of Islands](https://leetcode.com/problems/number-of-islands/)
2. [ ] [133. Clone Graph](https://leetcode.com/problems/clone-graph/)
3. [ ] [207. Course Schedule](https://leetcode.com/problems/course-schedule/)
4. [ ] [210. Course Schedule II](https://leetcode.com/problems/course-schedule-ii/)
5. [ ] [417. Pacific Atlantic Water Flow](https://leetcode.com/problems/pacific-atlantic-water-flow/)

#### BFS/DFS 應用（4 題）

**Medium**：
1. [ ] [695. Max Area of Island](https://leetcode.com/problems/max-area-of-island/)
2. [ ] [994. Rotting Oranges](https://leetcode.com/problems/rotting-oranges/)
3. [ ] [130. Surrounded Regions](https://leetcode.com/problems/surrounded-regions/)
4. [ ] [323. Number of Connected Components in an Undirected Graph](https://leetcode.com/problems/number-of-connected-components-in-an-undirected-graph/) (Premium)

---

## 學習建議

### Day 1 (Monday) - 7 小時
- 上午（4h）：MIT BFS & DFS + Skiena Lecture 10 & 11
- 下午（3h）：Skiena Lecture 12 (DFS) + 圖的表示方法筆記

### Day 2 (Tuesday) - 7 小時
- 上午（4h）：實作 DFS（Adjacency List: recursive & iterative）
- 下午（3h）：實作 DFS（Adjacency Matrix: recursive & iterative）

### Day 3 (Wednesday) - 7 小時
- 上午（4h）：實作 BFS（Adjacency List & Matrix）
- 下午（3h）：實作 Cycle Detection & Topological Sort

### Day 4 (Thursday) - 7 小時
- 上午（4h）：Skiena Lecture 13 & 14 (MST)
- 下午（3h）：6.006 Shortest Paths & Dijkstra

### Day 5 (Friday) - 7 小時
- 上午（4h）：LeetCode Graph Traversal × 3
- 下午（3h）：LeetCode BFS/DFS 應用 × 3 + 本週複習

---

## 重要概念整理

### 圖的表示方法

#### 1. Adjacency List
```java
class Graph {
    private int V; // 頂點數
    private List<List<Integer>> adj;

    public Graph(int v) {
        V = v;
        adj = new ArrayList<>(v);
        for (int i = 0; i < v; i++) {
            adj.add(new ArrayList<>());
        }
    }

    public void addEdge(int v, int w) {
        adj.get(v).add(w);
        // adj.get(w).add(v); // 無向圖需要加這行
    }
}
// 優點：省空間 O(V + E)，適合稀疏圖
// 缺點：檢查邊是否存在需要 O(V)
```

#### 2. Adjacency Matrix
```java
class Graph {
    private int V;
    private int[][] adj;

    public Graph(int v) {
        V = v;
        adj = new int[v][v];
    }

    public void addEdge(int v, int w) {
        adj[v][w] = 1;
        // adj[w][v] = 1; // 無向圖
    }
}
// 優點：檢查邊 O(1)，實作簡單
// 缺點：O(V²) 空間，適合稠密圖
```

### DFS 實作

#### Recursive DFS
```java
public void dfs(int v, boolean[] visited, List<List<Integer>> adj) {
    visited[v] = true;
    System.out.print(v + " ");

    for (int neighbor : adj.get(v)) {
        if (!visited[neighbor]) {
            dfs(neighbor, visited, adj);
        }
    }
}
```

#### Iterative DFS (with Stack)
```java
public void dfsIterative(int start, List<List<Integer>> adj) {
    boolean[] visited = new boolean[adj.size()];
    Stack<Integer> stack = new Stack<>();

    stack.push(start);

    while (!stack.isEmpty()) {
        int v = stack.pop();

        if (!visited[v]) {
            visited[v] = true;
            System.out.print(v + " ");

            // 注意：為了保持與遞迴相同的順序，需要反向加入
            for (int i = adj.get(v).size() - 1; i >= 0; i--) {
                int neighbor = adj.get(v).get(i);
                if (!visited[neighbor]) {
                    stack.push(neighbor);
                }
            }
        }
    }
}
```

### BFS 實作

```java
public void bfs(int start, List<List<Integer>> adj) {
    boolean[] visited = new boolean[adj.size()];
    Queue<Integer> queue = new LinkedList<>();

    visited[start] = true;
    queue.offer(start);

    while (!queue.isEmpty()) {
        int v = queue.poll();
        System.out.print(v + " ");

        for (int neighbor : adj.get(v)) {
            if (!visited[neighbor]) {
                visited[neighbor] = true;
                queue.offer(neighbor);
            }
        }
    }
}
```

### Topological Sort (Kahn's Algorithm)
```java
public List<Integer> topologicalSort(int V, List<List<Integer>> adj) {
    int[] indegree = new int[V];
    List<Integer> result = new ArrayList<>();

    // 計算每個頂點的入度
    for (int i = 0; i < V; i++) {
        for (int neighbor : adj.get(i)) {
            indegree[neighbor]++;
        }
    }

    // 將入度為 0 的頂點加入 queue
    Queue<Integer> queue = new LinkedList<>();
    for (int i = 0; i < V; i++) {
        if (indegree[i] == 0) {
            queue.offer(i);
        }
    }

    while (!queue.isEmpty()) {
        int v = queue.poll();
        result.add(v);

        for (int neighbor : adj.get(v)) {
            indegree[neighbor]--;
            if (indegree[neighbor] == 0) {
                queue.offer(neighbor);
            }
        }
    }

    // 如果結果數量不等於 V，表示有環
    return result.size() == V ? result : new ArrayList<>();
}
```

### Cycle Detection (DFS)
```java
public boolean hasCycle(List<List<Integer>> adj) {
    int V = adj.size();
    boolean[] visited = new boolean[V];
    boolean[] recStack = new boolean[V];

    for (int i = 0; i < V; i++) {
        if (hasCycleUtil(i, visited, recStack, adj)) {
            return true;
        }
    }
    return false;
}

private boolean hasCycleUtil(int v, boolean[] visited,
                             boolean[] recStack, List<List<Integer>> adj) {
    if (recStack[v]) return true;
    if (visited[v]) return false;

    visited[v] = true;
    recStack[v] = true;

    for (int neighbor : adj.get(v)) {
        if (hasCycleUtil(neighbor, visited, recStack, adj)) {
            return true;
        }
    }

    recStack[v] = false;
    return false;
}
```

---

## 本週檢核清單

### 知識理解
- [ ] 理解圖的四種表示方法
- [ ] 理解 DFS 與 BFS 的差異
- [ ] 理解 Topological Sort 的應用
- [ ] 理解如何檢測環
- [ ] 理解連通分量的概念

### 實作能力
- [ ] 能實作 DFS（recursive & iterative）
- [ ] 能實作 BFS
- [ ] 能實作 Topological Sort
- [ ] 能實作 Cycle Detection
- [ ] 能選擇合適的圖表示方法

### 解題能力
- [ ] 完成至少 6 道 Graph Traversal 題目
- [ ] 完成至少 4 道 BFS/DFS 應用題
- [ ] 能識別圖問題
- [ ] 能選擇 DFS vs BFS

---

## 學習心得記錄

### 本週收穫
[在這裡記錄你的學習心得]

### 遇到的困難
[記錄遇到的問題及解決方法]

---

**下週預告**：Week 08 將學習圖的進階算法（最短路徑、MST）
