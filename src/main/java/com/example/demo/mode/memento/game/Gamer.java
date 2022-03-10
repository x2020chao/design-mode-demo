package com.example.demo.mode.memento.game;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Gamer {
    private int money;
    private List<String> fruits = new ArrayList<>();
    private Random random = new Random();
    private static String[] fruitsname = {
            "苹果", "葡萄", "香蕉", "橘子"
    };

    public Gamer(int money) {
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    private String getFruit() {
        String prefix = "";
        if (random.nextBoolean()) {
            prefix = "好吃的";
        }
        return prefix + fruitsname[random.nextInt(fruitsname.length)];
    }

    public void bet() {
        int dice = random.nextInt(6) + 1;
        if (dice == 1) {
            money += 100;
            System.out.println("持有金币增加：" + money);
        } else if (dice == 2) {
            money /= 2;
            System.out.println("持有金币减少：" + money);
        } else if (dice == 6) {
            String f = getFruit();
            System.out.println("获得了水果：" + f);
            fruits.add(f);
        } else {
            System.out.println("什么都没有发生");
        }
    }

    public Memento createMemento() { // 快照
        Memento memento = new Memento(money);
        Iterator<String> it = fruits.iterator();
        while (it.hasNext()) {
            String f = it.next();
            if (f.startsWith("好吃的")) {
                memento.addFruit(f);
            }
        }
        return memento;
    }

    public void restoreMemento(Memento memento) { // 撤销
        this.money = memento.money;
        this.fruits = memento.getFruits();
    }

    @Override
    public String toString() {
        return "[money = " + money + ", fruits = " + fruits + "]";
    }
}
