package com.aneesh.webApp.service;

import com.aneesh.webApp.model.Product;
import com.aneesh.webApp.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
    public class ProductService{
//    List<Product> products =  new ArrayList<>(Arrays.asList(new Product(1, "Apple", "100000"),
//            new Product(2, "Samsung", "98000"),
//            new Product(3,"Real me","75000")));

    @Autowired
    ProductRepo productRepo;
    public List<Product> getProducts() {

        return productRepo.findAll();
    }

    public Product getProductById(int id){
        return productRepo.findById(id).get();
    }

    public void addProduct(Product product){
        productRepo.save(product);
    }

    public void updateProduct(Product product){
        productRepo.save(product);
    }

    public void deleteProduct(int id){
        productRepo.deleteById(id);
    }
}
