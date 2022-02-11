package de.stedo.shopService;

import java.util.Map;

public class ShopService {

    private ProductRepo databaseProducts;

    public ShopService(ProductRepo database) {
        this.databaseProducts = database;
    }

    public String getProduct(int id) {

        return databaseProducts.getProductFromList(id);

    }

    public String getProductList() {

        return databaseProducts.getProductList();

    }

}
