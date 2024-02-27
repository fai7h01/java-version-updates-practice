package com.cydeo.tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MemberTest {
    public static void main(String[] args) {

        List<Person> list = Arrays.asList(new Person("luka", 23, Gender.MALE),
                new Person("aaron", 35, Gender.MALE),
                new Person("duke", 17, Gender.MALE),
                new Person("mathilda", 21, Gender.FEMALE));

        CheckMember checkMale = person -> person.getGender().equals(Gender.MALE) && person.getAge() >= 18 && person.getAge() <= 25;
        print(list, checkMale);

        print(list, person -> person.getGender().equals(Gender.FEMALE));

    }

    private static void print(List<Person> list, CheckMember check){
        List<Person> result = new ArrayList<>();
        for (Person person : list) {
            if (check.test(person)){
                result.add(person);
            }
        }
        System.out.println(result);
    }

}
