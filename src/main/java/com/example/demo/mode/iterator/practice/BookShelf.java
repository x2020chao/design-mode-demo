package com.example.demo.mode.iterator.practice;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.mode.iterator.components.Aggregate;
import com.example.demo.mode.iterator.components.Iterator;
import com.example.demo.mode.iterator.entity.Book;

/**
 * 书架
 * 修改数组为 java.util.ArrayList
 */
public class BookShelf implements Aggregate {
    private List<Book> books;

    public BookShelf() {
        this.books = new ArrayList<>();
    }

    public Book getBookAt(int index) {
        return books.get(index);
    }

    public void appendBook(Book book) {
        books.add(book);
    }

    public int getLength() {
        return books.size();
    }

    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}
