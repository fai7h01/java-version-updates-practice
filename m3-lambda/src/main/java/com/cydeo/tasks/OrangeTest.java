package com.cydeo.tasks;

import com.cydeo.Color;

import java.util.Arrays;
import java.util.List;

public class OrangeTest {
    public static void main(String[] args) {

        List<Orange> inventory = Arrays.asList(new Orange(200, Color.RED),
                new Orange(50, Color.ORANGE),
                new Orange(300, Color.RED),
                new Orange(100, Color.ORANGE));

        OrangeFormatter orangeLambda = orange -> "An orange of " + orange.getWeight() + "g";
        prettyPrintOrange(inventory, orangeLambda);


    }

    private static void prettyPrintOrange(List<Orange> inventory, OrangeFormatter f){
        for (Orange orange : inventory) {
            String output = f.test(orange);
            System.out.println(output);
        }
    }

}
