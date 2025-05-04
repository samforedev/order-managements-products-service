package com.metacho.ordermanagementsproductsservice.core.service.product;

import com.metacho.ordermanagementsproductsservice.core.domain.product.Product;

import java.util.List;
import java.util.UUID;

public interface IProductService {
    UUID addProduct(Product product);
    UUID updateProduct(Product product);
    UUID deleteProduct(UUID productId);
    Product getProduct(UUID productId);
    List<Product> getAllProducts();
}
