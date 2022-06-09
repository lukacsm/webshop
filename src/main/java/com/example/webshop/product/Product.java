package com.example.webshop.product;

public class Product {

    private int it;
    private String name;
    private Double price;
    private String desc;

    public Product(int it, String name, Double price, String desc) {
        this.it = it;
        this.name = name;
        this.price = price;
        this.desc = desc;
    }

    public Product(String name, Double price, String desc) {
        this.name = name;
        this.price = price;
        this.desc = desc;
    }

    public int getIt() {
        return it;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public String getDesc() {
        return desc;
    }

    public void setIt(int it) {
        this.it = it;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String   toString() {
        return "Product{" +
                "it=" + it +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", desc='" + desc + '\'' +
                '}';
    }
}
