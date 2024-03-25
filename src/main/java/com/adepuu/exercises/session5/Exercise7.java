package com.adepuu.exercises.session5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Exercise7 {
    /**
     * Java String Program to Check Anagram
     *
     * Example 1:
     * Input: s = "anagram", t = "nagaram"
     * Output: true
     *
     * Example 2:
     * Input: s = "rat", t = "car"
     * Output: false
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("========Check Anagram========");
        // Ask the user for fill the first text
        System.out.println("Enter first text: ");
        String first = scanner.next();
        System.out.println("Enter second text: ");
        String second = scanner.next();
        System.out.println("First Text :"+first);
        System.out.println("Second Text :"+second);
        // Result
        System.out.println("Result:"+isAnagram(first,second));
    }

    static boolean isAnagram(String first, String second){
        boolean statusAnagram = true;
        if(first.length() != second.length()){
            statusAnagram = false;
        }
        else{
            char[] characterString1 = first.toLowerCase().toCharArray();
            char[] characterString2= second.toLowerCase().toCharArray();

            // Sort strings
            Arrays.sort(characterString1);
            Arrays.sort(characterString2);

            for(int i = 0; i < characterString2.length; i++){
                if(characterString1[i] != characterString2[i]){
                    statusAnagram = false;
                }
            }
        }
        return (statusAnagram);
    }
}
