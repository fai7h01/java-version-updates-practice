package com.cydeo;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> items = new ArrayList<>(); // ArrayList accepts only objects belongs to Integer

        items.add(1);
        items.add(2);
        items.add(3);
        items.add(4);
        //items.add("Apple");

        printDoubled(items);

        System.out.println("----------------------------------");

        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer leo = new SoccerPlayer("Leo");

        Team liverpool = new Team("Liverpool"); // Team accepting any object
        liverpool.addPlayer(joe);
        liverpool.addPlayer(pat);
        liverpool.addPlayer(leo);






    }

    private static void printDoubled(ArrayList<Integer> items){
        for (Integer item : items) {
            System.out.println(item * 2);
        }
    }
}