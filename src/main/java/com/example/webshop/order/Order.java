package com.example.webshop.order;

import com.example.webshop.product.Product;
import java.util.List;
import java.util.Map;

public class Order {

    private int id;
    private List<Product> products;
    private Map<Product, Integer> quantity;
    private Map<Product, Double> discount;

    public Order(int id, List<Product> products, Map<Product, Integer> quantity, Map<Product, Double> discount) {
        this.id = id;
        this.products = products;
        this.quantity = quantity;
        this.discount = discount;
    }

    public int getQuantity (Product product) {
        return quantity.get(product);
    }

    public double getDiscount (Product product) {
        return discount.get(product);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
