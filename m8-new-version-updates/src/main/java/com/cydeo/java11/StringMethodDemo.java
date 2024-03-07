package com.cydeo.java11;

public class StringMethodDemo {
    public static void main(String[] args) {

        var str = "Mike \n Ozzy \n Tom \n Luka";

        str.lines().forEach(System.out::println);

        var str2 = "bird";
        System.out.println(str2.repeat(3));

        System.out.println(str2.isBlank());

    }
}
