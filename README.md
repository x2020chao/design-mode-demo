## 设计模式

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