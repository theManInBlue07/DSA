package com.DataStructuresAndAlgorithms;

public class TwoDimensionalArray {
    public static int[][] array;



    public TwoDimensionalArray(int numberOfRows,int numberOfColumns) {
        this.array =new int[numberOfRows][numberOfColumns];
        for(int row = 0;row< array.length;row++){
            for (int column =0;column< array[0].length;column++){
                array[row][column]= Integer.MIN_VALUE;
            }
        }
    }
    public static void insertingValues(int row,int column,int value){
        try{
            if(array[row][column]==Integer.MIN_VALUE){
                array[row][column] = value;
                System.out.println("Value is sucessfully inserted");
            }else{
                System.out.println("This cell is already occupied.");
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index out of bound ");
        }
    }
// Accessing elements in 2d array
    public static void accessElement(int row, int col){
        System.out.println("Accessing row # =="+row+"\n Accessing column #"+col);
        try{
            System.out.println("the element is "+array[row][col]);

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index out of bound ");
        }

    }
// trversing 2d array
    // output the complete array at once
public static void traverse2darray(){
        for (int row = 0; row< array.length;row++){
            for(int col=0;col<array[0].length;col++){
                System.out.print(array[row][col]+" ");
            }
            System.out.println();
        }
}
// searching for an element in 2d array.
    public static void search2Delement(int value){
        for(int row=0;row< array.length;row++){
            for(int col = 0;col< array[0].length;col++){
                if(array[row][col]==value){
                    System.out.println("Value is found at row: "+row+". col: "+col);
                return;
                }
            }
        }
        System.out.println("Value not found ");
    }
// deleting an element in 2d array and setting it to the samllest integer value
    public static void deleteElement(int row,int col){
        try{
            System.out.println("Sucessfully deleted element : "+ array[row][col]);
            array[row][col]=Integer.MIN_VALUE;
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid row or column value entered");
        }
    }

}
