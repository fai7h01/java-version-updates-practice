package com.cydeo;

import com.cydeo.tasks.Dish;
import com.cydeo.tasks.DishData;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Reducing {
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(4,5,3,9);

        int sum = nums.stream().reduce(0,(a,b) -> a + b);
        Optional<Integer> result = nums.stream().reduce((a,b) -> a + b); //Integer::sum
        System.out.println(sum);

        //Total calories in dish menu
        int total = DishData.getAll().stream()
                .map(Dish::getCalories)
        //        .reduce((a,b) -> a + b);
                .reduce(0,Integer::sum);
        System.out.println(total);
        
        //Max and min
        Optional<Integer> min = nums.stream().reduce(Integer::min);
        Optional<Integer> max = nums.stream().reduce(Integer::max);
        Optional<Integer> sum2 = nums.stream().reduce(Integer::sum);

        System.out.println("min = " + min.get());
        System.out.println("max = " + max.get());
        System.out.println("sum = " + sum2.get());

        System.out.println("COUNT");
        long dishCount = DishData.getAll().stream().count();
        System.out.println(dishCount);
    }
}
