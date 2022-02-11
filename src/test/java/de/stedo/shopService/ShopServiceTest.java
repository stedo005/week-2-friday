package de.stedo.shopService;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class ShopServiceTest {

    @Test
    @DisplayName("should be Hemd")
    void test1() {

        Product hemd = new Product(1, "Hemd");
        Product hose = new Product(2, "Hose");
        Product bluse = new Product(3, "Bluse");
        Product rock = new Product(4, "Rock");

        Map<Integer, Product> mapOfProducts = new HashMap<>();

        mapOfProducts.put(1, hemd);
        mapOfProducts.put(2, hose);
        mapOfProducts.put(3, bluse);
        mapOfProducts.put(4, rock);

        ProductRepo productsDatabase = new ProductRepo(mapOfProducts);
        ShopService shop = new ShopService(productsDatabase);

        System.out.println(shop.getProduct(1));
        System.out.println(shop.listProducts());

    }

    @Test
    @DisplayName("orderList")
    void orderTest2() {

        Product hemd = new Product(1, "Hemd");
        Product hose = new Product(2, "Hose");
        Product bluse = new Product(3, "Bluse");
        Product rock = new Product(4, "Rock");

        List<Integer> artikel = new LinkedList<>();
        artikel.add(1);
        artikel.add(2);

        Order order = new Order(1, "Bestellung 1", artikel);
        Order order1 = new Order(2, "Bestellung 2", artikel);

        Map<Integer, Order> mapOfOrders = new HashMap<>();
        mapOfOrders.put(1, order);
        mapOfOrders.put(2, order1);

        OrderRepo orderDatabase = new OrderRepo(mapOfOrders);
        ShopService shop = new ShopService(orderDatabase);

        System.out.println(shop.listOrders());

        shop.add(3, "Bestellung 3", artikel,3);

        System.out.println(shop.getOrder(1));
        System.out.println(shop.listOrders());

        OrderRepo actual = orderDatabase;

        assertEquals(orderDatabase, actual);

    }

}