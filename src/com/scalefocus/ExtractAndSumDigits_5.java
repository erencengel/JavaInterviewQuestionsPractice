package com.scalefocus;

public class ExtractAndSumDigits_5 {

    public static void main(String[] args) {
        System.out.println("extractLettersAndSumDigits(\"123eren000!.8...*\") = " + extractLettersAndSumDigits("123eren000!.8...*"));
    }

    public static Integer extractLettersAndSumDigits(String str){
        int sum = 0;
        for (int i = 0; i <str.length(); i++){
            Character ch = str.charAt(i);
            if(Character.isDigit(ch)){
                sum+= Integer.parseInt(ch+"");
            }
        }
        return sum;
    }
}
