package com.example.webshop.product;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    public List<Product> getProducts() {
        return List.of(
                new Product(
                        "something",
                        11.0,
                        "some product"
                )
        );
    }
}
