package com.example.demo.mode.abstractfactory.entity.table;

import com.example.demo.mode.abstractfactory.factory.Factory;
import com.example.demo.mode.abstractfactory.factory.Link;
import com.example.demo.mode.abstractfactory.factory.Page;
import com.example.demo.mode.abstractfactory.factory.Tray;

public class TableFactory extends Factory {
    @Override
    public Link createLink(String caption, String url) {
        return new TableLink(caption, url);
    }

    @Override
    public Page createPage(String title, String author) {
        return new TablePage(title, author);
    }

    @Override
    public Tray createTray(String caption) {
        return new TableTray(caption);
    }
}
