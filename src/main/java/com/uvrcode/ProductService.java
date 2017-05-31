package com.uvrcode;

import com.uvrcode.beans.Product;
import java.util.List;

public interface ProductService {
    List<Product> getPopularProducts();
    Product getProduct(long id);
}
