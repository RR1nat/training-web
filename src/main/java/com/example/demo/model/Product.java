package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Product {
    private int id;
    private String name;
    private int proteins;
    private int fats;
    private int carbohydrates;
    private int calories;
    private String description;

}
