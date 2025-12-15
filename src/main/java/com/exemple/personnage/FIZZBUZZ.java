package com.exemple.personnage;

public class FIZZBUZZ {


        public static String de(int n) {
            if (n % 3 == 0 && n % 5 == 0) {
                return "FizzBuzz";
            } else if (n % 3 == 0) {
                return "Fizz";
            } else if (n % 5 == 0) {
                return "Buzz";
            } else {
                return String.valueOf(n);
            }



    }

}
