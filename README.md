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

### [Abstract Factory 抽象工厂]
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
