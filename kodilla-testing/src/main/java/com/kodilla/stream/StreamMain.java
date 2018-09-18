package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        Forum forum = new Forum();
        Map<Integer, String> userForumList = forum.getList().stream()
                .filter(forumUser -> forumUser.getGender() == 'M')
                .filter(forumUser -> forumUser.getDateOfBirth().isAfter(LocalDate.now().minusYears(20)))
                .filter(forumUser -> forumUser.getPublishedPosts() > 0)
                .collect(Collectors.toMap(ForumUser::getUserId, ForumUser::getUserName));

        System.out.println(userForumList);
    }
}





/* Processor processor = new Processor();
        // 2 Executor codeToExecute = () -> System.out.println("Say");
        //1 ExecuteSaySomething executeSaySomething = new ExecuteSaySomething();
        /* 3 /processor.execute(() -> System.out.println("Text example"));
        */
        /* PoemBeautifier poemBeautifier = new PoemBeautifier();
        System.out.println(poemBeautifier.beautify("TextSample", String::toUpperCase));
        System.out.println(poemBeautifier.beautify("NextSampleText", String::toLowerCase));
        System.out.println(poemBeautifier.beautify("NextBorringText", String -> "New String Text"));
        // NumbersGenerator.generateEven(20); */

        /*
        People.getList().stream()
                .map(String::toUpperCase)
                .filter(s -> s.length() >11)
                .map(s -> s.substring(0, s.indexOf(' ') +2) + ".")
                .filter(s -> s.substring(0, 1).equals("M"))
                .forEach(System.out::println);
                */

        /*
        Map<String,Book> theResultListOfBooks = bookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() > 2005)
                .collect(Collectors.toMap(Book::getSignature, book -> book));

        System.out.println("# elements: " + theResultListOfBooks.size());
        theResultListOfBooks.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);

         BookDirectory bookDirectory = new BookDirectory();
        String resultStringOfBooks = bookDirectory.getList().stream()
                .filter(book -> book.getYearOfPublication() >2005)
                .map(Book::toString)
                .collect(Collectors.joining(",\n","<<",">>"));

        System.out.println(resultStringOfBooks);

         */