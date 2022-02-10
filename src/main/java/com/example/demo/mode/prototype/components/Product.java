package com.example.demo.mode.prototype.components;

public interface Product extends Cloneable {
    public abstract void use(String s);
    public abstract Product createClone();
}
