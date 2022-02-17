package com.example.demo.mode.decorator.components;

// 装饰边框的抽象类
// 通过继承，装饰边框与被装饰物具有了相同的方法
public abstract class Border extends Display {
    protected Display display;

    protected Border(Display display) {
        this.display = display;
    }
}
