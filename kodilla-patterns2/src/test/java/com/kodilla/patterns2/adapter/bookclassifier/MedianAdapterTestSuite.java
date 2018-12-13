package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class MedianAdapterTestSuite {
    @Test
    public void publicationYearMedianTest() {
        //Given
        MedianAdapter medianAdapter = new MedianAdapter();
        Set<Book> books = new HashSet<>();
        books.add(new Book("Test", "Test1", 2391, "Test1"));
        books.add(new Book("Test", "Test2", 1841, "Test2"));
        books.add(new Book("Test", "Test3", 1500, "Test3"));
        books.add(new Book("Test", "Test4", 2010, "Test4"));
        books.add(new Book("Test", "Test4", 1900, "Test4"));
        //When
        int result =  medianAdapter.publicationYearMedian(books);
        //Then
        assertEquals(1900, result);
    }
}
