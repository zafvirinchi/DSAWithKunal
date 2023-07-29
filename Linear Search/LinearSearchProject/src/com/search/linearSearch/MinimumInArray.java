package com.search.linearSearch;

public class MinimumInArray {
    public static void main(String[] args) {
        int[] a = {10,25,4,16,8,6,55,-7};

        System.out.println("minimum==>"+getMinimum2(a));
    }

    static int getMinimum2(int []a){
        int result = a[0];

        for (int i = 1; i <a.length ; i++) {
            if (a[i]<=result){
                result = a[i];

            }
        }

        return result;
    }
    static int getMinimum(int []a){

        int min = 0;
        for (int i:
             a) {
            if (min == 0){
                min = i;
            }
           else if(i<=min){
               min = i;
             // return min;
           }else{
               min = min;
              //return min;
           }
        }

        return min;
    }



}
