package com.uvrcode.beans;

import java.math.BigDecimal;

public class Product {
    private final long id;
    private final String name;
    private final String description;
    private final BigDecimal price;
    private final String imageName;

    public Product(long id, String name, String description, BigDecimal price, String imageName) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.imageName = imageName;
    }
    
    
}
