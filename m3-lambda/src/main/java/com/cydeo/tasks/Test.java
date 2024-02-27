package com.cydeo.tasks;

import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        List<User> users = Arrays.asList(new User("mike01",29,Gender.MALE,Status.MEMBER),
                                         new User("lucy02",19,Gender.FEMALE,Status.SUPPORT),
                                         new User("luka03",21,Gender.MALE,Status.MEMBER),
                                         new User("dato04",24,Gender.MALE,Status.MEMBER));

        AdminPredicate filterUsers = user -> user.getGender().equals(Gender.MALE) && user.getAge() >= 18 && user.getAge() <= 25;

        adminMessage(users, "Some message here", filterUsers);


    }

    private static void adminMessage(List<User> users, String message, AdminPredicate p){ // behavior parametrization
        for (User user : users) {
            if (p.test(user)){
                System.out.println(user.getUsername() + " " + message);
            }
        }
    }

}
