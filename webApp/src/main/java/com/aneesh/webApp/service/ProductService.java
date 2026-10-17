package com.aneesh.webApp.service;

import com.aneesh.webApp.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
    public class ProductService{
    List<Product> products =  new ArrayList<>(Arrays.asList(new Product(1, "Apple", "100000"),
            new Product(2, "Samsung", "98000"),
            new Product(3,"Real me","75000")));

    public List<Product> getProducts() {
        return products;
    }

    public Product getProductById(int id){
        return products.stream().filter(product -> product.getID() == id).findFirst().orElse(new  Product(id, "No Item", "0"));
    }

    public void addProduct(Product product){
        products.add(product);
    }

    public void updateProduct(Product product){
//        int idx = 0;
//        for(Product p : products){
//            if(p.getID() == product.getID()){
//                idx = p.getID();
//            }
//        }
//        products.set(idx,product);
        products.set(product.getID()-1, product);
    }

    public void deleteProduct(int id){
        products.removeIf(product -> product.getID() == id);
    }
}
