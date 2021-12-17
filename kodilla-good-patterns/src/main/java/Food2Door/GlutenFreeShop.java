package Food2Door;

public class GlutenFreeShop implements Restaurants {
    private String product;
    private int quantity;


    public GlutenFreeShop(String product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public String getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public boolean process() {
        System.out.println("Thank you for your order! Your order: " + product + ", quantity: " + quantity);
        return true;
    }

    @Override
    public String toString() {
        return "GlutenFreeShop{" +
                "product='" + product + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
