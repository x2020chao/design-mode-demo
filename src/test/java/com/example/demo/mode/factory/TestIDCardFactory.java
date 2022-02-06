package com.example.demo.mode.factory;

import com.example.demo.mode.factory.components.Factory;
import com.example.demo.mode.factory.components.Product;
import com.example.demo.mode.factory.entity.IDCardFactory;

public class TestIDCardFactory {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product card1 = factory.create("小明");
        Product card2 = factory.create("小红");
        card1.use();
        card2.use();
    }
}
