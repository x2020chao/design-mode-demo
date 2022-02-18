package com.example.demo.mode.visitor.entity;

import com.example.demo.mode.visitor.component.Visitor;

// 接受访问者访问的类接口
public interface Element {
    public abstract void accept(Visitor visitor);
}
