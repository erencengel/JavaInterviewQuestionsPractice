package com.scalefocus;

public class ReverseString1 {

    public static void main(String[] args) {
        System.out.println(reverseString("eren"));
        System.out.println(reverseStringWithBasicActions("Alperen"));
        System.out.println(re("aslıhan"));
        System.out.println(re2("agaH"));
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

    static String re(String str){
        return new StringBuffer(str).reverse().toString();
    }

    static String re2(String str){
        String result = "";
        for (int i = str.length()-1; i >=0 ; i--) {
            result += str.charAt(i);
        }
        return result;
    }
}
