package com.example.demo.mode.prototype;

import com.example.demo.mode.prototype.components.Manager;
import com.example.demo.mode.prototype.components.Product;
import com.example.demo.mode.prototype.entity.MessageBox;
import com.example.demo.mode.prototype.entity.UnderlinePen;

public class TestProduct {
    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.register("warning box", new MessageBox('*'));
        manager.register("add box", new MessageBox('+'));
        manager.register("underline", new UnderlinePen('-'));

        Product p1 = manager.create("warning box");
        p1.use("hello world");
        Product p2 = manager.create("add box");
        p2.use("hello");
        Product p3 = manager.create("underline");
        p3.use("world");
    }
}
