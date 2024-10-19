package com.example.demo.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private int id;
    private String email;
    private String password;
    private String firstName;
    private String lastName;
    private String age;
    private String gender;
    private int weight;
    private int height;


}
