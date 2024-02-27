package com.cydeo.tasks;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class User {
    private String username;
    private int age;
    private Gender gender;
    private Status status;
}
