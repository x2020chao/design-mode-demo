package com.example.demo.mode.prototype.entity;

import com.example.demo.mode.prototype.components.Product;

public class UnderlinePen implements Product {
    private char ulChar;

    public UnderlinePen(char ulChar) {
        this.ulChar  = ulChar;
    }

    @Override
    public void use(String s) {
        System.out.println("\"" + s+"\"");
        System.out.print(" ");
        for(int i =0;i<s.length();i++) {
            System.out.print(ulChar);
        }
        System.out.print(" ");
    }
    @Override
    public Product createClone() {
        Product p = null;
        try {
            p = (Product) clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return p;
    }
}
