package com.scalefocus;

import java.util.Arrays;

public class ReverseArray8 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(reverseArray(new String[]{"eren", "aslıhan", "alperen"})));
        System.out.println(Arrays.toString(reverseArray(new Integer[]{1, 10, 0, -50, 5000})));
    }

    public static Object[] reverseArray(Object[] objects){
        Object[] arr = new Object[objects.length];
        int j = 0;
        for (int i = objects.length - 1; i >= 0; i--) {
            arr[j] = objects[i];
            j++;
        }
        return arr;
    }
}
