## 设计模式


### [Strategy 策略](src/main/java/com/example/demo/mode/strategy/)
> 通过委托，整体地替换算法，使动态替换变成了可能
1. 策略 `Strategy`
   负责决定实现策略所必须的接口
2. 具体的策略 `ConcreateStrategy`
   负责实现具体的策略
3. 上下文 `Context`
   负责使用 `Strategy` 角色，保存 `ConcreateStrategy` 