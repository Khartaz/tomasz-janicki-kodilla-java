package com.kodilla.spring.reader;

public final class Reader {
    final private Book theBook;

    public Reader(final Book theBook) { // pole theBook inicjonowane przez konstruktor
        this.theBook = theBook;
    }

    public void read() {
        System.out.println("Reading: " + theBook.getTitle());
    }
}