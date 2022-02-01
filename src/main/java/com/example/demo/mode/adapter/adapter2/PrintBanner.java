package com.example.demo.mode.adapter.adapter2;

import com.example.demo.mode.adapter.entity.Banner;

/**
 * 对象适配器模式，使用委托的适配器
 */
public class PrintBanner extends Print {
    private Banner banner;

    public PrintBanner(String string) {
        this.banner = new Banner(string);
    }

    @Override
    public void printWeak() {
        banner.showWithParen();
    }

    @Override
    public void printStrong() {
        banner.showWithAster();
    }
}
