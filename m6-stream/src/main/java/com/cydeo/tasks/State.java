package com.cydeo.tasks;

import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Getter
@NoArgsConstructor
public class State {

    private String name;
    private List<String> cities = new ArrayList<>();

    public State(String name){
        this.name = name;
    }

    public void addCity(String city){
        cities.add(city);
    }

}
