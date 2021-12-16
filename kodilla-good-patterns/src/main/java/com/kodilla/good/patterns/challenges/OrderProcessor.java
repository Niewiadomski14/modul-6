package com.kodilla.good.patterns.challenges;

public class OrderProcessor {
    private InformationService informationService;
    private ProductOrderService productOrderService;
    private OrderRepository orderRepository;

    public OrderProcessor(final InformationService informationService, final ProductOrderService productOrderService, final OrderRepository orderRepository) {
        this.informationService = informationService;
        this.productOrderService = productOrderService;
        this.orderRepository = orderRepository;
    }

    public OrderDto process(OrderRequest orderRequest) {
        boolean isOrdered = productOrderService.buy(orderRequest);
        if(isOrdered){
            informationService.inform(orderRequest.getUser());
            orderRepository.createOrder(orderRequest);
            return new OrderDto(orderRequest.getUser(), true);
        }else{
            return new OrderDto(orderRequest.getUser(), false);
        }
    }
}
