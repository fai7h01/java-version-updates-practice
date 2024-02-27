package com.cydeo.tasks;

@FunctionalInterface
public interface AdminPredicate {
    boolean test(User user);
}
