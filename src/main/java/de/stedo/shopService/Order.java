package de.stedo.shopService;

import java.util.List;

public class Order {

    private String order;
    private int orderId;
    private List<Integer> artikelId;

    public Order(int orderId, String order, List<Integer> artikelId) {
        this.order = order;
        this.orderId = orderId;
        this.artikelId = artikelId;
    }

    public void setArtikelId(List<Integer> artikelId) {
        this.artikelId = artikelId;
    }

    public String getOrderName() {
        return order;
    }
}
