package com.example.demo.mode.singleton.practice;

public class TestTriple {
    public static void main(String[] args) {
        System.out.println("start");
        for (int i = 0; i < 10; i++) {
            System.out.println(i + " : " + Triple.getInstance(i % 3));
        }
        System.out.println("end");
    }
}
