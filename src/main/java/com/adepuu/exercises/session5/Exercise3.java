package com.adepuu.exercises.session5;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise3 {
    /**
     * Write a Java Program to Check if Array Contain Duplicates
     *
     * Example 1:
     * Input: nums = [1,2,3,1]
     * Output: true
     *
     * Example 2:
     * Input: nums = [1,2,3,4]
     * Output: false
     *
     * Example 3:
     * Input: nums = [1,1,1,3,3,4,3,2,4,2]
     * Output: true
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("========Check Duplicate Data Or Not========");
        // Ask the user for fill the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        // Ask the user to input elements for the array
        System.out.println("Enter " + size + " elements for the array:");
        // Convert the array to an ArrayList
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            arrayList.add(scanner.nextInt());
        }

        // Display the ArrayList elements
        System.out.println("List Data:"+arrayList);
        // Result
        System.out.println("Duplicate Status:"+isDuplicate(arrayList));

    }

    // method to check duplicate data
    static boolean isDuplicate(ArrayList<Integer>  list){
        boolean statusDuplicate = false;
        for(int i = 0; i < list.size(); i++){
            for(int j = 0; j < list.size(); j++){
                if(i!=j){
                    if(list.get(i) == list.get(j)){
                        statusDuplicate = true;
                    }
                }
            }
        }
        return (statusDuplicate);
    }
}
