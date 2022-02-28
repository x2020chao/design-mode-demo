## 设计模式


### Chain Of Responsibility 职责链
> 推卸责任
1. 处理者 `Handler`
   > 定义了处理请求的接口，它知道下一个处理者是谁，如果自身没有办法处理，就把请求转给下一个处理者，如 `Support`
2. 具体的处理者 `ConcreateHandler`
   > 处理请求的具体角色
3. 请求者 `Client`
   > 向第一个 `ConcreateHandler` 角色发送请求的角色