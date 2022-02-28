package com.example.demo.mode.facade;

import java.io.IOException;
import java.io.Writer;

public class HtmlWriter {
    private Writer writer;

    public HtmlWriter(Writer writer) {
        this.writer = writer;
    }

    public void title(String title) throws IOException { // 输出标题
        writer.write("<!DOCTYPE html>");
        writer.write("<html lang=\"zh-CN\">");
        writer.write("<head>");
        writer.write("<meta charset=\"utf-8\">");
        writer.write("<title>");
        writer.write(title);
        writer.write("</title>");
        writer.write("</head>");
        writer.write("<body>");
        writer.write("<h1>" + title + "</h1>");
    }

    public void paragraph(String msg) throws IOException { // 输出段落
        writer.write("<p>" + msg + "</p>");
    }

    public void link(String href, String caption) throws IOException { // 超链接
        paragraph("<a href=\"" + href + "\">" + caption + "</a>");
    }

    public void mailto(String mailaddr, String username) throws IOException { // 邮件地址
        link("mailto:" + mailaddr, username);
    }

    public void close() throws IOException {
        writer.write("</body>");
        writer.write("</html>");
        writer.close();
    }
}
