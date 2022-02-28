package com.example.demo.mode.facade;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Properties;

public class PageMaker {
    private PageMaker() {

    }

    public static void makeWelcomePage(String mailaddr, String filename) {
        try {
            Properties mailProp = Database.getProperties("maildata");
            String usernanme = mailProp.getProperty(mailaddr);
            HtmlWriter writer = new HtmlWriter(new OutputStreamWriter(
                    new FileOutputStream("src/main/java/com/example/demo/mode/facade/" + filename), "UTF-8"));
            writer.title("Welcome to " + usernanme + "'s page!");
            writer.paragraph(usernanme + "欢迎来到" + usernanme + "的主页");
            writer.mailto(mailaddr, usernanme);
            writer.close();
            System.out.println(filename + " is created for " + mailaddr + "(" + usernanme + ")");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
