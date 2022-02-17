package com.example.demo.mode.decorator.entity;

import com.example.demo.mode.decorator.components.Border;
import com.example.demo.mode.decorator.components.Display;

// 具体装饰字符串上下左右边框的类
public class FullBorder extends Border {
    public FullBorder(Display display) {
        super(display);
    }

    @Override
    public int getColumns() {
        return 1 + display.getColumns() + 1;
    }

    @Override
    public int getRows() {
        return 1 + display.getRows() + 1;
    }

    @Override
    public String getRowText(int row) {
        if (row == 0 || row == display.getRows() + 1) {
            return "+" + makeLine('-', display.getColumns()) + "+";
        }
        return "|" + display.getRowText(row - 1) + "|";
    }

    private String makeLine(char ch, int count) {
        StringBuffer buf = new StringBuffer();
        for (int i = 0; i < count; i++) {
            buf.append(ch);
        }
        return buf.toString();
    }
}
