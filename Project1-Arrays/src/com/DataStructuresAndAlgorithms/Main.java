package com.DataStructuresAndAlgorithms;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many days temperature ? ");
        int numdays = scan.nextInt();
        int[] tempsRecord = new int[numdays];
        // recording and finding Avergae
        int sum =0;
        for(int i =0;i<numdays;i++){
            System.out.println();
            System.out.println("Day "+(i+1)+" high temperature : ");
            tempsRecord[i]= scan.nextInt();
            sum += tempsRecord[i];
        }

        double averageTemp = (double)sum/numdays;
        System.out.println();
        System.out.println(" Average Temperature == "+ averageTemp);
        // counting number of days above average temperature
        int ndays = 0;
        for(int i = 0;i<tempsRecord.length;i++){

            if(tempsRecord[i]>averageTemp){
                ndays ++;

            }

        }

        System.out.println("Number of Days when temperature was above the Average temp is "+ndays);
    }
}
