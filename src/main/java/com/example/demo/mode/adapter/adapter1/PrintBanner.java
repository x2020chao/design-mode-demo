package com.example.demo.mode.adapter.adapter1;

import com.example.demo.mode.adapter.entity.Banner;

/**
 * 类适配器模式，使用继承的适配器
 */
public class PrintBanner extends Banner implements Print {
    public PrintBanner(String string) {
        super(string);
    }

    @Override
    public void printWeak() {
        showWithParen();
    }

    @Override
    public void printStrong() {
        showWithAster();
    }
}
