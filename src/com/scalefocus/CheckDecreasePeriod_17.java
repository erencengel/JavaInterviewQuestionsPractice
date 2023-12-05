package com.scalefocus;

import java.util.Arrays;

public class CheckDecreasePeriod_17 {

    /**
     * -Amazon Interview Question-
     *
     * There is a new product launched and its customer ratings are being recorded in an array. The ratings are being monitored and analyzed if there is any decrease in the ratings.
     * Find the number of periods in which the rating is consecutively decreasing.
     * Example - Ratings = [4,3,5,4,3]
     * Periods (in other words sub arrays in which ratings are decreasing):
     * One day periods = [4],[3],[5],[4],[3] (count of subarrays is 5)
     * Two day periods = [4,3],[5,4],[4,3] (count of subarrays is 3)
     * 3 day periods = [5,4,3] (count of subarrays is 1)
     * So, the output for this example will be 9 (5 + 3 + 1)
     */

    public static void main(String[] args) {
        int[] arr = new int[] {4,3,5,4,3};
        int[] arr2 = new int[] {4,2,1,0,3,8,9,0,10};

    }
    //ADAM
    private static int countSubArraysDecreasing(int[] array) {
        int counter=0;
        for (int i = 1; i <=array.length ; i++) {
            for (int j = 0; j <=array.length-i ; j++) {
                int[] subArray=  Arrays.copyOfRange(array,j,j+i);

                boolean res=   isValidSub(subArray);
                if (res)
                    counter++;
            }
        }
        return counter;
    }

    private static boolean isValidSub(int[] subArray) {
        boolean isValid=true;
        //7>6>5>4
        for (int i = 0; i < subArray.length-1; i++) {
            int current=subArray[i];
            int next=subArray[i+1];
            if (next>current){
                isValid=false;
                break;
            }
        }
        return isValid;
    }
}
