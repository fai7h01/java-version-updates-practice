package com.cydeo.java10;

import java.util.ArrayList;
import java.util.Arrays;

public class LocalVariableTypeDemo {
    public static void main(String[] args) {

        String s;
        s = "Luka";

        //Type inference
        var str = "Java";
        var number = 5;

        byte x = 1;
        var y = 1; // int

        var price = 12.50; // double

        var numbers = Arrays.asList(3,4,5,6);

        var sum = 0;
        for (var eachNumber : numbers) {
            sum += eachNumber;
        }

    }
}
