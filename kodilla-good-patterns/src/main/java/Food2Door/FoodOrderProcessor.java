package Food2Door;

public class FoodOrderProcessor {
    private FoodRepository foodRepository;

    public FoodOrderProcessor(FoodRepository foodRepository) {
        this.foodRepository = foodRepository;
    }

    public FoodOrderDto process(Restaurants restaurants) {
        boolean isOrdered = restaurants.process();

        if(isOrdered){
            foodRepository.createOrder(restaurants.getClass().getSimpleName(), restaurants.getProduct(), restaurants.getQuantity());
            return new FoodOrderDto(restaurants.getProduct(), restaurants.getQuantity(),true);
        }else{
            return new FoodOrderDto(restaurants.getProduct(), restaurants.getQuantity(), false);
        }
    }
}
