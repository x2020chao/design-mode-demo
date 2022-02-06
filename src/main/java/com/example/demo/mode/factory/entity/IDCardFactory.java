package com.example.demo.mode.factory.entity;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.mode.factory.components.Factory;
import com.example.demo.mode.factory.components.Product;

public class IDCardFactory extends Factory {
    private List<String> owners = new ArrayList<>();

    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner);
    }

    @Override
    protected void registerProduct(Product product) {
        owners.add(((IDCard) product).getOwner());
    }

    public List<String> getOwners() {
        return owners;
    }
}
