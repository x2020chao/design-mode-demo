## 设计模式


### [Composite 组合](src/main/java/com/example/demo/mode/composite/)
> 容器与内容具有一致性，创造出递归结构
1. 树叶 `Leaf`
   > 表示内容的角色，该角色不能放入其他对象，如：`File`
2. 复合物 `Composite`
   > 表示容器的角色，可以在其中放入 `Leaf` 和 `Composite` 对象，如：`Directory`
3. `Component`
   > 使 `Leaf` 和 `Composite` 具有一致性的角色，如：`Entry`
4. `Client`
   > 使用 `Composite` 模式的角色，如 `TestEntry`