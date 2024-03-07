package com.cydeo.java10;

import java.util.Arrays;
import java.util.List;

public class CopyOfDemo {
    public static void main(String[] args) {

        List<Integer> numberList = Arrays.asList(2,3,4,5);

        List<Integer> unmodifiableList1 = List.of(2,4,5,6);
        List<Integer> unmodifiableList2 = List.copyOf(numberList);



    }
}
