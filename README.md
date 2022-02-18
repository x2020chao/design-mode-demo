## 设计模式


### [Visitor 访问者](src/main/java/com/example/demo/mode/visitor/)
> 访问数据结构并处理数据，数据结构与处理被分离开
1. 访问者 `Visitor`
   > 负责对数据结构中每个具体的元素 `ConcreateElement` 声明一个对象的 `visit` 方法
2. 具体的访问者 `ConcreateVisitor`
   > 负责实现 `Visitor` 所定义的接口，实现如何处理 `ConcreateElement` 角色
3. 元素 `Element`
   > 表示 `Visitro` 角色的访问对象，声明接受访问者的 `accept` 方法，接收 `Visitor` 角色
4. 具体的元素 `ConcreateElement`
   > 实现 `Element` 定义的接口
5. 对象结构 `ObjectStructure`
   > 负责处理 `Element` 角色的集合，`ConcreateVisitor` 为每个 `Element` 准备了处理方法，实现 `iterator` 方法实现 `ConcreateVisitor` 对每个 `Element` 遍历处理
#### 双重分发
> `element` 接收 `visitor`, `visitor` 访问 `element`, 两个角色共同决定了实际进行的处理，这种消息分发的模式成为 __双重分发__
#### 开闭原则
- 对扩展是开放的
- 对修改是关闭的