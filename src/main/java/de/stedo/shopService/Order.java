package de.stedo.shopService;

public class Order {

    private String orderedProducts;
    private int orderId;

    public Order(int orderId, String orderedProducts) {
        this.orderedProducts = orderedProducts;
        this.orderId = orderId;
    }
}
