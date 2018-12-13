package com.kodilla.patterns.library;

import java.util.HashSet;
import java.util.Set;

public class Library extends Prototype {
    private String name;
    private Set<Book> books = new HashSet<>();

    public Library(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Library{" +
                "name='" + name + '\'' +
                ", books=" + books +
                '}';
    }

    public Library shallowCopy() throws CloneNotSupportedException {
        return (Library) super.clone();
    }

    public Library deepCopy() throws CloneNotSupportedException {
        Library cloneLibrary = (Library)super.clone();
        Set<Book> newBooks = new HashSet<>();
        for(Book theBook : books) {
            Book cloneBook = new Book(theBook.getTitle(), theBook.getAuthor(), theBook.getPublicationDate());
                newBooks.add(cloneBook);
        }
        cloneLibrary.books = newBooks;
        return cloneLibrary;
    }
}
