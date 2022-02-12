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
    @DisplayName("simulated main")
    void orderTest2() {

        Product hemd = new Product(1, "Hemd");
        Product hose = new Product(2, "Hose");
        Product bluse = new Product(3, "Bluse");
        Product rock = new Product(4, "Rock");

        Map<Integer, Product> mapOfProducts = new HashMap<>();

        mapOfProducts.put(1, hemd);
        mapOfProducts.put(2, hose);
        mapOfProducts.put(3, bluse);
        mapOfProducts.put(4, rock);

        List<Integer> artikelIdsToAdd = new LinkedList<>();
        artikelIdsToAdd.add(1);
        artikelIdsToAdd.add(2);
        artikelIdsToAdd.add(3);

        Order order = new Order(1, "Bestellung 1", artikelIdsToAdd);
        Order order1 = new Order(2, "Bestellung 2", artikelIdsToAdd);

        Map<Integer, Order> mapOfOrders = new HashMap<>();
        mapOfOrders.put(1, order);
        mapOfOrders.put(2, order1);

        ProductRepo productDatabase = new ProductRepo(mapOfProducts);
        OrderRepo orderDatabase = new OrderRepo(mapOfOrders);

        ShopService shop = new ShopService(productDatabase, orderDatabase);

        System.out.println(shop.listOrders());

        shop.add(3, "Bestellung 3", artikelIdsToAdd);

        System.out.println(shop.getOrder(2));
        System.out.println(shop.listOrders());

    }

}