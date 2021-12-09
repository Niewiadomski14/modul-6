package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main(String[] args) {
        SecondChallange secondChallange = new SecondChallange();

        try {
            String result = secondChallange.probablyIWillThrowException(1.0, 1.0);
            System.out.println(result);
        } catch (Exception e) {
            System.out.println("Something is wrong!" + e);
        } finally {
            System.out.println("Always");
        }
    }

}
