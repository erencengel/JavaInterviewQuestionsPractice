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
        giveMedian(new Integer[]{-1, 5, 13, 8, 2, 3, 3, 1, 10, 20, 4, -2, 5}, 5);
        giveMedian(new Integer[]{-1, 5, 13, 8, 2, 3, 3, 1, 9, 1, 0, -9, 20}, 6);
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
}
