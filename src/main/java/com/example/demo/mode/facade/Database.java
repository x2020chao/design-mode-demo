package com.example.demo.mode.facade;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Database {
    private Database() {
    }

    public static Properties getProperties(String dbname) {
        String filename = "src/main/java/com/example/demo/mode/facade/" + dbname + ".txt";
        Properties prop = new Properties();
        try {
            prop.load(new FileInputStream(filename));
        } catch (IOException e) {
            System.out.println("warning: " + filename + " is not found.");
        }
        return prop;
    }
}
