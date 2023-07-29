package com.search.linearSearch;

import java.util.Arrays;

public class SearchIn2DArray {

    public static void main(String[] args) {
        int arr[][] = {{35,89, 65,56},
                {45,8,90},
                {40,58,10,35},
                {48,36,50}
        };
        int target = 10;
        int []ans = search2DElement2(arr,target);
        System.out.println("search2DElement==>"+ Arrays.toString(ans));
    }
//will return the index of target element
    static int[] search2DElement2(int arr[][],int target){

        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                int element = arr[row][column];
                if (element == target){
                    return new int[] {
                        row,column
                    };
                }
            }

        }
        return new int[]{-1,-1};
    }

    static boolean search2DElement(int arr[][],int target){

        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                int element = arr[row][column];
                if (element == target){
                    return true;
                }
            }

        }
        return false;
    }
}
