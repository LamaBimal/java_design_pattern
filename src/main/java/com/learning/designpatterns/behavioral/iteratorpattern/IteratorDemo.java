package com.learning.designpatterns.behavioral.iteratorpattern;

import com.learning.designpatterns.behavioral.iteratorpattern.book.BookCollection;
import com.learning.designpatterns.behavioral.iteratorpattern.book.Book;
import com.learning.designpatterns.behavioral.iteratorpattern.iterator.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {

        BookCollection bookCollection = new BookCollection();
        bookCollection.addBook(new Book("Science"));
        bookCollection.addBook(new Book("Economics"));
        bookCollection.addBook(new Book("Mathematics"));

        Iterator iterator = bookCollection.createIterator();
        while (iterator.hasNext()){
            Book book = (Book)iterator.next();
            System.out.println(book.getTitle());
        }
    }
}
