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

### [Template Method 模板方法](src/main/java/com/example/demo/mode/template/)
> 将具体处理交给子类，带有模板功能，在父类中定理处理流程的框架，在子类中时间具体处理
1. 抽象类 `AbstractClass`
   > 不仅负责实现模板方法，还负责声明在模板方法中所使用到的抽象方法，这些抽象方法由子类 `ConcreateClass` 负责实现
2. 具体类 `ConcreteClass` 
   > 负责具体实现抽象类 `AbstractClass` 中定义的抽象方法，这里实现的方法将在 `AbstractClass` 角色的模板方法中被调用

### [Factory Method 工厂方法](src/main/java/com/example/demo/mode/factory/)
> 父类决定实例的生成方式，但不决定所要生成的具体的类，具体的处理全部交给子类负责，完成生成实例的框架 `framework` 和实际负责实例的类解耦
1. 产品 `Product`
   > 属于框架方，是一个抽象类，定义了 `Factory Method` 模式中生成的那些实例所持有的接口（`API`），但是具体的处理交给子类 `ConcreteProduct` 角色决定
2. 创建者 `Creator`
   > 属于框架方，负责生成 `Product` 角色的抽象类，具体的处理由子类 `ConcreateCreator` 决定。__不用 `new` 关键字生成实例，而是调用实例的专用方法来生成实例，这样可以防止父类与其他具体类耦合__
3. 具体的产品 `ConcreateProduct`
   > 属于具体加工方，决定了具体的产品
4. 具体的创建者 `ConcreteCreator`
   > 属于具体加工方，负责生成具体的产品

### [Singleton 单例](src/main/java/com/example/demo/mode/singleton/)
> 只有一个实例
1. 单例 `Singleton`
   > 含有返回唯一实例的 `static` 方法，该方法总是返回唯一实例

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

### [builder 建造者](src/main/java/com/example/demo/mode/builder/)
> 组装复杂的实例
1. 建造者 `Builder`
   > 负责定义用于生成实例的接口
2. 具体的建造者 `ConcreateBuilder`
   > 负责实现 `Builder` 角色的接口的类
3. 监工 `Director`
   > 负责使用 `Builder` 角色的接口来生成实例，不依赖于 `ConcreateBuilder`

#### 与 `Template Method` 之间的区别
1. `Builder` 模式中，`Director` 角色控制 `Builder` 角色
2. `Template Method` 模式中，父类控制子类

### [Abstract Factory 抽象工厂](src/main/java/com/example/demo/mode/abstractfactory/)
> 将关联零件组装成产品
1. 抽象产品 `AbstractProduct`
   > 负责定义 `AbstractFactory` 所生成的抽象零件和产品的接口
2. 抽象工厂 `AbstarctFactory`
   > 负责定义用于生成抽象产品的接口
3. 具体的产品 `ConcreateProduct`
   > 负责实现 `AbstractProduct` 定义的接口
4. 具体的工厂 `ConcreateFactory`
   > 负责实现 `AbstractFactory` 定义的接口
5. 委托者 `Client`
   > 调用 `AbstractFactory` 和 `AbstractProduct` 的接口进行工作，对具体的产品和工厂一无所知

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

### [Strategy 策略](src/main/java/com/example/demo/mode/strategy/)
> 通过委托，整体地替换算法，使动态替换变成了可能
1. 策略 `Strategy`
   负责决定实现策略所必须的接口
2. 具体的策略 `ConcreateStrategy`
   负责实现具体的策略
3. 上下文 `Context`
   负责使用 `Strategy` 角色，保存 `ConcreateStrategy` 

### [Composite 组合](src/main/java/com/example/demo/mode/composite/)
> 容器与内容具有一致性，创造出递归结构
1. 树叶 `Leaf`
   > 表示内容的角色，该角色不能放入其他对象，如：`File`
2. 复合物 `Composite`
   > 表示容器的角色，可以在其中放入 `Leaf` 和 `Composite` 对象，如：`Directory`
3. `Component`
   > 使 `Leaf` 和 `Composite` 具有一致性的角色，如：`Entry`
4. `Client`
   > 使用 `Composite` 模式的角色，如 `TestEntry`

### [Decorator 装饰器](src/main/java/com/example/demo/mode/decorator/)
> 装饰边框和被装饰物有一致性，不断为对象添加装饰的设计模式
1. `Component`
   > 增加功能时的核心角色，如 `Display`，负责定义被装饰物的接口
2. `ConcreteComponent`
   > 实现了被装饰物的接口，如 `StringDisplay`
3. 装饰物 `Decorator`
   > 具有和 `Component` 同样的接口，内部保存了被装饰对象，`Component` 角色，`Decorator` 直到自己要装饰的对象，如 `Border`
4. 具体的装饰物 `ConcreateDecorator`
   > 具体的 `Decorator`，如 `FullBorder` 和 `SideBorder`

#### 接口的透明性
> 即使被装饰物被边框装饰起来了，接口也不会被隐藏，被装饰多次，接口也没有发生变化，这就是接口的透明性

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

### Chain Of Responsibility 职责链
> 推卸责任
1. 处理者 `Handler`
   > 定义了处理请求的接口，它知道下一个处理者是谁，如果自身没有办法处理，就把请求转给下一个处理者，如 `Support`
2. 具体的处理者 `ConcreateHandler`
   > 处理请求的具体角色
3. 请求者 `Client`
   > 向第一个 `ConcreateHandler` 角色发送请求的角色

### [Facade 外观模式](src/main/java/com/example/demo/mode/facade/)
> 简单窗口
1. 窗口 `Facade`
   > 代表构成系统的许多其他角色的“简单窗口”，向系统外部提供高层 `API`，如：`pageMaker`
2. 构成系统的许多其他角色
   > 各自完成自己的工作，`Facade` 角色调用其他角色进行工作，如：`database`, `htmlWriter`
3. 请求者 `Client`
   > 负责调用 `Facade`，如：`TestPageMaker`

### [Mediator 仲裁者模式](src/main/java/com/example/demo/mode/mediator/)
> 一个仲裁者，多个组员
1. 仲裁者/中介者 `Mediator`
   > 定义与 `Colleague` 角色进行通信和做出决定的接口，如 `Mediator`
2. 具体的仲裁者/中介者 `ConcreateMediator` 
   > 实现 `Mediator` 的接口，负责实际做出决定，如 `LoginFrame`
3. 同事 `Colleague`
   > 负责定义与 `Mediator` 进行通信的接口，如 `Colleague`
4. 具体的同事 `ConcreateColleague`
   > 负责实现 `Colleague` 的接口，如 `ColleaguCheckbox` ...

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

### [Memento 备忘录模式](src/main/java/com/example/demo/mode/memento/)
> 保存对象状态，实现应用程序的撤销，重做，历史记录，快照
1. 生成者 `Originator`
   > 保存自己的最新状态生成 `Memento` 角色，当把以前保存的 `Memento` 角色传递给 `Originator` 时，将自己恢复至生成 `Memento` 时的状态，如 `Gamer`
2. 纪念品 `Memento`
   > 保存了 `Originator` 的信息，但不会向外部公开信息

   - 两种接口
     1. 宽接口 `wide interface`
        > 所有用于恢复对象状态信息的方法的集合，宽接口会暴露所有的 `Memento` 的内部信息，使用宽接口的只能是 `Originator` 
     2. 窄接口 `narrowinterface`
        > 为外部的 `Caretaker` 角色提供窄接口，可以获取 `Menento` 角色内部信息非常有限，可以有效防止信息泄露
3. 负责人 `Caretaker`
   > 保存 `Originator` 当前状态时，会通知 `Originator` 角色，`Originator` 在收到通知后生成 `Menentor` 角色的实例并返回给 `Caretaker`，由于以后可能要恢复 `Originator`，`Caretaker` 会一直保存 `Menentor`
