## 设计模式


### [Bridge 桥接](src/main/java/com/example/demo/mode/bridge/)
> 将类的功能层次结构与实现层次结构分离
- 功能层次结构
  > 为了增加新功能而产生的层次结构，比如：
    - 父类中具有基本功能
    - 子类中增加新的功能
- 实现层次结构
  > 为了增加新的实现而产生的层次结构，比如：
    - 父类通过声明抽象方法来定义接口
    - 子类通过实现具体方法来实现接口
1. 抽象化 `Abstraction`
   > 位于 __类的功能层次结构__ 的最上层，使用 `Implementor` 角色的方法定义基本的功能
2. 改善后的抽象化 `RefinedAbstraction`
   > 在 `Abstraction` 角色的基础上增加了新功能的角色
3. 实现者 `Implementor`
   > 该角色位于 __类的实现层次结构__ 的最上层，定义用于实现 `Abstraction` 角色的接口的方法
4. 具体实现者 `ConcreateImplementor`
   > 实现 `Implementor` 角色中定义的接口