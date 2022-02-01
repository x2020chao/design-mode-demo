package com.example.demo.mode.adapter;

import com.example.demo.mode.adapter.adapter1.Print;
import com.example.demo.mode.adapter.adapter1.PrintBanner;

public class TestExtendsAdapter {
    public static void main(String[] args) {
        Print print = new PrintBanner("hello");
        print.printWeak();
        print.printStrong();
    }
}
