package Food2Door;

public class FoodOrderDto {
    private String product;
    private int quantity;
    private boolean isOrdered;

    public FoodOrderDto(String product, int quantity, boolean isOrdered) {
        this.product = product;
        this.quantity = quantity;
        this.isOrdered = isOrdered;
    }

    public String getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }


    public boolean isOrdered() {
        return isOrdered;
    }

    @Override
    public String toString() {
        return "FoodOrderDto{" +
                "product='" + product + '\'' +
                ", quantity=" + quantity +
                ", isOrdered=" + isOrdered +
                '}';
    }
}
