package com.DataStructuresAndAlgorithms;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
	rotateMatrix(matrix);

	int[][] matrix2 = {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
	rotateMatrix(matrix2);


    }
    public static void rotateMatrix(int[][] array1){
        int N = array1.length;
        // Transpose of a matrix .
        for(int i = 0;i<N;i++){
            for(int j =i;j<N;j++){
                int temp = array1[i][j];
                array1[i][j]=array1[j][i];
                array1[j][i] = temp;
            }
        }
        // now swapping the elements in C1 with Cn.
        // C2 with Cn-1 & so on ..

        for(int i = 0;i<N;i++){
            for(int j = 0;j<N/2;j++){
                int temp = array1[i][j];
                array1[i][j] = array1[i][N-j-1];
                array1[i][N-j-1]=temp;
            }
        }
        System.out.println(Arrays.deepToString(array1));

    }
}
