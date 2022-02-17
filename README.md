## 设计模式


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