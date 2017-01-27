package edu.tomer.java;


import java.util.Scanner;

public class IO {
    static Scanner scan = new Scanner(System.in);
    /**
     * This method prints an array of integers
     * @param arr an integer array that we want to print
     */
    static void print(int[] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%3d", arr[i]);
        }
        System.out.print("]");
        System.out.println();
    }

    static int getInt(String prompt){
        System.out.println(prompt);
        int n = scan.nextInt(); //alt + Enter here...
        return n;
    }

    static String getString(String prompt){
        System.out.println(prompt);
        return scan.next();
    }

    static int[] getIntArray(String prompt){
        //ask the user for the size:
        int n = getInt("Enter the array size");
        //init an array of the requested size:
        int[] result = new int[n];
        //loop through the array and fill it:
        for (int i = 0; i < n; i++) {
            result[i] = getInt(prompt);
        }
        return result;
    }
}
