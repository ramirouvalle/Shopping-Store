package com.uvrcode.beans;

import com.uvrcode.ProductService;
import java.io.Serializable;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author Ramiro Uvalle
 */
@Named
@ViewScoped
public class ProductDetails implements Serializable{
    @Inject
    private ProductService productService;
    private long productId;
    private Product product;

    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    public Product getProduct() {
        return product;
    }

    public void onload(){
        product = productService.getProduct(productId);
    }
    
}
