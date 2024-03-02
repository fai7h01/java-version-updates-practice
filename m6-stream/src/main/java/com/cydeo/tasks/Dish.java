package com.cydeo.tasks;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Dish {
    private String name;
    private boolean vegetarian;
    private int calories;
    private Type type;
}
