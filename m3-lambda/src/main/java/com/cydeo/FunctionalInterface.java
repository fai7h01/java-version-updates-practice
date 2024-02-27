package com.cydeo;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionalInterface {
    public static void main(String[] args) {

        ApplePredicate ap = new ApplePredicate() { // anonymous class
            @Override
            public boolean test(Apple apple) {
                return apple.getWeight() > 200;
            }
        };

        System.out.println("//************PREDICATE************//");
        Predicate<Integer> lessThan = i -> i < 18;
        System.out.println(lessThan.test(20));

        System.out.println("//************CONSUMER************//");
        Consumer<Integer> display = i -> System.out.println(i * i);
        display.accept(10);

        System.out.println("//************BI CONSUMER************//");
        BiConsumer<Integer, Integer> sum = (x, y) -> System.out.println(x+y);
        sum.accept(10, 15);

        System.out.println("//************FUNCTION************//");
        Function<String, String> fun = s -> "Hello " + s;
        System.out.println(fun.apply("Lambda"));


    }
}
