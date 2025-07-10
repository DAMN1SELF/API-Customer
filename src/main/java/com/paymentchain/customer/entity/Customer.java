package com.paymentchain.customer.entity;


import jakarta.persistence.Entity;

@Entity()
public class Customer {
    private long id;
    private int yearsold;
    private String name;
    private String email;
    private boolean active;
}
