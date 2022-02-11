package com.example.demo.mode.abstractfactory.entity.table;

import java.util.Iterator;

import com.example.demo.mode.abstractfactory.factory.Item;
import com.example.demo.mode.abstractfactory.factory.Page;

public class TablePage extends Page {
    public TablePage(String title, String author) {
        super(title, author);
    }

    @Override
    public String makeHTML() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("<html>\n");
        buffer.append("<head>\n");
        buffer.append("<meta charset=\"utf-8\">");
        buffer.append("<title>" + title + "</title>\n");
        buffer.append("</head>\n");
        buffer.append("<body>\n");
        buffer.append("<h1>" + title + "</h1>\n");
        buffer.append("<table width=\"80%\" border=\"3\">\n");
        Iterator<Item> iterator = content.iterator();
        while (iterator.hasNext()) {
            Item item = iterator.next();
            buffer.append("<tr>" + item.makeHTML() + "</tr>\n");
        }
        buffer.append("</table>\n");
        buffer.append("<hr>");
        buffer.append("<adress>" + author + "</adress>");
        buffer.append("</body>\n");
        buffer.append("</html>\n");
        return buffer.toString();
    }
}
