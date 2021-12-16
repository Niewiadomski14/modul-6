package com.kodilla.good.patterns.challenges;

public class OrderRepository {
     public boolean createOrder(OrderRequest orderRequest){
          System.out.println("Order for: " + orderRequest.getUser().getName() + " " + orderRequest.getUser().getSurname() + " " + ", product: "
                  + " " + orderRequest.getProduct().getProductName() + " " + "price: " + orderRequest.getProduct().getPrice() + " " + "is ready to delivery");
          return true;

     }
}
