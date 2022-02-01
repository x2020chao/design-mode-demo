package com.example.demo.mode.iterator;

import com.example.demo.mode.iterator.components.Iterator;
import com.example.demo.mode.iterator.entity.Book;
import com.example.demo.mode.iterator.practice.BookShelf;

public class TestListIterator {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf();
        bookShelf.appendBook(new Book("图解设计模式"));
        bookShelf.appendBook(new Book("图解HTTP"));
        bookShelf.appendBook(new Book("图解TCP/IP"));
        Iterator iterator = bookShelf.iterator();
        while (iterator.hasNext()) {
            Book book = (Book) iterator.next();
            System.out.println(book.getName());
        }
    }
}
