package com.search.binarySearch;

public class CeilNumber {

    public static void main(String[] args) {
        //int arr[] = {10,15,27,33,36,48,58,69,75,89,95};
        //int target = 29;
        //int ans = findCeilNumber(arr,target);

        int arr[] = {95,89,75,69,58,48,36,33,27,15,10};
        int target = 35;
        int ans = findCeilNumber(arr,target);


        System.out.println(ans);

    }

    //ceiling is a number which is greater or equal to the target element out of array
    static int findCeilNumber(int arr[],int target){
        int start = 0;
        int end = arr.length-1;

        boolean ascElement = arr[start]<arr[end];

        while (start<=end){
            int mid = start + (end - start)/2;

            if (ascElement){
                if(target>arr[mid]){
                    start = mid + 1;

                }else if (target < arr[mid]){
                    end = mid-1;

                }else if (target == arr[mid]){
                    return arr[mid];
                }
            } else{
                if(target<arr[mid]){
                    start = mid + 1;

                }else if (target > arr[mid]){
                    end = mid-1;

                }else if (target == arr[mid]){
                    return arr[mid];
                }
            }

        }
        return arr[end];
    }
}
