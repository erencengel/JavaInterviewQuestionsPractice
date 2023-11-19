package com.scalefocus;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AdvanceReversal_14 {

    /**
     * Create a method that reverse the given string with following output
     * input:I am from California
     * output:a in rofi IaCmorfmaI
     */

    public static void main(String[] args) {
        System.out.println("getAdvanceReverse(\"I am from California\") = " + getAdvanceReverse("I am from California"));
        System.out.println(getAdvanceReverse("Alperen is my son")); // 7, 10, 13
    }

    static String getAdvanceReverse(String str) {
        List<Integer> list = new ArrayList<>();
        String[] array = str.split("");
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(" ")) list.add(i);
        }
        if (list.isEmpty()) {
            return new StringBuilder(str).reverse().toString();
        } else {
            String result = new StringBuilder(str).reverse().toString().replaceAll(" ", "");
            List<String> collect = Arrays.stream(result.split("")).collect(Collectors.toList());
            for (Integer integer : list) {
                collect.add(integer, " ");
            }
            String outcome = "";
            for (String s : collect) {
                outcome += s;
            }
            return outcome;
        }
    }
}
