package com.example.demo.mode.builder.entity;

import com.example.demo.mode.builder.components.Builder;

public class TextBuilder extends Builder {
    private StringBuffer stringBuffer = new StringBuffer();

    @Override
    public void makeTitle(String title) {
        stringBuffer.append("===================\n");
        stringBuffer.append("【" + title + "】\n");
        stringBuffer.append("\n");
    }

    @Override
    public void makeString(String str) {
        stringBuffer.append("·" + str + "\n");
        stringBuffer.append("\n");
    }

    @Override
    public void makeItems(String[] items) {
        for(int i =0;i<items.length;i++) {
            stringBuffer.append(" -" + items[i] + "\n");
        }
        stringBuffer.append("\n");
    }

    @Override
    public void close() {
        stringBuffer.append("===================\n");
    }

    public String getResult() {
        return stringBuffer.toString();
    }
}
