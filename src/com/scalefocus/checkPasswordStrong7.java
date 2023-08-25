package com.scalefocus;

public class checkPasswordStrong7 {

    public static void main(String[] args) {

        System.out.println(isStrong("Cyber12345."));

    }

    public static boolean isStrong(String str){
        if(
                hasDigit(str) &&
                hasLowerCase(str) &&
                hasUpperCase(str) &&
                hasCharacter(str) &&
                hasWhiteSpace(str) &&
                equalOrLongerThanEightCharacters(str)
        ){
            return true;
        }
        return false;
    }

    public static boolean hasWhiteSpace(String str){
        char[] chars = str.toCharArray();
        for (char aChar : chars) {
            if(Character.isWhitespace(aChar)) return false;
        }
        return true;
    }

    public static boolean equalOrLongerThanEightCharacters(String str){
        return str.length() >= 8;
    }

    public static boolean hasDigit(String str){
        char[] chars = str.toCharArray();
        for (char aChar : chars) {
            if(Character.isDigit(aChar)) return true;
        }
        return false;
    }

    public static boolean hasUpperCase(String str){
        char[] chars = str.toCharArray();
        for (char aChar : chars) {
            if(Character.isUpperCase(aChar)) return true;
        }
        return false;
    }

    public static boolean hasLowerCase(String str){
        char[] chars = str.toCharArray();
        for (char aChar : chars) {
            if(Character.isLowerCase(aChar)) return true;
        }
        return false;
    }

    public static boolean hasCharacter(String str){
        char[] chars = str.toCharArray();
        for (char aChar : chars) {
            if(!Character.isDigit(aChar) && !Character.isAlphabetic(aChar)) return true;
        }
        return false;
    }
}
