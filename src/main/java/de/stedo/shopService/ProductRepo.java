package de.stedo.shopService;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class ProductRepo {

    private Map productList;

    public ProductRepo(Map productList) {

        this.productList = productList;

    }

    public String getProductFromList(int id) {
        return productList.get(id).toString();
    }

    public String getProductList() {

        int productListSize = productList.size();
        String stringProductList = "";

        for (int i = 1; i <= productListSize; i++) {
            stringProductList += productList.get(i).toString() + ", ";
        }

        return stringProductList;
    }

}
