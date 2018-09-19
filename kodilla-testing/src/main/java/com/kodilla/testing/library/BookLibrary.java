package com.kodilla.testing.library;

import java.util.ArrayList;
import java.util.List;

public class BookLibrary {
    LibraryDatabase libraryDatabase;

    public BookLibrary(LibraryDatabase libraryDatabase) {
        this.libraryDatabase = libraryDatabase;
    }

    public List<Book> listBooksWithConditions(String titleFragment) {
        List<Book> bookList = new ArrayList<>();
        if(titleFragment.length() < 3) {
            return bookList;
        }
        List<Book> resultList = libraryDatabase.listBooksWithCondition(titleFragment);

        if(resultList.size() > 20) {
            return bookList;
        }
        bookList = resultList;
        return bookList;
    }
    public List<Book> listBooksInHandsOf(LibraryUser libraryUser) {
        List<Book> bookList = new ArrayList<>();
        List<Book> result = libraryDatabase.listBooksInHandsOf(libraryUser);
        if(result.size() == 0) {
            System.out.printf("Nothing in hand");
        }
        if(result.size() > 0) {
            return bookList;
        }
        bookList = result;
        return  bookList;
    }
}