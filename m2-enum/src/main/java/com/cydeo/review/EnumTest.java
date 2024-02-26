package com.cydeo.review;

import javax.management.relation.Role;
import java.util.Arrays;

public class EnumTest {
    public static void main(String[] args) {

        User employeeUser = new User("mikesmith","Mike","Smith",RoleEnum.EMPLOYEE);

        System.out.println(employeeUser.getRole());

        System.out.println(RoleEnum.valueOf("ADMIN"));
        System.out.println(Arrays.toString(RoleEnum.values()));

    }
}
