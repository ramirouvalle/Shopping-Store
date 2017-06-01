package com.uvrcode;

import com.uvrcode.beans.Product;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.enterprise.context.ApplicationScoped;

/**
 *
 * @author Ramiro Uvalle
 */
@ApplicationScoped
public class ProductServiceImpl implements ProductService{
    private final Map<Long, Product> products;
    private final List<Product> popularProducts;

    public ProductServiceImpl() {
        Map<Long, Product> map = new HashMap<>();
        map.put(1L, new Product(1L, "Microphone", "Essential for every vocalist.", BigDecimal.valueOf(95.00), "microphone.jpg"));
        map.put(2L, new Product(2L, "Guitar", "The guitar sounds great and looks cool.", BigDecimal.valueOf(155.00), "guitar.jpg"));
        map.put(3L, new Product(3L, "Bass Guitar", "Every bands need a solid bass guitar.", BigDecimal.valueOf(200.00), "bass-guitar.jpg"));        
        products = Collections.unmodifiableMap(map);
        popularProducts = Collections.unmodifiableList(new ArrayList<>(products.values()));
    }
    
    
    @Override
    public List<Product> getPopularProducts() {
        return popularProducts;
    }

    @Override
    public Product getProduct(long id) {
        return products.get(id);
    }

}
