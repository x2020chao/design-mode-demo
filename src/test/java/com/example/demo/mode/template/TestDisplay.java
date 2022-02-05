package com.example.demo.mode.template;

import com.example.demo.mode.template.components.AbstractDisplay;
import com.example.demo.mode.template.entity.CharDisplay;
import com.example.demo.mode.template.entity.StringDisplay;

public class TestDisplay {
    public static void main(String[] args) {
        AbstractDisplay ch = new CharDisplay('H');
        AbstractDisplay string = new StringDisplay("Hello, World!");
        ch.display();
        string.display();
    }
}
