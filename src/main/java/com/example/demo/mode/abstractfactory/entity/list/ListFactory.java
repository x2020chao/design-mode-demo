package com.example.demo.mode.abstractfactory.entity.list;

import com.example.demo.mode.abstractfactory.factory.Factory;
import com.example.demo.mode.abstractfactory.factory.Link;
import com.example.demo.mode.abstractfactory.factory.Page;
import com.example.demo.mode.abstractfactory.factory.Tray;

public class ListFactory extends Factory {
    @Override
    public Link createLink(String caption, String url) {
        return new ListLink(caption, url);
    }

    @Override
    public Tray createTray(String caption) {
        return new ListTray(caption);
    }

    @Override
    public Page createPage(String title, String author) {
        return new ListPage(title, author);
    }
}
