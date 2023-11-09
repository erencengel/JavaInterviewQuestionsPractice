package com.scalefocus;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Median_13 {

    /**
     * Median of sliding window in an array
     * Given an array of integer arr[] and an integer k, the task is to find the median of each window of size k starting from the left and moving towards the right by one position each time.
     * Examples:
     * Input: arr[] = {-1, 5, 13, 8, 2, 3, 3, 1}, k = 3
     * Output: 5 8 8 3 3 3
     * Input: arr[] = {-1, 5, 13, 8, 2, 3, 3, 1}, k = 4
     * Output: 6.5 6.5 5.5 3.0 2.5
     */


    public static void main(String[] args) {
        giveMedian(new Integer[]{-1, 5, 13, 8, 2, 3, 3, 1}, 3);
        giveMedian(new Integer[]{-1, 5, 13, 8, 2, 3, 3, 1}, 4);
        //giveMedian(new Integer[]{-1, 5, 13, 8, 2, 3, 3, 1, 10, 20, 4, -2, 5}, 5);
        //giveMedian(new Integer[]{-1, 5, 13, 8, 2, 3, 3, 1, 9, 1, 0, -9, 20}, 6);
        int[] arr = {-1, 5, 13, 8, 2, 3, 3, 1};
        int k = 3;
        int[] arr2 = {-1, 5, 13, 8, 2, 3, 3, 1};
        int l = 4;
        List<Double> medians = separateWindowWithSize(arr, k);
        List<Double> medians2 = separateWindowWithSize(arr2, l);
        System.out.println(medians);
        System.out.println(medians2);
    }

    static void giveMedian(Integer[] arr, int k) {
        if (k % 2 == 1) {
            System.out.println(giveMedianIfOdd(arr, k));
        } else {
            System.out.println(giveMedianIfEven(arr, k));
        }
    }

    static List<Integer> giveMedianIfOdd(Integer[] arr, int k) {
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        int b = 0;
        int division = k / 2;
        while (k <= arr.length) {
            list.addAll(Arrays.asList(arr).subList(b, k));
            int a = list.stream().sorted().collect(Collectors.toList()).get(division);
            list2.add(a);
            list.removeIf(n -> true);
            b++;
            k++;
        }
        return list2;
    }

    static List<Float> giveMedianIfEven(Integer[] arr, int k) {
        List<Float> list = new ArrayList<>();
        List<Float> list2 = new ArrayList<>();
        int b = 0;
        int division = k / 2;
        while (k <= arr.length) {
            for (int i = b; i < k; i++) {
                list.add(Float.valueOf(arr[i]));
            }
            float a = (list.stream().sorted().collect(Collectors.toList()).get(division) + list.stream().sorted().collect(Collectors.toList()).get(division - 1)) / 2;
            list2.add(a);
            list.removeIf(n -> true);
            b++;
            k++;
        }
        return list2;
    }


    //SOLVED BY ADAM
    static List<Double> separateWindowWithSize(int[] arr, int k) {

        //  0  1  2
        //[-1, 5, 13]
        List<Double> result = new ArrayList<>();

        for (int i = 0; i <= arr.length - k; i++) {

            int[] subArr = Arrays.copyOfRange(arr, i, i + k);
            Arrays.sort(subArr);
            System.out.println(Arrays.toString(subArr));

            if (k % 2 != 0) {
                result.add((double) subArr[k / 2]);
            } else {

                // -1 5 8 13 median=(5+8)/2 =6.5
                result.add((double) (subArr[k / 2] + subArr[k / 2 - 1]) / 2);
            }

        }

        return result;
    }
}
