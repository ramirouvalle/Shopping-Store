package com.uvrcode.beans;

import java.math.BigDecimal;

/**
 *
 * @author ramir
 */
public class ShoppingCartLine {
    private Product product;
    private int quantity;
    private BigDecimal amount;

    public ShoppingCartLine(Product product) {
        this.product = product;
        this.quantity = 1;
        this.amount = product.getPrice();
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void addProduct(){
        quantity ++;
        amount = amount.add(product.getPrice());
    }
    
    
}
