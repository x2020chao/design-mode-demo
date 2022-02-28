## 设计模式


### [Facade 外观模式](src/main/java/com/example/demo/mode/facade/)
> 简单窗口
1. 窗口 `Facade`
   > 代表构成系统的许多其他角色的“简单窗口”，向系统外部提供高层 `API`，如：`pageMaker`
2. 构成系统的许多其他角色
   > 各自完成自己的工作，`Facade` 角色调用其他角色进行工作，如：`database`, `htmlWriter`
3. 请求者 `Client`
   > 负责调用 `Facade`，如：`TestPageMaker`