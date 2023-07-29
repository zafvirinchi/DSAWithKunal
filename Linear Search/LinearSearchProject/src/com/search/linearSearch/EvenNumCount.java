package com.search.linearSearch;

public class EvenNumCount {

    public static void main(String[] args) {
        int []nums = {12,345,2,6,7896};

       int evenCount = findNumbers(nums);
       System.out.println("evenCount===>"+evenCount);


    }


    public static int findNumbers(int[] nums) {
        int evenCount = 0;
        for(int num:nums){
            System.out.println("numOfDigit==>"+findNumnerOfDigit(num));
            if(even(num)){
                evenCount++;
            }

        }

         return evenCount;
    }

    static int findNumnerOfDigit(int num){

        return (int)(Math.log10(num))+1;
    }

    static boolean even(int num){
        int count = 0;

        while(num>0){
            count++;
            num=num/10;
        }
        if(count%2==0){
            return true;
        }
        return false;
    }
}
