package com.cydeo.review;

public enum RoleEnum {

    ADMIN("Admin"), MANAGER("Manager"), EMPLOYEE("Employee");

    public String value;

    RoleEnum(String value){
        this.value = value;
    }

}
