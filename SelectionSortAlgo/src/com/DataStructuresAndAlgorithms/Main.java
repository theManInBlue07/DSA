package com.DataStructuresAndAlgorithms;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] myArray = {20,35,-15,7,1,-22,55};
        // Selection sort algo
         //Ascending
        for(int lastUnsortedIndex = myArray.length-1;lastUnsortedIndex>0;lastUnsortedIndex--){
            int largest = 0;
            for(int i =1;i<=lastUnsortedIndex;i++){
                if(myArray[i]>myArray[largest]){
                    largest = i;
                }
            }
            swap(myArray,lastUnsortedIndex,largest);
        }
        System.out.println(Arrays.toString(myArray));
// method 2--> Descending
        for(int i= myArray.length-1;i>0;i--){
            int min = 0;
            for(int j=1;j<= i;j++){
                if(myArray[j]<myArray[min]){
                    min = j;
                }
            }
            swap(myArray,i,min);
        }
        System.out.println(Arrays.toString(myArray));



    }
    public static void swap(int[] array,int i,int j){
        if(i==j){
            return;
        }
        int temp;
        temp = array[i];
        array[i]=array[j];
        array[j]=temp;
    }
}
