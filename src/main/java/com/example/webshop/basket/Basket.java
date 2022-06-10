package com.example.webshop.basket;

import com.example.webshop.product.Product;

import java.util.HashSet;
import java.util.Map;

public class Basket {

    private HashSet<Product> products;
    private Map<Product, Integer> qty;
    private Map<Product, Double> discount;

    public Basket(HashSet<Product> products, Map<Product, Integer> qty, Map<Product, Double> discount) {
        this.products = products;
        this.qty = qty;
        this.discount = discount;
    }

    public HashSet<Product> getProducts() {
        return products;
    }

    public void setProducts(HashSet<Product> products) {
        this.products = products;
    }

    public Map<Product, Integer> getQty() {
        return qty;
    }

    public void setQty(Map<Product, Integer> qty) {
        this.qty = qty;
    }

    public Map<Product, Double> getDiscount() {
        return discount;
    }

    public void setDiscount(Map<Product, Double> discount) {
        this.discount = discount;
    }
}
