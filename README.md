## 设计模式


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