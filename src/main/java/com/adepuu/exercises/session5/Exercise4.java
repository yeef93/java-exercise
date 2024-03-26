package com.adepuu.exercises.session5;

import java.util.*;

public class Exercise4 {
    /**
     * Java Array Program to Remove Duplicate Elements From an Array
     *
     * Input: [ 1, 2, 2, 3, 3, 3, 4, 5 ]
     * Output: [ 1, 2, 3, 4, 5 ]
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("========Remove Duplicate Data========");
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
        // Result
        System.out.println("Result Without Duplicate Data:"+removeDuplicate(arrayList));
    }

    // method to remove duplicate data
    static ArrayList<Integer> removeDuplicate(ArrayList<Integer>  list){
        for(int i = 0; i < list.size(); i++){
            for(int j = 0; j < list.size(); j++){
                if(i!=j){
                    if(list.get(i) == list.get(j)){
                        list.remove(list.get(j));
                    }
                }
            }
        }
        return (list);
    }
}
