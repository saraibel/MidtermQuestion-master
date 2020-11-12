package string.problems;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".
        String A = "ARMY";
        String B = "MARY";
        char[] arrayofchar1 = A.toCharArray();
        char[] arrayofchar2 = B.toCharArray();
        Arrays.sort(arrayofchar1);
        Arrays.sort(arrayofchar2);
        if (Arrays.equals(arrayofchar1, arrayofchar2)) {
            System.out.println("the words are anangram");
        } else {
            System.out.println("the words are not anangram");
        }


    }
}
