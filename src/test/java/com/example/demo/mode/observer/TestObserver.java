package com.example.demo.mode.observer;

import com.example.demo.mode.observer.components.NumberGenerator;
import com.example.demo.mode.observer.components.Observer;
import com.example.demo.mode.observer.entity.DigitObserver;
import com.example.demo.mode.observer.entity.GraphObserver;
import com.example.demo.mode.observer.entity.RandomNumberGenerator;

public class TestObserver {
    public static void main(String[] args) {
        NumberGenerator numberGenerator = new RandomNumberGenerator();
        Observer o1 = new DigitObserver();
        Observer o2 = new GraphObserver();
        numberGenerator.addObserver(o1);
        numberGenerator.addObserver(o2);
        numberGenerator.execute();
    }
}
