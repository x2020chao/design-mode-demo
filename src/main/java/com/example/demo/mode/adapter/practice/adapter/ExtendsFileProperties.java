package com.example.demo.mode.adapter.practice.adapter;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import com.example.demo.mode.adapter.practice.target.FileIO;

/**
 * 被适配 adaptee：java.util.Properties
 */
public class ExtendsFileProperties extends Properties implements FileIO {
    @Override
    public void readFromFile(String fileName) throws IOException {
        File file = new File(fileName);
        InputStream inputStream = new FileInputStream(file);
        load(inputStream);
    }

    @Override
    public void writeToFile(String fileName) throws IOException {
        File file = new File(fileName);
        OutputStream outputStream = new FileOutputStream(file);
        store(outputStream, null);
    }

    @Override
    public void setValue(String key, String value) {
        this.setProperty(key, value);
    }

    @Override
    public String getValue(String key) {
        return this.getProperty(key);
    }
}
