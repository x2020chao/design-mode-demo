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

### Factory Method 工厂方法
> 父类决定实例的生成方式，但不决定所要生成的具体的类，具体的处理全部交给子类负责，完成生成实例的框架 `framework` 和实际负责实例的类解耦
1. 产品 `Product`
   > 属于框架方，是一个抽象类，定义了 `Factory Method` 模式中生成的那些实例所持有的接口（`API`），但是具体的处理交给子类 `ConcreteProduct` 角色决定
2. 创建者 `Creator`
   > 属于框架方，负责生成 `Product` 角色的抽象类，具体的处理由子类 `ConcreateCreator` 决定。__不用 `new` 关键字生成实例，而是调用实例的专用方法来生成实例，这样可以防止父类与其他具体类耦合__
3. 具体的产品 `ConcreateProduct`
   > 属于具体加工方，决定了具体的产品
4. 具体的创建者 `ConcreteCreator`
   > 属于具体加工方，负责生成具体的产品
