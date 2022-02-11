package com.example.demo.mode.abstractfactory.factory;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

/**
 * 抽象零件（产品）
 */
public abstract class Page {
    protected String title;
    protected String author;
    protected List<Item> content = new ArrayList<>();

    public Page(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void add(Item item) {
        content.add(item);
    }

    public void output() {
        try {
            String fileName = title + ".html";
            Writer writer = new BufferedWriter(new OutputStreamWriter(
                    new FileOutputStream("src/main/java/com/example/demo/mode/abstractfactory/" + fileName), "UTF-8"));
            writer.write(makeHTML());
            writer.close();
            System.out.println(fileName + "编写完成");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public abstract String makeHTML();
}
