package com.DataStructuresAndAlgorithms;

public class Main {

    public static void main(String[] args) {
        System.out.println(sumOfDigits(25647899));
        System.out.println(sumOfDigits(-2));
        System.out.println(sumOfDigits(254701289));
        System.out.println(sumOfDigits(9));
        System.out.println(sumOfDigits(0));
    }
    public static int sumOfDigits(int n){
        if(n<0){
            return -1;
        }
        if(n<10){
            return n;
        }
        return n%10 + sumOfDigits(n/10);
    }
}
