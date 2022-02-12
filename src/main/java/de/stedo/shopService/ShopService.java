package de.stedo.shopService;

import java.util.List;
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

    public void add(int id, String name, List<Integer> artikelId, int orderListId) {
        Order order = new Order(id, name, artikelId);
        databaseOrders.getOrderList().put(orderListId, order);
    }

    public String getProduct(int id) {
        return databaseProducts.getProduct(id).getProductName();
    }

    public String listProducts() {
        String list = "";
        int listSize = databaseProducts.getProductList().size();
        for (int i = 1; i <= listSize; i++) {
            list += databaseProducts.getProductList().get(i).getProductName() + ", ";
        }
        return list;
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

}
