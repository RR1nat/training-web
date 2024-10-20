package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    private long id;
    private String name;
    private int proteins;
    private int fats;
    private int carbohydrates;
    private int calories;
    private String description;

/*    public Product(long id, String name, int proteins, int fats, int carbohydrates, int calories, String description) {
        this.id = id;
        this.name = name;
        this.proteins = proteins;
        this.fats = fats;
        this.carbohydrates = carbohydrates;
        this.calories = calories;
        this.description = description;
    }*/
}
