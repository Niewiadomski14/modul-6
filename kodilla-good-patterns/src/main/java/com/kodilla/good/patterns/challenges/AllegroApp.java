package com.kodilla.good.patterns.challenges;

public class AllegroApp {
    public static void main(String[] args) {
        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();

        OrderProcessor orderProcessor = new OrderProcessor(
                new MailService(), new ProductOrderService(), new OrderRepository());
        orderProcessor.process(orderRequest);

    }
}

