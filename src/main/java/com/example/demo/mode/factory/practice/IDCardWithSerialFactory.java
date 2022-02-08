package com.example.demo.mode.factory.practice;

import java.util.HashMap;
import java.util.Map;

import com.example.demo.mode.factory.components.Factory;
import com.example.demo.mode.factory.components.Product;

public class IDCardWithSerialFactory extends Factory {
    private Map<Integer, String> owners = new HashMap<>();
    private int serial;

    @Override
    protected synchronized Product createProduct(String owner) {
        return new IDCardWithSerial(owner, ++serial);
    }

    @Override
    protected void registerProduct(Product product) {
        owners.put(((IDCardWithSerial) product).getSerial(), ((IDCardWithSerial) product).getOwner());
    }

    public Map<Integer, String> getOwners() {
        return owners;
    }
}
