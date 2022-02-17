package com.example.demo.mode.decorator.entity;

import com.example.demo.mode.decorator.components.Border;
import com.example.demo.mode.decorator.components.Display;

// 具体装饰字符串左右两端的边框类
public class SideBorder extends Border {
    private char borderChar; // 装饰边框的字符

    public SideBorder(Display display, char ch) {
        super(display);
        borderChar = ch;
    }

    @Override
    public int getColumns() {
        return 1 + display.getColumns() + 1;
    }

    @Override
    public int getRows() {
        return display.getRows();
    }

    @Override
    public String getRowText(int row) {
        return borderChar + display.getRowText(row) + borderChar;
    }
}
