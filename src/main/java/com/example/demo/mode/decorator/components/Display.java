package com.example.demo.mode.decorator.components;

// 显示多行字符的抽象类
public abstract class Display {
    public abstract int getColumns(); // 横向字符数

    public abstract int getRows(); // 纵向行数

    public abstract String getRowText(int row); // 第 row 行的字符串

    public final void show() {
        for (int i = 0; i < getRows(); i++) {
            System.out.println(getRowText(i));
        }
    }
}