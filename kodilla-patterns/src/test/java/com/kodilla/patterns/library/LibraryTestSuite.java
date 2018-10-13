package com.kodilla.patterns.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class LibraryTestSuite {
    @Test
    public void testGetBooks() {
        Library library = new Library("Library1");
        Book book1 = new Book("Book1", "Author1", LocalDate.of(2000, 1, 1));
        Book book2 = new Book("Book2", "Author2", LocalDate.of(2001, 2, 11));
        Book book3 = new Book("Book3", "Author3", LocalDate.of(2002, 3, 21));
        Book book4 = new Book("Book4", "Author4", LocalDate.of(2003, 4, 29));
        Book book5 = new Book("Book5", "Author5", LocalDate.of(2004, 5, 9));

        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);
        library.getBooks().add(book4);
        library.getBooks().add(book5);

        Library cloneLibrary = null;
        try {
            cloneLibrary = library.shallowCopy();
            cloneLibrary.setName("Library2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Library3");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Assert.assertEquals(5, library.getBooks().size());
        Assert.assertEquals(5, cloneLibrary.getBooks().size());
        Assert.assertEquals(5, deepClonedLibrary.getBooks().size());
    }
}
