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

        Map<Integer, String> mapOfProducts = new HashMap<>();

        mapOfProducts.put(hemd.getProductId(), hemd.getProductName());
        mapOfProducts.put(hose.getProductId(), hose.getProductName());
        mapOfProducts.put(bluse.getProductId(), bluse.getProductName());
        mapOfProducts.put(rock.getProductId(), rock.getProductName());

        ProductRepo products = new ProductRepo(mapOfProducts);

        String actual = products.getProductFromList(1);

        assertEquals("Hemd", actual);

    }

    @Test
    @DisplayName("should be Hemd, Hose, Bluse, Rock, ")
    void test2() {

        Product hemd = new Product(1, "Hemd");
        Product hose = new Product(2, "Hose");
        Product bluse = new Product(3, "Bluse");
        Product rock = new Product(4, "Rock");

        Map<Integer, String> mapOfProducts = new HashMap<>();

        mapOfProducts.put(hemd.getProductId(), hemd.getProductName());
        mapOfProducts.put(hose.getProductId(), hose.getProductName());
        mapOfProducts.put(bluse.getProductId(), bluse.getProductName());
        mapOfProducts.put(rock.getProductId(), rock.getProductName());

        ProductRepo products = new ProductRepo(mapOfProducts);

        String actual = products.getProductList();

        assertEquals("Hemd, Hose, Bluse, Rock, ", actual);

    }

    @Test
    @DisplayName("should be Hemd")
    void test3() {

        Product hemd = new Product(1, "Hemd");
        Product hose = new Product(2, "Hose");
        Product bluse = new Product(3, "Bluse");
        Product rock = new Product(4, "Rock");

        Map<Integer, String> mapOfProducts = new HashMap<>();

        mapOfProducts.put(hemd.getProductId(), hemd.getProductName());
        mapOfProducts.put(hose.getProductId(), hose.getProductName());
        mapOfProducts.put(bluse.getProductId(), bluse.getProductName());
        mapOfProducts.put(rock.getProductId(), rock.getProductName());

        ProductRepo databaseProducts = new ProductRepo(mapOfProducts);

        ShopService shop = new ShopService(databaseProducts);

        String actual = shop.getProduct(1);

        assertEquals("Hemd", actual);

    }

    @Test
    @DisplayName("should be Hemd, Hose, Bluse, Rock, ")
    void test4() {

        Product hemd = new Product(1, "Hemd");
        Product hose = new Product(2, "Hose");
        Product bluse = new Product(3, "Bluse");
        Product rock = new Product(4, "Rock");

        Map<Integer, String> mapOfProducts = new HashMap<>();

        mapOfProducts.put(hemd.getProductId(), hemd.getProductName());
        mapOfProducts.put(hose.getProductId(), hose.getProductName());
        mapOfProducts.put(bluse.getProductId(), bluse.getProductName());
        mapOfProducts.put(rock.getProductId(), rock.getProductName());

        ProductRepo databaseProducts = new ProductRepo(mapOfProducts);

        ShopService shop = new ShopService(databaseProducts);

        String actual = shop.getProductList();

        assertEquals("Hemd, Hose, Bluse, Rock, ", actual);

    }

    @Test
    @DisplayName("order")
    void orderTest1() {

        Product hemd = new Product(1, "Hemd");
        Product hose = new Product(2, "Hose");
        Product bluse = new Product(3, "Bluse");
        Product rock = new Product(4, "Rock");

        List<Integer> artikel = new LinkedList<>();
        artikel.add(1);
        artikel.add(2);

        Order order = new Order(1, "Bestellung 1", artikel);

        Map<Integer, Order> mapOfOrders = new HashMap<>();
        mapOfOrders.put(1, order);

        OrderRepo orderDatabase = new OrderRepo(mapOfOrders);

        String actual = orderDatabase.getOrder(1).getOrderName();

        assertEquals("Bestellung 1", actual);

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

        System.out.println(shop.getOrder(1));
        System.out.println(shop.listOrders());

        OrderRepo actual = orderDatabase;

        assertEquals(orderDatabase, actual);

    }

}