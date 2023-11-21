package com.scalefocus;

public class PerfectSquare_16 {

    /**
     * -Amazon Interview Question-
     * How to find if a number is a perfect square , and he gave an example of 25 and 36,
     * he said that these two numbers are perfect squares, but the problem is how to find if they are perfect squares
     * {1, 4, 9, 25, 36, 49, 64, 81, 100, 121, 144...}
     */

    public static void main(String[] args) {
        System.out.println("isPerfectSquare(0) = " + isPerfectSquare(0));
        System.out.println("isPerfectSquare(1) = " + isPerfectSquare(1));
        System.out.println("isPerfectSquare(2) = " + isPerfectSquare(2));
        System.out.println("isPerfectSquare(4) = " + isPerfectSquare(4));
        System.out.println("isPerfectSquare(25) = " + isPerfectSquare(25));
        System.out.println("isPerfectSquare(97) = " + isPerfectSquare(97));
        System.out.println("isPerfectSquare(100) = " + isPerfectSquare(100));
    }

    static boolean isPerfectSquare(int number){
        for(int i = 0; i <= number ; i++){
            if(number == (i*i)) return true;
        }
        return false;
    }
}
