## 设计模式

### [Iterator 迭代器](src/main/java/com/example/demo/mode/iterator)
> 一个一个遍历
1. __迭代器__ `Iterator`
   > 负责定义按顺序逐个遍历元素的接口（`API`）
2. __具体的迭代器__ `ConcreteIterator` 
   > 负责实现 `Iterator` 定义的接口（`API`）
3. __集合__ `Aggregate`
   > 负责定义创建 `Iterator` 的接口（`API`）
4. __具体的集合__ `ConcreteAggregate` 
   > 负责实现 `Aggregate` 所定义的接口（`API`）

### [Adapter 适配器](src/main/java/com/example/demo/mode/adapter/)
> 加个适配器以便于复用，用于填补具有不同接口（`API`）的两个类之间的缝隙，也称 `Wrapper` 模式，有包装器的意思，把某样东西包装起来，使其能够用于其他用途的东西就被成为 __包装器__ 或者 __适配器__

#### [类适配器模式（使用继承的适配器）](src/main/java/com/example/demo/mode/adapter/adapter1)
#### [对象适配器模式（使用委托的适配器）](src/main/java/com/example/demo/mode/adapter/adapter2)

1. __对象__ `Target`
   > 定义目标对象所需要的方法
2. __请求者__ `Client`
   > 负责使用 `Target` 对象所定义的方法进行具体处理，即调用者
3. __被适配__ `Adaptee`
   > 持有既定方法的角色
4. __适配__ `Adapter`
   > 使用 `Adaptee` 角色的方法来满足 `Target` 角色的需求
