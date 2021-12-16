package com.kodilla.good.patterns.challenges;

public class MailService implements InformationService {
    @Override
    public void inform(User user){
        System.out.println("Thank you " + user.getName() + " " + user.getSurname() + " " + "for your order!");
    }
}
