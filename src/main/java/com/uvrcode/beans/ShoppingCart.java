package com.uvrcode.beans;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

/**
 *
 * @author ramir
 */
@Named
@SessionScoped
public class ShoppingCart implements Serializable {

    private final List<ShoppingCartLine> lines = new ArrayList<>();
    private int totalQuantity = 0;
    private BigDecimal totalAmount = BigDecimal.ZERO;

    public List<ShoppingCartLine> getLines() {
        return lines;
    }

    public int getTotalQuantity() {
        return totalQuantity;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void addProduct(Product product) {
        ShoppingCartLine line = new ShoppingCartLine(product);
        lines.add(line);
        totalQuantity++;
        totalAmount = totalAmount.add(product.getPrice());
    }

    public void removeProduct(Product product) {
        
    }
}
