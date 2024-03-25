package com.adepuu.exercises.session5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import static java.util.Collections.rotate;

public class Exercise2 {
    /**
     * Java Array Program For Array Rotation
     * Input: arr[] = {1, 2, 3, 4, 5, 6, 7},  d = 2
     * Output:  3 4 5 6 7 1 2
     * Explanation: d=2 so 2 elements are rotated to the end of the array. So, 1 2 is rotated back
     * So, Final result: 3, 4, 5, 6, 7, 1, 2
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("========Rotate The Array========");
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
        // Ask the user for fill number rotate start from
        System.out.println("Enter rotate start from:");
        int d = scanner.nextInt();
        // Display the ArrayList elements
        System.out.println("List Data:"+arrayList);
        System.out.println("Result After Rotate is:"+rotateArray(arrayList,d));
    }

    // method to rotate array
    static ArrayList<Integer> rotateArray(ArrayList<Integer>  list, int d){
        ArrayList<Integer> rotateResult = new ArrayList<>();
        if (d == 1){
            rotateResult = list;
        }
        else if(d<list.toArray().length+1){
            for(int i = d; i < list.size(); i++){
                rotateResult.add(list.get(i));
            }
            for(int i = 0; i < d; i++){
                rotateResult.add(list.get(i));
            }
        }
        else {

        }
        return (rotateResult);
    }
}
