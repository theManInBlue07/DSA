package com.DataStructuresAndAlgorithms;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// bubble sort algo
        // time complexity of bubble sort algorithm is O(n^2).
        int[] myIntArray = {20,35,-15,7,55,1,-22};
        bubbleSort(myIntArray);
        int[] myArray = {101,202,303,5,6,8,7,89,45,-879,-85,-852,564,564,895,456,-7,-9,789,1,45};
        bubbleSort(myArray);
        bubbleSortDescending(myIntArray);
        bubbleSortDescending(myArray);
    }


    public static int[] bubbleSort(int[] array){
        for(int unsortedPartitionINdex= array.length;unsortedPartitionINdex>0;unsortedPartitionINdex--){
            for(int i = 0;i< array.length-1;i++){
                if(array[i]>array[i+1]){
                    int temp;
                    temp = array[i];
                    array[i]=array[i+1];
                    array[i+1]=temp;

                }
            }
        }
        System.out.println("The sorted array is  "+ Arrays.toString(array));
        return array;
    }

    public static int[] bubbleSortDescending(int[] array){
        for(int unsortedPartitionINdex= array.length;unsortedPartitionINdex>0;unsortedPartitionINdex--){
            for(int i = 0;i< array.length-1;i++){
                if(array[i]<array[i+1]){
                    int temp;
                    temp = array[i];
                    array[i]=array[i+1];
                    array[i+1]=temp;

                }
            }
        }
        System.out.println("The Sorted array in Descending order is "+Arrays.toString(array));
        return array;
    }
}
