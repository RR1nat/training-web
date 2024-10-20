package com.example.demo.model;

import lombok.*;

import java.util.Set;

@Data
@AllArgsConstructor
public class Ration {
    private int id;
    private String title;
    private String description;
    private Set<Product> products;


}
