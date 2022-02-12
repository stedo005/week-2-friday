package de.stedo.shopService;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class ProductRepo {

    private Map<Integer, Product> productList;

    public ProductRepo(Map<Integer, Product> productList) {
        this.productList = productList;
    }

    public Product getProduct(int id) {
        return productList.get(id);
    }

    public Map<Integer, Product> getProductList() {
        return productList;
    }
}
