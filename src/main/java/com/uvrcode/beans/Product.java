package com.uvrcode.beans;

import java.io.Serializable;
import java.math.BigDecimal;

public class Product implements Serializable{
    private final long id;
    private final String name;
    private final String description;
    private final BigDecimal price;
    private final String imageName;

    /**
     * @param id
     * @param name
     * @param description
     * @param price
     * @param imageName 
     */
    public Product(long id, String name, String description, BigDecimal price, String imageName) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.imageName = imageName;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public String getImageName() {
        return imageName;
    }
    
}
