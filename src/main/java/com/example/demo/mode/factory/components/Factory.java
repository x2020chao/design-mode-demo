package com.example.demo.mode.factory.components;

public abstract class Factory {
    public final Product create(String owner) { /** 使用了 Template Method 模式 */
        Product p = createProduct(owner);
        registerProduct(p);
        return p;
    }

    protected abstract Product createProduct(String owner);

    protected abstract void registerProduct(Product product);
}
