package de.stedo.shopService;

import java.util.List;
import java.util.Map;

public class ShopService {

    private ProductRepo databaseProducts;
    private OrderRepo databaseOrders;

    public ShopService(ProductRepo databaseProducts) {
        this.databaseProducts = databaseProducts;
    }

    public ShopService(OrderRepo databaseOrders) {
        this.databaseOrders = databaseOrders;
    }

    public ShopService(ProductRepo databaseProducts, OrderRepo databaseOrders) {
        this.databaseProducts = databaseProducts;
        this.databaseOrders = databaseOrders;
    }

    public void add(int orderId, String name, List<Integer> artikelIds) {

        artikelIds.forEach(Integer -> {
            boolean testArtikelIds = databaseProducts.getProductList().containsKey(Integer);
            if (!testArtikelIds) {
                throw new RuntimeException("Diesen Artikel gibt es nicht!");
            }
        });

        Order order = new Order(orderId, name, artikelIds);
        databaseOrders.getOrderList().put(orderId, order);
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
        if (databaseOrders.getOrder(id) == null) {
            return "Diese Bestellung gibt es nicht!";
        }
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
