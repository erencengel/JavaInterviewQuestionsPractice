package com.scalefocus;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

    /**
    * Erase chars when they occur less than N times
    * Requirement:
    * Given a text and a number, we are required to erase characters if they occur less than the given number, with the following additional rules:
    * • The counting algorithm shall be case-sensitive. 'A' and 'a' are different.
    * • Non-letter characters (numbers, punctuation, etc.) shall not be erased and copied verbatim to the output.
    * • Spaces shall not be counted, and they shall not be removed even when they match the criteria.
    * • An exception to the above is that there can't be consecutive spaces in the output
    * if there are any, they shall be replaced by a single space. "a b" becomes 'a b'.
    * <p>
    * A sample input string would be:
    * "aaaffccceee ffc!aaf 1 12dda 123"
    * So, when the input number is 5, we shall remove all characters that occur 1, 2, 3, or 4 times, with the result being:
    * "aaaff ff!aaf 1 12a 123"
    *  Note that 'a' and 'f' are not removed because they occur 6 and 5 times respectively, and the numbers and punctuation are copied verbatim to the output.
    * Write a solution that satisfies this requirement.
    */

public class EraseCharsIfLessThanNTimes_18 {

    public static void main(String[] args) {
        String outcome = eraseCharsLessThenXNTimes("aaaffccceee ffc!aaf 1 12dda 123", 5);
        System.out.println("outcome = " + outcome);
    }

    public static String eraseCharsLessThenXNTimes(String text, int number) {
        String result = text;
        String[] split = text.split("");
        List<String> strings = Arrays.asList(split);
        for (String s : strings) {
            if (Collections.frequency(strings, s) < number && Character.isAlphabetic(s.charAt(0))) result = result.replaceAll(s, "");
        }
        return result;
    }

}
