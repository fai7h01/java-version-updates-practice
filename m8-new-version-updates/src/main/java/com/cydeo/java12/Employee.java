package com.cydeo.java12;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class Employee {
    private int id;
    private String name;
    private int salary;
}
