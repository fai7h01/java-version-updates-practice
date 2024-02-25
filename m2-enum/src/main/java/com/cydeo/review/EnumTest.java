package com.cydeo.review;

public class EnumTest {
    public static void main(String[] args) {

        User employeeUser = new User("mikesmith","Mike","Smith",RoleEnum.EMPLOYEE);

        System.out.println(employeeUser.getRole().value);


    }
}
