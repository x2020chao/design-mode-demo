## 设计模式

### [prototype 原型](src/main/java/com/example/demo/mode/prototype/)
> 通过复制生成实例
1. 原型 `Prototype`
   > 负责定义现有实例来生成新实例的方法
2. 具体的原型 `ConcreatePrototype`
   > 负责实现现有实例并生成新实例的方法
3. 使用者 `Client`
   > （`Manager`）负责使用复制实例的方法生成新的实例

#### 关于 `java.lang.Cloneable` 和 `clone`
1. 实现了 `Cloneable` 接口的类调用 `clone` 进行复制，没有实现 `Cloneable` 接口的类调用 `clone` 时会发生 `CloneNotSupportedException` 异常
2. `clone` 方法定义在 `java.lang.Object` 中，`Cloneable` 接口没有声明任何方法，只是用来 __标记__ “可以使用 `clone` 方法进行复制”，是 __标记接口__
3. `clone` 是浅复制