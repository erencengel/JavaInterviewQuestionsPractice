package com.scalefocus;

import java.util.*;

public class SubStrings11 {

    /*
    Count of substrings having all distinct characters
    Given a string str consisting of lowercase alphabets, the task is to find the number of possible substrings (not necessarily distinct) that consists of distinct characters only.
    Examples:
    Input: Str = “gffg”
    Output: 6
    Explanation:
    All possible substrings from the given string are,
    ( “g“, “gf“, “gff”, “gffg”, “f“, “ff”, “ffg”, “f“, “fg“, “g” )
    Among them, the highlighted ones ( “g“, “gf“, “f“, “f“, “fg“, “g” ) consists of distinct characters only.
    Input: str = “gfg”
    Output: 5
    Explanation:
    All possible substrings from the given string are,
    ( “g“, “gf“, “gfg”, “f“, “fg“, “g” )
    Among them, the highlighted ( “g“, “gf“, “f“, “fg“, “g” ) consists of distinct characters only.
     */

    public static void main(String[] args) {
        System.out.println("returnDistinctAsList(addSubstringsToArraylist(\"eren\")) = " + returnDistinctAsList(addSubstringsToArraylist("eren")));
        System.out.println("addSubstringsToArraylist2(\"eren\") = " + addSubstringsToArraylist2("eren"));
    }

    static List<String> addSubstringsToArraylist(String str){
        List<String> result = new ArrayList<>();
        int a = 0;
        while (a < str.length()){
            for (int j = a; j <= str.length(); j++){
                result.add(str.substring(a,j));
            }
            a++;
        }
        result.removeIf(n -> n.equals(""));
        return result;
    }

    static List<String> returnDistinctAsList(List<String> list){
        List<String> distinctList = new ArrayList<>();
        for (String s : list) {
            boolean bool = true;
            String[] split = s.split("");
            for (String s1 : split) {
                if(Collections.frequency(Arrays.asList(split),s1) != 1){
                    bool = false;
                    break;
                }
            }
            if(bool) distinctList.add(s);
        }
        return distinctList;
    }

    static List<String> addSubstringsToArraylist2(String str){
        List<String> result = new ArrayList<>();
        int a = 0;
        while (a < str.length()){
            for (int j = a; j <= str.length(); j++){
                result.add(str.substring(a,j));
            }
            a++;
        }
        result.removeIf(n -> n.equals(""));
        return returnDistinctAsList(result);
    }
}
