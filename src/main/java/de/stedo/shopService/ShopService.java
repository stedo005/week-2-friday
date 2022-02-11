package de.stedo.shopService;

import java.util.Map;

public class ShopService {

    private ProductRepo databaseProducts;
    private OrderRepo databaseOrders;

    public ShopService(ProductRepo database) {
        this.databaseProducts = database;
    }

    public ShopService(OrderRepo databaseOrders) {
        this.databaseOrders = databaseOrders;
    }

    public String getOrder(int id) {
        return databaseOrders.getOrder(id).getOrderName();
    }

    public String listOrders () {
        String list = "";
        int listSize = databaseOrders.getOrderList().size();
        for (int i = 1; i <= listSize; i++) {
            list += databaseOrders.getOrderList().get(i).getOrderName() + ", ";
        }
        return list;
    }


    public String getProduct(int id) {

        return databaseProducts.getProductFromList(id);

    }

    public String getProductList() {

        return databaseProducts.getProductList();

    }

}
