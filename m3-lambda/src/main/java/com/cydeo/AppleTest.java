package com.cydeo;

import com.cydeo.tasks.ApplePredicate2;

import java.util.ArrayList;
import java.util.List;

public class AppleTest {
    public static void main(String[] args) {

        List<Apple> inventory = new ArrayList<>();
        inventory.add(new Apple(300, Color.GREEN));
        inventory.add(new Apple(100, Color.RED));
        inventory.add(new Apple(200, Color.GREEN));
        inventory.add(new Apple(50, Color.RED));

        List<Apple> greenApple = filterApples(inventory, new AppleGreenColorPredicate());
        List<Apple> heavyApple = filterApples(inventory, new AppleHeavyPredicate());
        System.out.println(greenApple);
        System.out.println(heavyApple);

        ApplePredicate weightApple = apple -> apple.getWeight() > 200; // Lambda expression

        filterApples(inventory, weightApple);

        System.out.println("-----------------------------------------");

        ApplePredicate2 appleColorWeight = apple -> apple.getWeight() > 200 ? "A heavy " + apple.getColor() + " apple" : "A light " + apple.getColor() + " apple";
        ApplePredicate2 appleWeight = apple -> "An apple of " + apple.getWeight() + "g";


        prettyPrintApple(inventory, appleColorWeight);
        prettyPrintApple(inventory, appleWeight);


    }

    private static void prettyPrintApple(List<Apple> inventory, ApplePredicate2 p) {
        for (Apple apple : inventory) {
            String output = p.test(apple);
            System.out.println(output);
        }
    }

    private static List<Apple> filterApples(List<Apple> inventory, ApplePredicate p) { // behavior parametrization
        List<Apple> result = new ArrayList<>();

        for (Apple apple : inventory) {
            if (p.test(apple)) {
                result.add(apple);
            }
        }
        return result;


    }

}
