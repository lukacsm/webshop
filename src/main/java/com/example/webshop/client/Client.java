package com.example.webshop.client;

import com.example.webshop.order.Order;

public class Client {

    private int id;
    private String firstName;
    private String lastName;
    private String username;
    private String email;
    private String password;
    private Order[] orderHistory;

    public Client(int id, String firstName, String lastName, String username, String email, String password, Order[] orderHistory) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.email = email;
        this.password = password;
        this.orderHistory = orderHistory;
    }
}
