package com.example.demo.mode.abstractfactory.factory;

/**
 * 抽象零件，统一处理
 */
public abstract class Item {
    protected String caption;

    public Item(String caption) {
        this.caption = caption;
    }

    public abstract String makeHTML();
}
