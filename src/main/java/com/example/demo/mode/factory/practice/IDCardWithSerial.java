package com.example.demo.mode.factory.practice;

import com.example.demo.mode.factory.components.Product;

public class IDCardWithSerial extends Product {
    private String owner;
    private int serial;

    IDCardWithSerial(String owner, int serial) {
        System.out.println("制作" + owner + "（" + serial + "）的卡片");
        this.owner = owner;
        this.serial = serial;
    }

    @Override
    public void use() {
        System.out.println("使用" + owner + "（" + serial + "）的卡片");
    }

    public String getOwner() {
        return owner;
    }

    public int getSerial() {
        return serial;
    }
}
