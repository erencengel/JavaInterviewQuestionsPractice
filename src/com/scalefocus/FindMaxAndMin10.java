package com.scalefocus;

import java.util.Arrays;

public class FindMaxAndMin10 {

    public static void main(String[] args) {
        System.out.println(findMin(new Integer[]{1,5,10,-20}));
        System.out.println(findMax(new Integer[]{1,5,10,-20}));
    }

    public static Integer findMin(Integer[] arr){
        int min = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < min) min = arr[i];
        }
        return min;
    }

    public static Integer findMax(Integer[] arr){
        int max = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max) max = arr[i];
        }
        return max;
    }

    //let's update the code
    //update again
    //one more update

}
