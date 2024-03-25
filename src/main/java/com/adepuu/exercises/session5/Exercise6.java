package com.adepuu.exercises.session5;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise6 {
    /**
     * Java Array Program to Remove All Occurrences of an Element in an Array
     *
     * Input: array = [ 1, 2, 1, 3, 5, 1 ] , key = 1
     * Output: [2, 3, 5]
     *
     * Explanation: all the occurrences of element 1 is removed from the array So, array becomes from
     * [ 1, 2, 1, 3, 5, 1 ]  to
     * Final result: [2, 3, 5]
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("========Remove Duplicate Data========");
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

        System.out.print("Enter Key to Remove: ");
        int key = scanner.nextInt();
        // Display the ArrayList elements
        System.out.println("List Data:"+arrayList);
        // Result
        System.out.println("Result Without Occurence Data:"+removeOccurence(arrayList, key));
    }
    static ArrayList<Integer> removeOccurence(ArrayList<Integer>  list, int key){
        for(int i = 0; i < list.size(); i++){
            if(list.get(i) == key){
                list.remove(list.get(i));
            }
        }
        return (list);
    }
}
