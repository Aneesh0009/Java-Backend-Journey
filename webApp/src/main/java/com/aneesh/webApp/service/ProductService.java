package com.aneesh.webApp.service;

import com.aneesh.webApp.model.Product;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
    public class ProductService{
    List<Product> products = Arrays.asList(new Product(1, "Apple", "100000"),
            new Product(2, "Samsung", "98000"),
            new Product(3,"Real me","75000"));

    public List<Product> getProducts() {
        return products;
    }
}
