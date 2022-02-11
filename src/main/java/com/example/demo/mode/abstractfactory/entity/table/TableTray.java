package com.example.demo.mode.abstractfactory.entity.table;

import java.util.Iterator;

import com.example.demo.mode.abstractfactory.factory.Item;
import com.example.demo.mode.abstractfactory.factory.Tray;

public class TableTray extends Tray {
    public TableTray(String caption) {
        super(caption);
    }

    @Override
    public String makeHTML() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("<td>\n");
        buffer.append("<table width=\"100%\" border=\"1\">\n");
        buffer.append("<tr>\n");
        buffer.append("<td bgcolor=\"#ccc\" align=\"center\" colspan=\"" + tray.size() + "\">\n");
        buffer.append("<b>" + caption + "</b>\n");
        buffer.append("</td>\n");
        buffer.append("</tr>\n");
        buffer.append("<tr>\n");
        Iterator<Item> iterator = tray.iterator();
        while (iterator.hasNext()) {
            Item item = iterator.next();
            buffer.append(item.makeHTML());
        }
        buffer.append("</tr>\n");
        buffer.append("</table>\n");
        buffer.append("</td>\n");
        return buffer.toString();
    }
}
