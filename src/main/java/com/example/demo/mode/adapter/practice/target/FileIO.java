package com.example.demo.mode.adapter.practice.target;

import java.io.IOException;

public interface FileIO {
    public void readFromFile(String fileName) throws IOException;

    public void writeToFile(String fileName) throws IOException;

    public void setValue(String key, String value);

    public String getValue(String key);
}
