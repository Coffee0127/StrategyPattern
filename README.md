## Strategy Pattern
定義了演算法家族，個別封裝起來，讓他們之間可以互相替換，此模式讓演算法的變動，不會影響到使用演算法的程式。

[BusinessServiceWithoutPattern](https://github.com/Coffee0127/StrategyPattern/blob/master/src/com/bxf/test/pattern/without/BusinessServiceWithoutPattern.java) 的 `doFoo` 及 `doBar` 方法都需要先針對參數做檢查，往往造成程式碼重複出現。

### 重構步驟
1. 將各自不同之處抽出成 [Worker](https://github.com/Coffee0127/StrategyPattern/blob/master/src/com/bxf/test/pattern/with/service/Worker.java)，再各自實作。(即 [FooWorker](https://github.com/Coffee0127/StrategyPattern/blob/master/src/com/bxf/test/pattern/with/service/FooWorker.java)、[BarWorker](https://github.com/Coffee0127/StrategyPattern/blob/master/src/com/bxf/test/pattern/with/service/BarWorker.java))
2. 將共同部分重構成為 [BusinessServiceWithPattern](https://github.com/Coffee0127/StrategyPattern/blob/master/src/com/bxf/test/pattern/with/BusinessServiceWithPattern.java) 的 `doSomethingWithCommonCheck` 方法
3. 原本方法 `doFoo` 及 `doBar` 則呼叫 `doSomethingWithCommonCheck`，並且傳入步驟 1 的實作即可。
