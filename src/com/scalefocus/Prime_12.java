package com.scalefocus;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Prime_12 {

    public static void main(String[] args) {
        /**
         * Create a method that can check if a number is prime or not
         * input:2
         * output:true
         * input:1
         * output:false
         * input:8
         * output:false
         */

        System.out.println("ifPrime(2) = " + ifPrime(2));
        System.out.println("ifPrime(1) = " + ifPrime(1));
        System.out.println("ifPrime(8) = " + ifPrime(8));
        System.out.println("ifPrime(21) = " + ifPrime(21));
        System.out.println("ifPrime(22) = " + ifPrime(22));
        System.out.println("ifPrime(11) = " + ifPrime(11));
        System.out.println("ifPrime(3553) = " + ifPrime(3553));
        System.out.println("ifPrime(77) = " + ifPrime(77));
        System.out.println("ifPrime(121) = " + ifPrime(121));
        System.out.println("ifPrime(4501) = " + ifPrime(4501));
        System.out.println("ifPrime(10001) = " + ifPrime(10001));
        System.out.println("ifPrime(10000) = " + ifPrime(10000));
    }

    static boolean ifPrime(int number) {
        if (number < 2) {
            return false;
        } else if (number == 2) {
            return true;
        }
        boolean bool = true;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) return false;
        }
        return bool;
    }
}
