package com.aneesh.webApp.controller;

import com.aneesh.webApp.model.Product;
import com.aneesh.webApp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    public List<Product> getProduct(){
        return productService.getProducts();
    }

    @GetMapping("/products/{id}")
    public Product getProductById(@PathVariable int id){
        return productService.getProductById(id);
    }

    @PostMapping("/products")
    public void addProduct(@RequestBody Product product){
        //System.out.println(product);
        productService.addProduct(product);
    }

    @PutMapping("/products")
    public void updateProduct(@RequestBody Product product){
        productService.updateProduct(product);
    }

    @DeleteMapping("/products/{id}")
    public void deleteProduct(@PathVariable int id){
        productService.deleteProduct(id);
    }
}
