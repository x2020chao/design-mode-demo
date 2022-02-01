package com.example.demo.mode.adapter.practice.client;

import java.io.IOException;

import com.example.demo.mode.adapter.practice.adapter.ExtendsFileProperties;
import com.example.demo.mode.adapter.practice.target.FileIO;

public class TestFileIOExtendsApapter {
    public static void main(String[] args) {
        FileIO f = new ExtendsFileProperties();
        try {
            f.readFromFile("src/test/java/com/example/demo/mode/adapter/practice/client/file.txt");
            f.setValue("year", "2004");
            f.setValue("month", "4");
            f.setValue("day", "21");
            f.writeToFile("src/test/java/com/example/demo/mode/adapter/practice/client/newfile.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
