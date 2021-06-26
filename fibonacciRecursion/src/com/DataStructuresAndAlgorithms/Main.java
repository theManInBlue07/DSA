package com.DataStructuresAndAlgorithms;

public class Main {

    public static void main(String[] args) {
        System.out.println(fibonacci(7));
//        double a =(double) fibonacci(5);
//        double b = (double) fibonacci(6);
//        System.out.println((double)(b/a));
    }
    public static int fibonacci(int n){
        // 3 unintentional case
        if(n<0){
            return -1;
        }
        //2 base case where the loop stops
        if(n==0||n==1){
            return n;
        }
        //1 fib(n) =fibonacci((n-1))+fibonacci((n-2));
         return fibonacci(n-1)+fibonacci(n-2);
    }
}
