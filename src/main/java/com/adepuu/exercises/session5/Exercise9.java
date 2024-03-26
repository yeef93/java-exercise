package com.adepuu.exercises.session5;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise9 {
    /**
     * Java Program to get the number of days you have to wait after the i-th day to get a warmer temperature
     *
     * Example 1:
     * Input: temperatures = [73,74,75,71,69,72,76,73]
     * Output: [1,1,4,2,1,1,0,0]
     *
     * Example 2:
     * Input: temperatures = [30,40,50,60]
     * Output: [1,1,1,0]
     *
     * Example 3:
     * Input: temperatures = [30,60,90]
     * Output: [1,1,0]
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("========Check i-th day Warmer Temperature========");
        // Ask the user for fill the size of the array
        System.out.print("Enter the size of the array Temperatures: ");
        int size = scanner.nextInt();
        // Ask the user to input elements for the array
        System.out.println("Enter " + size + " temperature for the array:");
        scanner.close();
        // Convert the array to an ArrayList
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            arrayList.add(scanner.nextInt());
        }

        // Display the ArrayList elements
        System.out.println("temperatures:"+arrayList);
        // Result
        System.out.println("Result:"+getNextWarmer(arrayList));
    }
    static ArrayList<Integer> getNextWarmer(ArrayList<Integer>  list){
        ArrayList<Integer> dayWarmer = new ArrayList<>();
        int dayGetWarmer = 0;
        for (int i = 0; i < list.size(); i++) {
            for (int j = 1; j < list.size(); j++) {
                if(i<j){
                    if (list.get(i)< list.get(j)){
                        dayGetWarmer = j-i;
                        break;
                    }
                }
            }
            dayWarmer.add(dayGetWarmer);
            dayGetWarmer = 0;
        }
        return dayWarmer;
    }
}
