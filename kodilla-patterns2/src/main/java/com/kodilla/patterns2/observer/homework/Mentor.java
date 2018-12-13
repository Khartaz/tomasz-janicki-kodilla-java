package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer {
    private final String mentorName;
    private int updateCount;

    public Mentor(String  mentorName) {
        this.mentorName = mentorName;
    }

    @Override
    public void update(Tasklist tasklist) {
        System.out.println(mentorName + ": New tasklist " + tasklist.getName() + "\n" +
                " total: " + tasklist.getTasks().size() + " tasks");
        updateCount++;
    }

    public String getMentorName() {
        return mentorName;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
