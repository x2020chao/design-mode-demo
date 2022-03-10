## 设计模式


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