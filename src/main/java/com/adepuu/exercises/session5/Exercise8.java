package com.adepuu.exercises.session5;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise8 {
    /**
     * Java String Program to Find all Duplicates on Array
     *
     * Example 1:
     * Input: nums = [4,3,2,7,8,2,3,1]
     * Output: [2,3]
     *
     * Example 2:
     * Input: nums = [1,1,2]
     * Output: [1]
     *
     * Example 3:
     * Input: nums = [1]
     * Output: []
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

        // Display the ArrayList elements
        System.out.println("List Data:"+arrayList);
        // Result
        System.out.println("Result Duplicate Data in Array:"+findDuplicate(arrayList));
    }

    static ArrayList<Integer> findDuplicate(ArrayList<Integer>  list){
        ArrayList<Integer> duplicateResult = new ArrayList<>();
        for(int i = 0; i < list.size(); i++){
            for(int j = 0; j < list.size(); j++){
                if(i!=j){
                    if(list.get(i) != list.get(j)){
                        list.remove(list.get(i));
                    }
                    else if(list.get(i) == list.get(j)){
                        duplicateResult.add(list.get(i));
                        list.remove(list.get(i));
                    }

                }
            }
        }
        return (duplicateResult);
    }
}
