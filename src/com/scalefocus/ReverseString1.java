package com.scalefocus;

public class ReverseString1 {

    public static void main(String[] args) {
        System.out.println(reverseString("eren"));
        System.out.println(reverseStringWithBasicActions("Alperen"));
    }

    public static String reverseString(String str){
        return new StringBuffer(str).reverse().toString();
    }


    public static String reverseStringWithBasicActions(String str){
        String reverseOne = "";
        for (int i = str.length()-1; i >= 0; i--) {
            reverseOne+= str.charAt(i);
        }
        return reverseOne;
    }

}
