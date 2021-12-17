package Food2Door;

public class Food2DoorApp {
    public static void main(String[] args) {
        ProductFoodOrderService productFoodOrderService = new ProductFoodOrderService();
        Restaurants restaurants = productFoodOrderService.order("Meatballs", 25);

        FoodOrderProcessor foodOrderProcessor = new FoodOrderProcessor(new FoodRepository());
        foodOrderProcessor.process(restaurants);
    }
}
