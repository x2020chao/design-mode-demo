package com.example.demo.mode.abstractfactory.entity.list;

import java.util.Iterator;

import com.example.demo.mode.abstractfactory.factory.Item;
import com.example.demo.mode.abstractfactory.factory.Page;

public class ListPage extends Page {
    public ListPage(String title, String author) {
        super(title, author);
    }

    @Override
    public String makeHTML() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("<html><head><meta charset=\"utf-8\"> <title>" + title + "</title></head>\n");
        buffer.append("<body>\n");
        buffer.append("<h1>" + title + "</h1>");
        buffer.append("<ul>\n");
        Iterator<Item> it = content.iterator();
        while (it.hasNext()) {
            Item item = it.next();
            buffer.append(item.makeHTML());
        }
        buffer.append("</ul>\n");
        buffer.append("<hr>");
        buffer.append("<adress>" + author + "</adress>");
        buffer.append("</body></html>\n");
        return buffer.toString();
    }
}
