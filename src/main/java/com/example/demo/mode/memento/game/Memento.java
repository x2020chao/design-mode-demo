package com.example.demo.mode.memento.game;

import java.util.List;
import java.util.ArrayList;

public class Memento {
    int money;
    ArrayList<String> fruits;

    Memento(int money) {
        this.money = money;
        this.fruits = new ArrayList<>();
    }

    public int getMoney() {
        return money;
    }

    void addFruit(String fruit) {
        fruits.add(fruit);
    }

    List<String> getFruits() {
        return (List<String>) fruits.clone();
    }
}
