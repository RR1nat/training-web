package com.example.demo.model.training;

import com.example.demo.model.training.enums.LevelEnum;
import com.example.demo.model.training.enums.TypeEnum;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Training {

    private int id;
    private String name;
    private String description;
    private LevelEnum level;
    private String time;
    private TypeEnum type;
}
