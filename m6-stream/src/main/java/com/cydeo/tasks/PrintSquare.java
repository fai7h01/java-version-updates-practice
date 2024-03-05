package com.cydeo.tasks;

import java.util.Arrays;
import java.util.List;

public class PrintSquare {
    public static void main(String[] args) {

        //Print square of each number
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        list.stream()
                .map(num -> Math.pow(num, 2))
                .forEach(System.out::println);

        //Print pairs
        List<Integer> nums1 = Arrays.asList(1,2,3);
        List<Integer> nums2 = Arrays.asList(3,4);

        nums1.stream()
                .flatMap(i -> nums2.stream().map(j -> new int[]{i,j}))
                .forEach(pairs -> System.out.println(Arrays.toString(pairs)));


    }
}
