package com.cydeo.tasks;

import java.util.Arrays;
import java.util.stream.Stream;

public class EmployeeData {

    public static Stream<Employee> readAll(){
        return Stream.of(
                new Employee(100, "Mike", "mike@cydeo.com", Arrays.asList("2023434235","76343227875")),
                new Employee(100, "Luka", "luka@cydeo.com", Arrays.asList("5673434235","6534232365")),
                new Employee(100, "Aaron", "aaron@cydeo.com", Arrays.asList("9873432235","3434245345"))
        );
    }

}
