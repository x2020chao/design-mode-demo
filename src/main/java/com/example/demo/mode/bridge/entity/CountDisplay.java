package com.example.demo.mode.bridge.entity;

import com.example.demo.mode.bridge.components.Display;
import com.example.demo.mode.bridge.components.DisplayImpl;

// 类功能层次结构
public class CountDisplay extends Display {
    public CountDisplay(DisplayImpl impl) {
        super(impl);
    }

    public void multiDisplay(int times) {
        open();
        for (int i = 0; i < times; i++) {
            print();
        }
        close();
    }
}
