package edu.tomer.java;

import org.jetbrains.annotations.Contract;

/**
 * Created by Android2017 on 27/01/2017.
 */
public class Math {

    static int add(int x, int y){
        return x + y;
    }


    /**
     * factorial(n) = 1*2*3*...n
     * @param n to calculate factorial for
     * @return the factorial of n (1*2*3*...n
     */
    static int factorial(int n){
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
