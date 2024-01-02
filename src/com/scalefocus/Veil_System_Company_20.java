package com.scalefocus;

import java.util.Arrays;

public class Veil_System_Company_20 {

    /**
     * Veil Systems Company
     * The problem we would like you to solve deals with an array of integers.
     * We want to rotate these integers to a specified number of positions to the left.
     * If for example you have an array of integers [1,2,3,4,5,6,7] and we would like to rotate 2 positions to the left,
     * the solution expected would be [3,4,5,6,7,1,2].
     * Note: the solution should be able to handle a position value greater than the number of integers in the array.
     * If, for example, we would like to rotate [1,2,3,4,5,6,7] 8 positions to left, it would produce the result [2,3,4,5,6,7,1].
     * Negative values for the positions to rotate will throw an error which the code example should handle gracefully.
     */

    public static void main(String[] args) {
        System.out.println(rotateArray(new int[]{1, 2, 3, 4, 5, 6, 7}, 10));
    }

    /**
     * Eren Ç.
     */
    public static String rotateArray(int[] array, int number) {
        if(number <= 0) return Arrays.toString(array);
        int num = (number%array.length);
        String draft = "";
        for (int i : array) {
            draft = draft + i;
        }
        String draftV2 = "";
        draftV2 = draft.substring(0,num);
        draft = draft.replace(draftV2, "");
        draftV2 = draft + draftV2;
        String[] split = draftV2.split("");
        int n = split.length;
        int[] arrayV2 = new int[n];
        for (int i = 0; i < split.length; i++) {
            arrayV2[i] = Integer.parseInt(split[i]);
        }
        return Arrays.toString(arrayV2);
    }

    /**
     * Adam
     */
    private static void shiftLeft(int[] array, int i) {
        if (i < 0)
            throw new RuntimeException("You can not use position number less than 0");

        i = i % array.length;
        int[] firstPart = Arrays.copyOfRange(array, 0, i);
        int[] ints = myCopyOfRange(array, 0, i);
        System.out.println("Arrays.toString(ints) = " + Arrays.toString(ints));
        int[] secondPart = Arrays.copyOfRange(array, i, array.length);

        System.out.println("Arrays.toString(firstPart) = " + Arrays.toString(firstPart));

        System.out.println("Arrays.toString(secondPart) = " + Arrays.toString(secondPart));

        int[] result = new int[array.length];

        int index = 0;

        for (int secondArrayElement : secondPart) {
            result[index++] = secondArrayElement;
        }

        System.out.println(Arrays.toString(result));

        for (int firstArrayElement : firstPart) {
            result[index++] = firstArrayElement;
        }
        System.out.println(Arrays.toString(result));


    }

    private static int[] myCopyOfRange(int[] array, int from, int to) {
        int[] newArray = new int[to - from];
        int index = 0;
        for (int i = from; i < to; i++) {
            newArray[index++] = array[i];
        }

        return newArray;
    }

}
