package com.scalefocus;

import java.util.Arrays;

public class MergeArrays_9 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(mergeArrays(new Integer[]{1,3,0,-2000}, new Integer[]{-50,999})));
    }

    public static Object[] mergeArrays(Object[] arr1, Object[] arr2){
        Object[] expectedArray = new Object[arr1.length + arr2.length];
        int j = 0;
        for(int i = 0; i < arr1.length; i++, j++){
            expectedArray[j] = arr1[i];
        }
        for(int i = 0; i < arr2.length; i++, j++){
            expectedArray[j] = arr2[i];
        }
        return expectedArray;
    }

}
