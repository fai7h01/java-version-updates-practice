package com.cydeo;

import com.cydeo.tasks.Dish;
import com.cydeo.tasks.DishData;

public class FindingMatching {
    public static void main(String[] args) {

        System.out.println("ALL MATCH");
        boolean isHealthy = DishData.getAll().stream().allMatch(dish -> dish.getCalories() < 1000);
        System.out.println(isHealthy);

        System.out.println("ANY MATCH");
        if (DishData.getAll().stream().anyMatch(Dish::isVegetarian)){
            System.out.println("The menu is vegetarian friendly");
        }

    }

}
