package com.cydeo.tasks;

public class PrimePredicate implements UnaryPredicate<Integer>{

    @Override
    public boolean test(Integer obj) {
        if (obj <= 1){
            return false;
        }
        for (int i = 2; i <= Math.sqrt(obj); i++) {
            if (obj % i == 0){
                return false;
            }
        }
        return true;
    }
}
