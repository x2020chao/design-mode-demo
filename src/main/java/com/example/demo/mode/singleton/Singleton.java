package com.example.demo.mode.singleton;

public class Singleton {
    private static Singleton singleton = new Singleton();

    private Singleton() { // 禁止从 Singleton 外部调用构造函数
        System.out.println("生成了一个实例");
    }

    public static Singleton getInstance() {
        return singleton;
    }
}
