# Week 11: Design Patterns

**學習時間**：2026/01/12 - 2026/01/16（35 小時）

## 本週目標
1. 複習常用設計模式（利用你的 8 年經驗）
2. 深入理解設計模式的應用場景
3. 準備 System Design 基礎

## 本週學習內容

### 📚 Design Patterns

**時間分配**：20 小時

- [ ] [Quick UML review (video)](https://www.youtube.com/watch?v=3cmzqZzwNDM&list=PLGLfVvz_LVvQ5G-LdJ8RLqe-ndo7QITYc&index=3)

- [ ] **Learn these patterns**:
    - [ ] strategy
    - [ ] singleton
    - [ ] adapter
    - [ ] prototype
    - [ ] decorator
    - [ ] visitor
    - [ ] factory, abstract factory
    - [ ] facade
    - [ ] observer
    - [ ] proxy
    - [ ] delegate
    - [ ] command
    - [ ] state
    - [ ] memento
    - [ ] iterator
    - [ ] composite
    - [ ] flyweight

- [ ] [Series of videos (27 videos)](https://www.youtube.com/playlist?list=PLF206E906175C7E07)
- [ ] [Book: Head First Design Patterns](https://www.amazon.com/Head-First-Design-Patterns-Freeman/dp/0596007124)
    - I know the canonical book is "Design Patterns: Elements of Reusable Object-Oriented Software", but Head First is great for beginners to OO.
- [ ] [Handy reference: 101 Design Patterns & Tips for Developers](https://sourcemaking.com/design-patterns-and-tips)

---

### 💻 LeetCode - Design 題目

**時間分配**：15 小時

#### Design 題目（10 題）

**Easy**:
1. [ ] [155. Min Stack](https://leetcode.com/problems/min-stack/)
2. [ ] [232. Implement Queue using Stacks](https://leetcode.com/problems/implement-queue-using-stacks/)
3. [ ] [225. Implement Stack using Queues](https://leetcode.com/problems/implement-stack-using-queues/)

**Medium**:
1. [ ] [146. LRU Cache](https://leetcode.com/problems/lru-cache/)
2. [ ] [208. Implement Trie (Prefix Tree)](https://leetcode.com/problems/implement-trie-prefix-tree/)
3. [ ] [211. Design Add and Search Words Data Structure](https://leetcode.com/problems/design-add-and-search-words-data-structure/)
4. [ ] [284. Peeking Iterator](https://leetcode.com/problems/peeking-iterator/)
5. [ ] [341. Flatten Nested List Iterator](https://leetcode.com/problems/flatten-nested-list-iterator/)
6. [ ] [380. Insert Delete GetRandom O(1)](https://leetcode.com/problems/insert-delete-getrandom-o1/)
7. [ ] [535. Encode and Decode TinyURL](https://leetcode.com/problems/encode-and-decode-tinyurl/)

---

## 重要設計模式（Java 實作）

### 1. Singleton Pattern
```java
public class Singleton {
    private static volatile Singleton instance;

    private Singleton() {}

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
```

### 2. Factory Pattern
```java
interface Shape {
    void draw();
}

class Circle implements Shape {
    public void draw() { /* ... */ }
}

class Rectangle implements Shape {
    public void draw() { /* ... */ }
}

class ShapeFactory {
    public Shape getShape(String shapeType) {
        if (shapeType.equals("CIRCLE")) {
            return new Circle();
        } else if (shapeType.equals("RECTANGLE")) {
            return new Rectangle();
        }
        return null;
    }
}
```

### 3. Observer Pattern
```java
interface Observer {
    void update(String message);
}

class Subject {
    private List<Observer> observers = new ArrayList<>();

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void notifyAllObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }
}
```

### 4. Strategy Pattern
```java
interface Strategy {
    int doOperation(int num1, int num2);
}

class OperationAdd implements Strategy {
    public int doOperation(int num1, int num2) {
        return num1 + num2;
    }
}

class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2) {
        return strategy.doOperation(num1, num2);
    }
}
```

---

## 本週檢核清單

### 知識理解
- [ ] 理解 Creational Patterns
- [ ] 理解 Structural Patterns
- [ ] 理解 Behavioral Patterns
- [ ] 能說出每個模式的使用場景
- [ ] 理解設計模式的 trade-offs

### 實作能力
- [ ] 能實作 Singleton（thread-safe）
- [ ] 能實作 Factory Pattern
- [ ] 能實作 Observer Pattern
- [ ] 能實作 Strategy Pattern

### 解題能力
- [ ] 完成至少 10 道 Design 題目
- [ ] 能設計簡單的資料結構
- [ ] 能運用設計模式解決問題

---

## 學習心得記錄

### 本週收穫
[在這裡記錄你的學習心得]

### 設計模式應用心得
[記錄設計模式在實務上的應用]

---

**下週預告**：Week 12 將學習進階主題（Combinatorics, NP-Complete, 系統知識）
