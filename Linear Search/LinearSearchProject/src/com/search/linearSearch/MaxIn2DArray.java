package com.search.linearSearch;

public class MaxIn2DArray {
    public static void main(String[] args) {
        int arr[][] = {{35,89, 65,56},
                {45,8,90},
                {40,58,10,35},
                {48,36,50}
        };
        System.out.println("max2DElement2===>"+max2DElement2(arr));
    }

    static int max2DElement2(int arr[][]){
        int maxElement = arr[0][0];
        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
               // int element = arr[row][column];
                if (arr[row][column]>=maxElement){
                    maxElement = arr[row][column];
                }
            }

        }
        return maxElement;
    }
}
