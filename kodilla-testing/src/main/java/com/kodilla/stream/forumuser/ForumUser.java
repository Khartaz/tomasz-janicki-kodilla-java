package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public class ForumUser {
    private final String userName;
    private final LocalDate dateOfBirth;
    private final char gender;
    private final int userId;
    private final int publishedPosts;

    public ForumUser(final String userName, final int year,final int month,final int day, final char gender,
                     final int userId,final int publishedPosts) {
        this.userName = userName;
        this.dateOfBirth = LocalDate.of(year, month, day);
        this.gender = gender;
        this.userId = userId;
        this.publishedPosts = publishedPosts;
    }

    public String getUserName() {
        return userName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public char getGender() {
        return gender;
    }

    public int getUserId() {
        return userId;
    }

    public int getPublishedPosts() {
        return publishedPosts;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", gender=" + gender +
                ", dateOfBirth=" + dateOfBirth +
                ", publishedPosts=" + publishedPosts +
                '}';
    }
}
