package com.cydeo.tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StateData {

    public static Stream<State> getAll() {
        
        State texas = new State("Texas");
        texas.addCity("Dallas");
        texas.addCity("Houston");
        texas.addCity("Austin");
        texas.addCity("San antonio");
        State ohio = new State("Ohio");
        ohio.addCity("Cleveland");
        ohio.addCity("Cincinnati");
        ohio.addCity("Columbus");

        return new ArrayList<>(Arrays.asList(texas,ohio)).stream();

    }
}
