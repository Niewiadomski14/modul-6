package com.kodilla.stream.forumUser;

import java.time.LocalDate;

public final class ForumUser {
    private final int idNumber;
    private final String username;
    private final char sex;
    private final LocalDate dateBirth;
    private final int numberOfPosts;

    public ForumUser(final int idNumber, final String username, final char sex, final int yearOfBirth, final int monthOfBirth, final int dayOfBirth  , final int numberOfPosts) {
        this.idNumber = idNumber;
        this.username = username;
        this.sex = sex;
        this.dateBirth = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
        this.numberOfPosts = numberOfPosts;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public String getUsername() {
        return username;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getDateOfbirth() {
        return dateBirth;
    }

    public int getNumberOfPosts() {
        return numberOfPosts;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "idNumber=" + idNumber +
                ", username='" + username + '\'' +
                ", sex=" + sex +
                ", dateOfbirth=" + dateBirth +
                ", numberOfPosts=" + numberOfPosts +
                '}';
    }
}
