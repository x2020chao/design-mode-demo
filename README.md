## 设计模式


### [Observer 观察者](src/main/java/com/example/demo/mode/observer/)
> 发送状态变化通知，__非主动的观察，被动接收 `subject` 的通知，也称为 `publish-subscribe` (发布-订阅)__
1. 观察对象 `Subject`
   > 表示观察对象，定义了注册观察者和删除观察者的方法，还定义了获取现在状态的方法，如 `NumberGenerator`
2. 具体的观察者 `ConcreateSubject`
   > 表示具体的观察对象，当自身状态发生变化后，会通知所有的 `Observer` 角色，如 `RandomNumberGenerator`
3. 观察者 `Observer`
   > 负责接收来自 `Subject` 角色的状态变化的通知，如 `Observer`
4. 具体的观察者 `ConcreateObserver`
   > 具体的观察者，`update` 调用后，会获取对象最新的状态