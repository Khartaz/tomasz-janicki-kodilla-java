package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

import static java.util.Calendar.*;

public class Forum {
    private final List<ForumUser> forumUsers = new ArrayList<>();

    public Forum() {
        forumUsers.add(new ForumUser("Eryk", 2000, FEBRUARY, 23, 'M', 1001, 50));
        forumUsers.add(new ForumUser("Ula", 1992, DECEMBER, 30, 'F', 1002, 30));
        forumUsers.add(new ForumUser("Eddy", 1992, OCTOBER, 4, 'M', 1003, 100));
        forumUsers.add(new ForumUser("Tom", 1992, APRIL, 8, 'M', 1004, 150));
        forumUsers.add(new ForumUser("Luiza", 1992, MAY, 3, 'F', 1005, 0));
        forumUsers.add(new ForumUser("Marian", 2003, SEPTEMBER, 15, 'M', 1006, 60));
        forumUsers.add(new ForumUser("Anna", 1992, DECEMBER, 21, 'F', 1007, 80));
        forumUsers.add(new ForumUser("Kasia", 1992, JULY, 6, 'F', 1008, 220));
    }
    public List<ForumUser> getList() {

        return new ArrayList<>(forumUsers);
    }
}
