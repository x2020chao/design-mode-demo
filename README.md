## 设计模式

### Template Method 模板方法
> 将具体处理交给子类，带有模板功能，在父类中定理处理流程的框架，在子类中时间具体处理
1. 抽象类 `AbstractClass`
   > 不仅负责实现模板方法，还负责声明在模板方法中所使用到的抽象方法，这些抽象方法由子类 `ConcreateClass` 负责实现
2. 具体类 `ConcreteClass` 
   > 负责具体实现抽象类 `AbstractClass` 中定义的抽象方法，这里实现的方法将在 `AbstractClass` 角色的模板方法中被调用