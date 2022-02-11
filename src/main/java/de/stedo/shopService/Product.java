package de.stedo.shopService;

public class Product {

    private String productName;
    private int productId;

    public Product(int productId, String productName) {

        this.productName = productName;
        this.productId = productId;

    }

    public String getProductName() {
        return productName;
    }

    public int getProductId() {
        return productId;
    }

}
