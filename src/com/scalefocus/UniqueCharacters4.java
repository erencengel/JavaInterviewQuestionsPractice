package com.scalefocus;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UniqueCharacters4 {

    public static void main(String[] args) {
        System.out.println(getUniques("eren"));
        System.out.println(getUniques("!!!.,,:::_"));
        System.out.println(getUniques_Muhtar("eren"));
        System.out.println(getUniques_Muhtar("!!!.,,:::_"));
    }

    public static String getUniques(String str){
        List<String> list = new ArrayList<>();
        for (String s : str.split("")) {
            list.add(s);
        }
        list.removeIf(n -> Collections.frequency(list,n) > 1);
        String result = "";
        for (String s : list) {
            result+= s;
        }
        return result;
    }

    public static String getUniques_Muhtar(String str){
        String result = "";
        for (int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(str.indexOf(ch) == str.lastIndexOf(ch)){
                result+= str.charAt(i);
            }
        }
        return result;
    }
}
