package com.example.demo.mode.decorator;

import com.example.demo.mode.decorator.components.Display;
import com.example.demo.mode.decorator.components.StringDisplay;
import com.example.demo.mode.decorator.entity.FullBorder;
import com.example.demo.mode.decorator.entity.SideBorder;

public class TestDisplay {
    public static void main(String[] args) {
        Display d1 = new StringDisplay("Hello, World!");
        Display d2 = new SideBorder(d1, '#');
        Display d3 = new FullBorder(d2);
        d1.show();
        d2.show();
        d3.show();
    }
}
