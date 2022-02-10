package com.example.demo.mode.builder;

import com.example.demo.mode.builder.components.Director;
import com.example.demo.mode.builder.entity.HTMLBuilder;

public class TestHTMLBuilder {
    public static void main(String[] args) {
        HTMLBuilder htmlBuilder = new HTMLBuilder();
        Director director = new Director(htmlBuilder);
        director.construct();
        System.out.println(htmlBuilder.getResult());
    }
}
