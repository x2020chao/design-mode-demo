package com.example.demo.mode.abstractfactory;

import com.example.demo.mode.abstractfactory.factory.Factory;
import com.example.demo.mode.abstractfactory.factory.Link;
import com.example.demo.mode.abstractfactory.factory.Page;
import com.example.demo.mode.abstractfactory.factory.Tray;

public class TestListFactory {
    public static void main(String[] args) {
        Factory factory = Factory.getFactory("com.example.demo.mode.abstractfactory.entity.list.ListFactory");

        Link people = factory.createLink("人民日报", "http://www.people.com.cn");
        Link gmw = factory.createLink("光明日报", "http://www.gmw.cn");

        Link us_yahoo = factory.createLink("Yahoo!", "http://www.yahoo.com");
        Link jp_yahoo = factory.createLink("Yahoo!Japen", "http://www.yahoo.co.jp");
        Link excite = factory.createLink("Excite", "http://www.excite.com");
        Link google = factory.createLink("Google", "http://www.google.com");

        Tray trayNews = factory.createTray("日报");
        trayNews.add(people);
        trayNews.add(gmw);

        Tray trayYahoo = factory.createTray("Yahoo!");
        trayYahoo.add(us_yahoo);
        trayYahoo.add(jp_yahoo);

        Tray traySearch = factory.createTray("检索引擎");
        traySearch.add(trayYahoo);
        traySearch.add(excite);
        traySearch.add(google);

        Page page = factory.createPage("ListPage", "作者");
        page.add(trayNews);
        page.add(trayYahoo);
        page.add(traySearch);
        page.output();
    }
}
