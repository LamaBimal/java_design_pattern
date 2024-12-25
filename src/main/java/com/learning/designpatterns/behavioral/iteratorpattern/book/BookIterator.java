package com.learning.designpatterns.behavioral.iteratorpattern.book;

import com.learning.designpatterns.behavioral.iteratorpattern.iterator.Iterator;
import com.learning.designpatterns.behavioral.iteratorpattern.book.Book;

import java.util.List;

// Book Iterator
public class BookIterator implements Iterator {
    List<Book> bookList;
    int position = 0;

    public BookIterator(List<Book> list){
        this.bookList = list;
    }

    @Override
    public boolean hasNext() {
        return position < bookList.size();
    }

    @Override
    public Object next() {
        if(!hasNext()){
            return null;
        } else {
            return bookList.get(position++);
        }
    }
}
