package com.kodilla.good.patterns.challenges;

public class OrderRequestRetriever {
    public OrderRequest retrieve() {
        User user = new User("Bartek","Niewiadomski");
        Product product = new Product("Slippers",19.99);

        return new OrderRequest(user, product);
    }
}
