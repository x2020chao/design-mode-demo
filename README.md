## 设计模式

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