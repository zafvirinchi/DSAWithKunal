package com.search.binarySearch;

public class BinarySearchDemo {

    public static void main(String[] args) {
        int []a = {10,15,27,33,36,48,58,69,75,89,95};



        int target = 5;

        int ans = binarySearch(a,target);

        System.out.println(ans);
    }

    // return the index
    // return -1 if it doesnot exist
    static int binarySearch(int a[],int target){
         int start = 0;
         int end = a.length-1;

         while (start<=end){

            //int mid = start+end/2; // might be possible that (start+end) exends the limit of integer range

             int mid = start + (end - start)/2;

             if(target<a[mid]){
                 end = mid-1;
             } else if (target>a[mid]) {
                 start = mid + 1;
             }else {
               return mid;
             }
         }

        return -1;
    }
}
