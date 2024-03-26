package com.adepuu.exercises.session5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercise1 {
    /**Write a Java Program to Find the Largest Element in Array
    * Input: [ 7, 2, 5, 1, 4]
    * Output: 7
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("========Find the largest element========");
        // Ask the user for fill the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        // Ask the user to input elements for the array
        System.out.println("Enter " + size + " elements for the array:");
        scanner.close();
        // Convert the array to an ArrayList
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            arrayList.add(scanner.nextInt());
        }

        // Display the ArrayList elements
        System.out.println("List Data:"+arrayList);
        System.out.println("Largest element is:"+getMaximum(arrayList));
    }

    // method to get max number
    static int getMax(ArrayList<Integer>  list){
        return Collections.max(list);
    }

    // another method to get max number
    static int getMaximum(ArrayList<Integer>  list){
        int maximum = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (maximum < list.get(i))
                maximum = list.get(i);
        }
        return maximum;
    }
}
