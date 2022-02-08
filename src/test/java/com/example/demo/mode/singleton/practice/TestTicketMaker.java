package com.example.demo.mode.singleton.practice;

public class TestTicketMaker {
    public static void main(String[] args) {
        System.out.println("start");
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " : " + TicketMaker.getInstance().getNextTicketNumber());
        }
        System.out.println("end");
    }
}
