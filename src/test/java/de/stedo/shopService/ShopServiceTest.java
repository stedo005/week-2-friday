package de.stedo.shopService;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
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

}