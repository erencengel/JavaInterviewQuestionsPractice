package com.scalefocus;

import java.util.Arrays;

public class Anagram6 {

    public static void main(String[] args) {
        System.out.println(isAnagram("eren", "erne"));
    }

    public static boolean isAnagram(String str1, String str2){
        String[] firstArray = str1.split("");
        Arrays.sort(firstArray);
        String[] secondArray = str2.split("");
        Arrays.sort(secondArray);
        return Arrays.equals(firstArray,secondArray);
    }

}
