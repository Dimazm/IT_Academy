package com.rakovets.course.javabasics.practice.workbook.arrays;

import java.util.Arrays;

public class Task23 {
    public static void main(String[] args) {
        int[][] newArray = new int[5][];
        for (int i = 0; i < 5; i++){
            newArray[i] = new int [i+5];
            for ( int j = 0; j < newArray[i].length; j++){
                System.out.print(newArray[i][j] + "   ");
            }   System.out.println();

        }




    }
}
