package com.scalefocus;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
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
        firstFive(new int[]{0,-10,5,500,1000,3,-90,-1,1001});
    }

    public static void firstFive(int[] number) {
        Consumer<int[]> consumer = n -> {
            Arrays.sort(n);
            int[] arrayV2 = new int[n.length];
            int j = 0;
            for (int i = n.length - 1; i >= 0; i--) {
                arrayV2[j] = n[i];
                j++;
            }
            System.out.println(Arrays.toString(Arrays.stream(arrayV2).limit(5).toArray()));
        };
        consumer.accept(number);
    }

}
