package com.example.demo.mode.adapter;

import com.example.demo.mode.adapter.adapter2.Print;
import com.example.demo.mode.adapter.adapter2.PrintBanner;

public class TestEntrustAdapter {
    public static void main(String[] args) {
        Print print = new PrintBanner("hello");
        print.printWeak();
        print.printStrong();
    }
}