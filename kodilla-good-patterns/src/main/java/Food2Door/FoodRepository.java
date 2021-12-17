package Food2Door;

public class FoodRepository {
    public boolean createOrder(String restaurant, String product, int quantity){
        System.out.println("Restaurant: " + restaurant + " " + ", product: " + product + ", quantity: " + quantity);
        return true;
    }
}
