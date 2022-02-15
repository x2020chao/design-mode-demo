package com.example.demo.mode.strategy;

public class TestStrategy {
    public static void main(String[] args) {
        int seed1 = 15;
        int seed2 = 314;
        Player player1 = new Player("Tom", new WinningStrategy(seed1));
        Player player2 = new Player("Jack", new ProbStratege(seed2));
        for (int i = 0; i < 10000; i++) {
            Hand nextHand1 = player1.nextHand();
            Hand nextHand2 = player2.nextHand();
            if (nextHand1.isStrongThan(nextHand2)) {
                System.out.println("第 " + (i + 1) + " 次比赛 Winner: " + player1);
                player1.win();
                player2.lose();
            } else if (nextHand1.isWeakerThan(nextHand2)) {
                System.out.println("第 " + (i + 1) + " 次比赛 Winner: " + player2);
                player2.win();
                player1.lose();
            } else {
                System.out.println("第 " + (i + 1) + " 次比赛 Even... ");
            }
        }
        System.out.println("resulet: ");
        System.out.println(player1.toString());
        System.out.println(player2.toString());
    }
}
