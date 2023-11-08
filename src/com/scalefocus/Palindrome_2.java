package com.scalefocus;

public class Palindrome_2 {

    public static void main(String[] args) {
        System.out.println(isPalindrome("eren"));
        System.out.println(isPalindrome("aslıhan"));
        System.out.println(isPalindrome("radar"));
        System.out.println(isPalindrome("Radar"));
    }

    public static boolean isPalindrome(String str){
        String reverseString = new StringBuilder(str).reverse().toString();
        return str.equalsIgnoreCase(reverseString);
    }

}
