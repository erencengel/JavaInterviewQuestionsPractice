package com.scalefocus;

import java.util.Locale;

public class RemoveDuplicates_3 {

    public static void main(String[] args) {
        System.out.println(removeDuplicate("Aslıhan"));
    }

    public static String removeDuplicate(String str){
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            String ch = "" + str.toLowerCase(Locale.ROOT).charAt(i);
            if(result.contains(ch)) continue;
            result+= ch;
        }
        return result;
    }

}
