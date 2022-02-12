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
    @DisplayName("simulated main")
    void Test() {

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

    @Test
    @DisplayName("should output Hose")
    void testGetProduct() {

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

        String actual = shop.getProduct(2);

        assertEquals("Hose", actual);

    }

    @Test
    @DisplayName("should output Hemd, Hose, Bluse, Rock, ")
    void testListProducts() {

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

        String actual = shop.listProducts();

        assertEquals("Hemd, Hose, Bluse, Rock, ", actual);

    }

    @Test
    @DisplayName("should output Bestellung 2")
    void testGetOrder() {

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

        String actual = shop.getOrder(2);

        assertEquals("Bestellung 2", actual);

    }

    @Test
    @DisplayName("should output Bestellung 1, Bestellung 2, ")
    void testListOrders() {

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

        String actual = shop.listOrders();

        assertEquals("Bestellung 1, Bestellung 2, ", actual);

    }

    @Test
    @DisplayName("should output Bestellung 1, Bestellung 2, Bestellung 3, ")
    void testAddOrder() {

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

        shop.add(3, "Bestellung 3", artikelIdsToAdd);

        String actual = shop.listOrders();

        assertEquals("Bestellung 1, Bestellung 2, Bestellung 3, ", actual);

    }

    @Test
    @DisplayName("should throw RuntimeException")
    void testRuntimeException() {

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
        artikelIdsToAdd.add(6);

        Order order = new Order(1, "Bestellung 1", artikelIdsToAdd);
        Order order1 = new Order(2, "Bestellung 2", artikelIdsToAdd);

        Map<Integer, Order> mapOfOrders = new HashMap<>();
        mapOfOrders.put(1, order);
        mapOfOrders.put(2, order1);

        ProductRepo productDatabase = new ProductRepo(mapOfProducts);
        OrderRepo orderDatabase = new OrderRepo(mapOfOrders);

        ShopService shop = new ShopService(productDatabase, orderDatabase);

        assertThrows(
                RuntimeException.class,
                () -> {
                    shop.add(3, "Bestellung 3", artikelIdsToAdd);
                }
        );

    }

}