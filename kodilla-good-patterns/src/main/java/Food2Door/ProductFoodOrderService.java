package Food2Door;

public class ProductFoodOrderService {
    public Restaurants order(String product, int quantity){
        if(quantity > 50 || product.startsWith("Meat")){
            return new ExtraFoodShop(product, quantity);
        }else if(quantity < 20 || product.startsWith("Healthy")){
            return new HealthyShop(product, quantity);
        }else{
            return new GlutenFreeShop(product, quantity);
        }
    }
}
