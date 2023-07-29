package com.search.binarySearch;

public class OrderAgnosticBinarySearch {

    public static void main(String[] args) {
        int arr[] = {95,89,75,69,58,48,36,33,27,15,10};
        int target = 36;
        int ans = orderAgnosticBS(arr,target);

        System.out.println(ans);
    }

    static int orderAgnosticBS(int arr[], int target){
        int start = 0;
        int end = arr.length-1;

        boolean isAscending = arr[start] < arr[end];

        while(start<=end){

            int mid = start + (end - start)/2;

            if(isAscending){
                if(target>arr[mid]){
                    start = mid + 1;

                }else if(target<arr[mid]){
                    end = mid - 1;
                }else{
                    return mid;
                }
            }else{
                if(target<arr[mid]){
                    start = mid + 1;


                }else if(target>arr[mid]){
                    end = mid - 1;
                }else{
                    return mid;
                }
            }
        }

        return -1;
    }
}
