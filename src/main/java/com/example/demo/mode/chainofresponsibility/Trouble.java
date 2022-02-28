package com.example.demo.mode.chainofresponsibility;

// 发生问题的类
public class Trouble {
    private int number; // 问题号

    public Trouble(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "[Trouble " + number + "]";
    }
}