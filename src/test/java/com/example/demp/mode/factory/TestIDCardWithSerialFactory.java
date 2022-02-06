package com.example.demp.mode.factory;

import com.example.demo.mode.factory.components.Factory;
import com.example.demo.mode.factory.components.Product;
import com.example.demo.mode.factory.practice.IDCardWithSerialFactory;

public class TestIDCardWithSerialFactory {
    public static void main(String[] args) {
        Factory factory = new IDCardWithSerialFactory();
        Product product1 = factory.create("小明");
        Product product2 = factory.create("小红");
        product1.use();
        product2.use();
    }
}
