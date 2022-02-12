package de.stedo.shopService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class OrderRepo {

    private Map<Integer, Order> orderList = new HashMap<>();

    public OrderRepo(Map<Integer, Order> orderList) {
        this.orderList = orderList;
    }

    public Order getOrder(int index) {
        return orderList.get(index);
    }

    public Map<Integer, Order> getOrderList() {
        return orderList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderRepo orderRepo = (OrderRepo) o;
        return Objects.equals(orderList, orderRepo.orderList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderList);
    }
}
