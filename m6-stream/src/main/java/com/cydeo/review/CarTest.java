package com.cydeo.review;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class CarTest {
    public static void main(String[] args) {

        List<Car> carList = new ArrayList<>();
        carList.add(new Car("Toyota",140,1998));
        carList.add(new Car("Audi",200,2008));
        carList.add(new Car("BMW",210,2020));
        carList.add(new Car("Nissan",150,2018));

        System.out.println("********Traditional**Way********");
        System.out.println("Fast Cars:");
        System.out.println(filterFastCars(carList));

        System.out.println("New Cars:");
        System.out.println(filterNewCars(carList));

        //---------------------------------------------------------------------------------------

        System.out.println("********Behavior**Parameterization********");
        System.out.println("Fast Cars:");
        System.out.println(filter(carList, new CarFastPredicate()));

        System.out.println("New Cars:");
        System.out.println(filter(carList, new CarNewPredicate()));

        //---------------------------------------------------------------------------------------

        System.out.println("********Lambda********");
        System.out.println("Fast Cars:");
        System.out.println(filter(carList, car -> car.getTopSpeed() > 160));

        System.out.println("New Cars:");
        System.out.println(filter(carList, car -> car.getYear() > 2015));




    }


    private static List<Car> filterFastCars(List<Car> carList){
        List<Car> filteredCars = new ArrayList<>();

        for (Car each : carList) {
            if (each.getTopSpeed() > 160){
                filteredCars.add(each);
            }
        }
        return filteredCars;
    }

    private static List<Car> filterNewCars(List<Car> carList){
        List<Car> filteredCars = new ArrayList<>();

        for (Car each : carList) {
            if (each.getYear() > 2015){
                filteredCars.add(each);
            }
        }
        return filteredCars;
    }

    private static List<Car> filter(List<Car> carList, CarPredicate carPredicate){
        List<Car> filteredCars = new ArrayList<>();

        for (Car each : carList) {
            if (carPredicate.test(each)){
                filteredCars.add(each);
            }
        }
        return filteredCars;


    }

}
