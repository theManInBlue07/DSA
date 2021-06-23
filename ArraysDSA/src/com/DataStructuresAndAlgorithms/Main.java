package com.DataStructuresAndAlgorithms;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] myIntArray = new int[5];
        myIntArray[0]=-5;
        myIntArray[1]=-7;
        myIntArray[2]=87;
        myIntArray[3]=54;
        myIntArray[4]=-101;
        //System.out.println(Arrays.toString(myIntArray));


//        for(int i =0;i<myIntArray.length;i++){
//            System.out.println("The "+i+" element in the array is "+myIntArray[i]);
//
//        }


// operation-1 , Retreiving an element with an index .
        // Time complexity is O(1).
        //System.out.println(myIntArray[2]);


// operation 2 retreiving without an index.
        //  worst case scenario in an array would have a time complexity of O(n).
        // n is the # of elements in the array.
//        int index=-1;
//        for(int i =0;i< myIntArray.length;i++){
//            if(myIntArray[i]==-101){
//                index = i;
//                break;
//            }
//        }
//        System.out.println("Index == "+index);
//        // since the index here is 49999.
        // the loop runs 49999 times to give us the answer.

// Operation -3 --> Adding an element to a full array .
int[] myNewIntArray = new int[8];
//myNewIntArray = myIntArray;

        for(int i =0;i< myIntArray.length;i++){
//            for(int j =0;j<myIntArray.length;j++){
                myNewIntArray[i] = myIntArray[i];

//            }


            System.out.println(myNewIntArray[i]);

        }
        myNewIntArray[5]=-999;
        myNewIntArray[6]= -999;
        myNewIntArray[7]=-999;
        System.out.println(Arrays.toString(myNewIntArray));
            myNewIntArray[1]=750;
        System.out.println(Arrays.toString(myNewIntArray));
// operation 6
        //  deleting an element by shifting elements
        int[] myArray = new int[7];
        for(int i=2;i<myArray.length;i++){
            myArray[i]=myNewIntArray[i+1];
        }
        for(int j =0;j<2;j++){
            myArray[j]=myNewIntArray[j];
        }
        System.out.println(Arrays.toString(myArray));







    }
}
