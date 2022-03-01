package com.example.demo.mode.mediator.components;

// 仲裁者
public interface Mediator {
    public abstract void createColleagues(); // 生成要管理的组员

    public abstract void colleagueChanged(); // 组员对仲裁者进行报告
}