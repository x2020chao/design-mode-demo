package com.example.demo.mode.builder;

import com.example.demo.mode.builder.components.Director;
import com.example.demo.mode.builder.entity.TextBuilder;

public class TestTextBuilder {
    public static void main(String[] args) {
        TextBuilder textBuilder = new TextBuilder();
        Director director = new Director(textBuilder);
        director.construct();
        String result = textBuilder.getResult();
        System.out.println(result);       
    }
}
