package com.aneesh.webApp.controller;

import com.aneesh.webApp.model.Product;
import com.aneesh.webApp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    private ProductService productService;

    @RequestMapping("/products")
    public List<Product> getProduct(){
        return productService.getProducts();
    }
}
