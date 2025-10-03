package com.dry.service;

public class ProductService {
    public double getDiscountedPrice(double price) {
        return price - price * 0.1;
    }
}