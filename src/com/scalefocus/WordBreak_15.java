package com.scalefocus;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WordBreak_15 {

    /**
     * Word Break Problem
     * Given an input string and a dictionary of words, find out if the input string can be segmented into a space-separated sequence of dictionary words. See following examples for more details.
     * This is a famous Google interview question, also being asked by many other companies now a days.
     * Consider the following dictionary
     * { i, like, sam, sung, samsung, mobile, ice, cream, icecream, man, go, mango}
     * Input:  ilike
     * Output: Yes
     * Input:  ilikesamsung
     * Output: Yes
     */

    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("i", "like", "sam", "sung"));
        List<String> list2 = new ArrayList<>(Arrays.asList("i", "like", "sam", "sung", "samsung", "mobile", "ice", "cream", "man", "go", "mango"));

        System.out.println("isSegmented(list,\"ilikesam\") = " + isSegmented(list, "ilikesam"));
        System.out.println("isSegmented(list, \"ilikesa\") = " + isSegmented(list, "ilikesa"));
        System.out.println("isSegmented(list,\"ilikesams\") = " + isSegmented(list, "ilikesams"));

        System.out.println("isSegmented(list2, \"ilike\") = " + isSegmented(list2, "ilike"));
        System.out.println("isSegmented(list2,\"ilikesamsung\") = " + isSegmented(list2, "ilikesamsung"));

        System.out.println("breakInput(\"ilikesam\", list2) = " + breakInput("ilikesam", list2));
        System.out.println("breakInput(\"ilikesa\", list2) = " + breakInput("ilikesa", list2));
    }

    //EREN
    static boolean isSegmented(List<String> list, String input) {
        String result = input;
        for (String s : list) {
            if (input.contains(s)) {
                result = result.replaceFirst(s, "");
            }
        }
        return result.equals("");
    }

    //ADAM
    private static boolean breakInput(String input, List<String> dictionary) {
        String result="";
        String eachWord ="";
        int start=0;
        for (int i = 0; i <= input.length(); i++) {
            eachWord =  input.substring(start,i);
            if (dictionary.contains(eachWord)){
                result+= eachWord +" ";
                start+= eachWord.length();
            }
        }
        String s = result.trim().replaceAll(" ", "");
        return s.equals(input);
    }
}
