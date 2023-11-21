package com.scalefocus;

import java.util.Arrays;
import java.util.Collections;

public class CheckDecreasePeriod {

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
        int[] arr2 = new int[] {4,2,1,0,3};
        System.out.println("countDecreasingPeriods(arr) = " + countDecreasingPeriods(arr));
        System.out.println("");
        System.out.println("countDecreasingPeriods(arr2) = " + countDecreasingPeriods(arr2));
    }

    static int countDecreasingPeriods(int[] array){
        StringBuilder result = new StringBuilder();
        for (int i : array) {
            result.append(i);
        }
        String[] strArray;
        int count = array.length;
        int a = 2;
        while (a < array.length){
            for (int i = 0; i < array.length-1; i++){
                if((a+i) > array.length) continue;
                String[] split = result.substring(i, a+i).split("");
                int[] numbers = Arrays.stream(split).mapToInt(Integer::parseInt).toArray();
                System.out.println("Arrays.toString(numbers) = " + Arrays.toString(numbers));
                Integer[] intToInt = new Integer[numbers.length];
                for (int i1 = 0; i1 < numbers.length; i1++) {
                    intToInt[i1] = numbers[i1];
                }
                Integer[] outcome = Arrays.copyOf(intToInt,intToInt.length);
                Arrays.sort(intToInt, Collections.reverseOrder());
                if(Arrays.equals(outcome,intToInt)) count++;
                System.out.println("count = " + count);
            }
            a++;
        }
        return count;
    }

}
