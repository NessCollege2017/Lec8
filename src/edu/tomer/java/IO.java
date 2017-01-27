package edu.tomer.java;




import java.util.Scanner;

public class IO {
    static Scanner scan = new Scanner(System.in);
    /**
     * This method prints an array of integers
     * @param arr an integer array that we want to print
     */
    static void print(int[] arr){
        //System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%4d", arr[i]);
        }
        //System.out.print("]");
        System.out.println();
    }
    static void print(int[][] arr){
        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                System.out.printf("%4d", arr[i][j]);
//            }
//            System.out.println();
            print(arr[i]);
        }
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