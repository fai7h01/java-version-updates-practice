package com.cydeo.tasks;

import java.util.List;

public class StateTest {
    public static void main(String[] args) {

        //Print all the cities
        StateData.getAll()
                .map(State::getCities)
                .flatMap(List::stream)
                .forEach(System.out::println);

    }
}
