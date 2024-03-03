package com.cydeo.review;

import lombok.*;

@AllArgsConstructor(access = AccessLevel.PROTECTED)
////@NoArgsConstructor
//@RequiredArgsConstructor
//@ToString(exclude = "topSpeed")
//@Getter
//@Setter
@Data
@Builder
public class Car {

    //  @Getter(AccessLevel.NONE)
    private String make;
    private int topSpeed;
    //private final int year;
    private final int year;
    //private final int year;

    public String getMake() throws Exception {
        if (make.equals("Toyota")){
            return make;
        }
        throw new Exception("Not a toyota");
    }

}

//    int f(int x) {
//        return x + 5;
//    }
//
//    int g(int x) {
//        return x + 10;
//    }
//          x + 10 + 5
//  f(x) = x + 5                f(g(x)) = g(x) + 5 = x + 10 + 5 = x + 15
//    3  = 3 + 5 = 8            f(k(x)) = k(x) + 5 = x + 1 + 5  = x + 6
//    12 = 12 + 5 = 17

// f(g(3)) = g(3) + 5
//  f(13)   = 13   + 5 = 18 = f(g(3))


//  g(x) = x + 10
//    3  = 3 + 10 = 13
//    12 = 12 + 10 = 22

//   k(x) = x + 1







