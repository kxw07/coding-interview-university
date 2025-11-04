# Week 08: Graphs 進階演算法

**學習時間**：2025/12/22 - 2025/12/26（35 小時）

## 本週目標
1. 掌握最短路徑演算法（Dijkstra, Bellman-Ford）
2. 學習最小生成樹（Prim, Kruskal）
3. 深入理解圖的進階應用

## 本週學習內容

### 📚 Graphs - 進階演算法

**時間分配**：25 小時

#### 理論影片（12 小時）

- [ ] [Aduni: Graph Algorithms I - Topological Sorting, Minimum Spanning Trees, Prim's Algorithm - Lecture 6 (video)](https://www.youtube.com/watch?v=i_AQT_XfvD8&index=6&list=PLFDnELG9dpVxQCxuD-9BSy2E7BWY3t5Sm)
- [ ] [Aduni: Graph Algorithms II - DFS, BFS, Kruskal's Algorithm, Union Find Data Structure - Lecture 7 (video)](https://www.youtube.com/watch?v=ufj5_bppBsA&list=PLFDnELG9dpVxQCxuD-9BSy2E7BWY3t5Sm&index=7)
- [ ] [Aduni: Graph Algorithms III: Shortest Path - Lecture 8 (video)](https://www.youtube.com/watch?v=DiedsPsMKXc&list=PLFDnELG9dpVxQCxuD-9BSy2E7BWY3t5Sm&index=8)
- [ ] [Aduni: Graph Alg. IV: Intro to geometric algorithms - Lecture 9 (video)](https://www.youtube.com/watch?v=XIAQRlNkJAw&list=PLFDnELG9dpVxQCxuD-9BSy2E7BWY3t5Sm&index=9)
- [ ] [CS 61B 2014: Weighted graphs (video)](https://archive.org/details/ucberkeley_webcast_zFbq8vOZ_0k)
- [ ] [Greedy Algorithms: Minimum Spanning Tree (video)](https://www.youtube.com/watch?v=tKwnms5iRBU&index=16&list=PLUl4u3cNGP6317WaSNfmCvGym2ucw3oGp)
- [ ] [Strongly Connected Components Kosaraju's Algorithm Graph Algorithm (video)](https://www.youtube.com/watch?v=RpgcYiky7uw)
- [ ] [[Review] Shortest Path Algorithms (playlist) in 16 minutes (video)](https://www.youtube.com/playlist?list=PL9xmBV_5YoZO-Y-H3xIC9DGSfVYJng9Yw)
- [ ] [[Review] Minimum Spanning Trees (playlist) in 4 minutes (video)](https://www.youtube.com/playlist?list=PL9xmBV_5YoZObEi3Hf6lmyW-CBfs7nkOV)

#### Coursera 完整課程（選修）

- [ ] [Algorithms on Graphs (video)](https://www.coursera.org/learn/algorithms-on-graphs/home/welcome)

#### 實作練習（13 小時）

本週需實作的演算法：
- [ ] Dijkstra's Algorithm (單源最短路徑)
- [ ] Bellman-Ford Algorithm
- [ ] Prim's Algorithm (MST)
- [ ] Kruskal's Algorithm (MST)
- [ ] Union-Find Data Structure
- [ ] Floyd-Warshall (All pairs shortest path)

---

### 💻 LeetCode 練習

**時間分配**：10 小時

#### Shortest Path（5 題）

**Medium**：
1. [ ] [743. Network Delay Time](https://leetcode.com/problems/network-delay-time/)
2. [ ] [787. Cheapest Flights Within K Stops](https://leetcode.com/problems/cheapest-flights-within-k-stops/)
3. [ ] [1514. Path with Maximum Probability](https://leetcode.com/problems/path-with-maximum-probability/)

**Hard**：
1. [ ] [1368. Minimum Cost to Make at Least One Valid Path in a Grid](https://leetcode.com/problems/minimum-cost-to-make-at-least-one-valid-path-in-a-grid/)
2. [ ] [778. Swim in Rising Water](https://leetcode.com/problems/swim-in-rising-water/)

#### MST & Union Find（4 題）

**Medium**：
1. [ ] [1584. Min Cost to Connect All Points](https://leetcode.com/problems/min-cost-to-connect-all-points/)
2. [ ] [1319. Number of Operations to Make Network Connected](https://leetcode.com/problems/number-of-operations-to-make-network-connected/)
3. [ ] [684. Redundant Connection](https://leetcode.com/problems/redundant-connection/)
4. [ ] [721. Accounts Merge](https://leetcode.com/problems/accounts-merge/)

---

## 重要演算法實作

### Dijkstra's Algorithm
```java
public int[] dijkstra(int V, List<List<int[]>> adj, int src) {
    int[] dist = new int[V];
    Arrays.fill(dist, Integer.MAX_VALUE);
    dist[src] = 0;

    PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[1] - b[1]);
    pq.offer(new int[]{src, 0});

    while (!pq.isEmpty()) {
        int[] curr = pq.poll();
        int u = curr[0];
        int d = curr[1];

        if (d > dist[u]) continue;

        for (int[] edge : adj.get(u)) {
            int v = edge[0];
            int weight = edge[1];

            if (dist[u] + weight < dist[v]) {
                dist[v] = dist[u] + weight;
                pq.offer(new int[]{v, dist[v]});
            }
        }
    }

    return dist;
}
```

### Union-Find
```java
class UnionFind {
    private int[] parent;
    private int[] rank;

    public UnionFind(int n) {
        parent = new int[n];
        rank = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i;
        }
    }

    public int find(int x) {
        if (parent[x] != x) {
            parent[x] = find(parent[x]); // Path compression
        }
        return parent[x];
    }

    public boolean union(int x, int y) {
        int rootX = find(x);
        int rootY = find(y);

        if (rootX == rootY) return false;

        // Union by rank
        if (rank[rootX] < rank[rootY]) {
            parent[rootX] = rootY;
        } else if (rank[rootX] > rank[rootY]) {
            parent[rootY] = rootX;
        } else {
            parent[rootY] = rootX;
            rank[rootX]++;
        }
        return true;
    }
}
```

### Kruskal's Algorithm (MST)
```java
public int kruskal(int V, List<int[]> edges) {
    // Sort edges by weight
    Collections.sort(edges, (a, b) -> a[2] - b[2]);

    UnionFind uf = new UnionFind(V);
    int mstWeight = 0;
    int edgesUsed = 0;

    for (int[] edge : edges) {
        int u = edge[0];
        int v = edge[1];
        int weight = edge[2];

        if (uf.union(u, v)) {
            mstWeight += weight;
            edgesUsed++;
            if (edgesUsed == V - 1) break;
        }
    }

    return edgesUsed == V - 1 ? mstWeight : -1;
}
```

---

## 本週檢核清單

### 知識理解
- [ ] 理解 Dijkstra 演算法原理
- [ ] 理解 Bellman-Ford 能處理負權邊
- [ ] 理解 MST 的概念與應用
- [ ] 理解 Union-Find 的優化技巧
- [ ] 理解何時使用哪種最短路徑演算法

### 實作能力
- [ ] 完成 Dijkstra 實作
- [ ] 完成 Union-Find 實作
- [ ] 完成 Kruskal's Algorithm
- [ ] 能正確處理邊界條件

### 解題能力
- [ ] 完成至少 5 道最短路徑題目
- [ ] 完成至少 4 道 Union-Find 題目
- [ ] 能識別需要用圖演算法的問題

---

## 學習心得記錄

### 本週收穫
[在這裡記錄你的學習心得]

### 遇到的困難
[記錄遇到的問題及解決方法]

---

**下週預告**：Week 09 將學習 Recursion 與 Dynamic Programming 入門
