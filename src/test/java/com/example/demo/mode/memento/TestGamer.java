package com.example.demo.mode.memento;

import com.example.demo.mode.memento.game.Gamer;
import com.example.demo.mode.memento.game.Memento;

public class TestGamer {
    public static void main(String[] args) {
        Gamer gamer = new Gamer(100);
        Memento memento = gamer.createMemento();
        for (int i = 0; i < 100; i++) {
            System.out.println("=========== " + i);
            System.out.println("主人公状态：" + gamer);
            gamer.bet();
            System.out.println("持有金钱：" + gamer.getMoney());
            if (gamer.getMoney() > memento.getMoney()) {
                System.out.println("持有金币增加，保存");
                memento = gamer.createMemento();
            } else if (gamer.getMoney() < memento.getMoney() / 2) {
                System.out.println("金币减少，撤销");
                gamer.restoreMemento(memento);
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            System.out.println();
        }
    }
}
