package com.cydeo.tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class UserTest {
    public static void main(String[] args) {

        List<User2> users = new ArrayList<>();
        users.add(new User2("Mike", "Tyson", 45));
        users.add(new User2("Taylor", "Smith", 25));
        users.add(new User2("Nick", "Watson", 35));

        //Print all elements in the list
        printName(users, user -> true);
        //Print all people that last name starts with N
        printName(users,user -> user.getLastName().startsWith("E"));
    }

    private static void printName(List<User2> users, Predicate<User2> p){

        for (User2 user : users) {
            if (p.test(user)){
                System.out.println(user);
            }
        }

    }

}
