package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.forumUser.Forum;
import com.kodilla.stream.forumUser.ForumUser;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.person.People;
import com.kodilla.stream.reference.FunctionalCalculator;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;

class StreamMain {

    public static void main(String[] args) {
        //Task 7.2
       /* PoemBeautifier poemBeautifier = new PoemBeautifier();
        String a = poemBeautifier.beautify("bartek", beautify -> (beautify.toUpperCase()));
        System.out.println(a);
        String b = poemBeautifier.beautify("pierogi", decorate -> ("ABC" + decorate + "ABC"));
        System.out.println(b);
        String c = poemBeautifier.beautify("ZIMA", anotherBeautify -> (anotherBeautify.toLowerCase()));
        System.out.println(c);
        String d = poemBeautifier.beautify("Lato", anotherDecorate -> (anotherDecorate.replace("o", " świetlnych")));
        System.out.println(d); */

        ///Task 7.3

        BookDirectory theBooKDirectory = new BookDirectory();
        Forum theForum = new Forum();

       Map<Integer, ForumUser> theResultList = theForum.getUserList().stream()
                .filter(forumUser -> forumUser.getSex() == 'M')
                .filter(forumUser -> LocalDate.now().getYear() - forumUser.getDateOfbirth().getYear() >=20 )
                .filter(forumUser -> forumUser.getNumberOfPosts() >= 1)
                .collect(Collectors.toMap(ForumUser::getIdNumber, forumUser -> forumUser));

        System.out.println("# elements: " + theResultList.entrySet().size());
        theResultList.entrySet().stream()
                .map(entry -> entry.getKey() + ":" + entry.getValue())
                .forEach(System.out::println);




    }
}