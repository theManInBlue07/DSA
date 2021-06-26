package com.DataStructuresAndAlgorithms;

public class Main {

    public static void main(String[] args) {
        System.out.println(gcd(49,14));
    }
    public static int gcd(int x,int y){
        if(x<0||y<0){
            return -1;

        }
        if(y==0){
            return x;
        }
        return gcd(y,x%y);
    }
}
