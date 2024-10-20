package com.example.demo.service;

import com.example.demo.model.Product;
import com.example.demo.model.Ration;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

@Service
public class ProductService{
    private long ID = 0;
    public List<Product> products = new ArrayList<>();
    {
        saveProduct(new Product(++ID,"Лепешка",10, 12, 12, 12, "dfd"));
    }

    public void saveProduct(Product product){
        products.add(product);
    }


}
