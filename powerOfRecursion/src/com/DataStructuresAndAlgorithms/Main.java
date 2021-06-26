package com.DataStructuresAndAlgorithms;

public class Main {

    public static void main(String[] args) {
	int a = power(5,3);
	int b  = power(7,5);
        System.out.println("A == "+a);
        System.out.println("B == " +b);
    }
    public static int power(int x, int n){
        // unintentional condition
        if(n<0){
            return -1;
        }
        // base condition
        if(n==0){
            return 1;
        }
        // recursive function
        return x* power(x,n-1);
    }
}
