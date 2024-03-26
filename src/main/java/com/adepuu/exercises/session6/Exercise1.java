package com.adepuu.exercises.session6;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise1 {
    /**
     * Write a Java Program to Enter numbers to calculate average and enter 'q' to finish.
     *
     * Input: 1, 2, 3, 4, 5, q
     * Output: 3
     *
     * Input: 1, 2, 3, a, b, 4, 5, q
     * Output: 3
     *
     * Explanation: print "Invalid input. Please enter a valid number or 'q' to finish." if user not inserting the expected number or character.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("========Calculate average========");
        System.out.println("Please enter a valid number or 'q' to finish");
        String number;
        ArrayList<Integer> arrayList = new ArrayList<>();
        while (true) {
            try{
                number = input.next().toLowerCase();
                if(number.equalsIgnoreCase("q") ){
                    System.out.println("Average is:"+getAverage(arrayList));
                    break;
                }
                else {
                    arrayList.add(Integer.valueOf(number));
                }
            }
            catch (NumberFormatException ex){
                System.out.println("Please enter a valid number or 'q' to finish.");
                continue;
            }
        }
        input.close();
    }

    // method to get average
    static int getAverage(ArrayList<Integer>  list){
        int sum = 0;
        int total = list.size();
        int result;
        for (int value : list) {
            sum += value;
        }
        result = sum/total;
        return result;
    }
}
