package com.scalefocus;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FirstFiveLargest_19 {

    /**
     * Amazon Company
     * Given an array of integers , print first 5 largest numbers
     * int[] array = {1, 2, 3, 4, 5, 6, 7};
     * 7,6,5,4,3
     */

    public static List<Integer> firstFiveLargest(int[] numbers) {
        return Arrays.stream(numbers).boxed().collect(Collectors.toList()).stream().sorted(Comparator.reverseOrder()).limit(5).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        System.out.println(firstFiveLargest(new int[]{1, 5, 4, 0, 90, -5, 78}));
    }

}
