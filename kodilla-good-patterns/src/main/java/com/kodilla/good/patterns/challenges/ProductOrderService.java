package com.kodilla.good.patterns.challenges;

public class ProductOrderService {

    public boolean buy(final OrderRequest orderRequest) {
        System.out.println(orderRequest.getUser().getName() + " " + orderRequest.getUser().getSurname() + " " + "You just bought product: "
                + " " + orderRequest.getProduct().getProductName() + " " + "for only: " + orderRequest.getProduct().getPrice());
        return true;
    }


}
