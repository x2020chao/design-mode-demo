package com.example.demo.mode.strategy;

/**
 * 猜拳策略
 */
public interface Strategy {
    public abstract Hand nextHand(); // 下一局要出的手势

    public abstract void study(boolean win); // 上局是否获胜
}
