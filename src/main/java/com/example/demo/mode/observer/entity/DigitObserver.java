package com.example.demo.mode.observer.entity;

import com.example.demo.mode.observer.components.NumberGenerator;
import com.example.demo.mode.observer.components.Observer;

public class DigitObserver implements Observer {
    @Override
    public void update(NumberGenerator generator) {
        System.out.println("DigitObserver: " + generator.getNumber());
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {

        }
    }
}
