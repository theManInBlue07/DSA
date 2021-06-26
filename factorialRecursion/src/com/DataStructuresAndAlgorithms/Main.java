package com.DataStructuresAndAlgorithms;

public class Main {

    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(factorial(10));
    }
    public static int factorial(int n){
        // Creating special cases
        if (n<0){
            return -1;
        }
        if(n==0||n==1){
            return 1;

        }
        return n*factorial(n-1);
    }
}
