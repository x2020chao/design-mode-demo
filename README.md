## 设计模式

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