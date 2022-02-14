package com.example.demo.mode.bridge;

import com.example.demo.mode.bridge.components.Display;
import com.example.demo.mode.bridge.entity.CountDisplay;
import com.example.demo.mode.bridge.entity.StringDisplayImpl;

public class TestDisplay {
    public static void main(String[] args) {
        Display d1 = new Display(new StringDisplayImpl("Hello China."));
        CountDisplay d2 = new CountDisplay(new StringDisplayImpl("Hello World"));
        d1.display();
        d2.display();
        d2.multiDisplay(2);
    }
}
