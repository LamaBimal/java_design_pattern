package com.learning.designpatterns.behavioral.iteratorpattern.book;

import com.learning.designpatterns.behavioral.iteratorpattern.book.BookIterator;
import com.learning.designpatterns.behavioral.iteratorpattern.iterator.Aggregate;
import com.learning.designpatterns.behavioral.iteratorpattern.iterator.Iterator;
import com.learning.designpatterns.behavioral.iteratorpattern.book.Book;

import java.util.ArrayList;
import java.util.List;

// Book Collection
public class BookCollection implements Aggregate {

    private List<Book> bookList = new ArrayList<>();

    public void addBook(Book book){
        bookList.add(book);
    }

    @Override
    public Iterator createIterator() {
        return new BookIterator(bookList);
    }
}
