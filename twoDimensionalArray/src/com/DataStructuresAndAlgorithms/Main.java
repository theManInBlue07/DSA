package com.DataStructuresAndAlgorithms;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
//	TwoDimensionalArray sda2 = new TwoDimensionalArray(4,4);
//    sda2.insertingValues(0,0,5);
//    sda2.insertingValues(0,1,56);
//    sda2.insertingValues(2,3,89);
//        System.out.println(Arrays.deepToString(sda2.array));
//        sda2.insertingValues(20,3,89);
//        sda2.accessElement(0,3);

//        sda2.traverse2darray();
    TwoDimensionalArray sda = new TwoDimensionalArray(3,3);
    sda.insertingValues(0,0,5);
        sda.insertingValues(0,1,15);
        sda.insertingValues(0,2,25);
        sda.insertingValues(1,1,15);
        sda.insertingValues(2,2,35);
        sda.traverse2darray();
    sda.search2Delement(35);
    sda.search2Delement(5);
        sda.search2Delement(5000);
        sda.deleteElement(0,1);
        sda.traverse2darray();
        sda.deleteElement(10,52);
        System.out.println(Arrays.deepToString(sda.array));
    }
}
