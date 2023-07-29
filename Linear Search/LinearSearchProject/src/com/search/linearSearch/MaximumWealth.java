package com.search.linearSearch;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class MaximumWealth {

    public static void main(String[] args) {
        int [][]accounts = {
                {8,2,3},
                {3,2,1}
        };
       System.out.println(wealthCount(accounts));
    }

   /* public static int maximumWealth(int[][] accounts) {
        List<Integer> maxList = new ArrayList<>();
         maxList.add(wealthCount(accounts));
       // System.out.println(maxList);
        return maxList.stream().max(Comparator.comparing(Integer::valueOf)).get();

    }*/

    public static int wealthCount(int[][] accounts) {

        int maxVal = 0;
        for (int account = 0; account <accounts.length; account++) {
            int wealthCount = 0;
            for (int wealth = 0; wealth <accounts[account].length ; wealth++) {
                wealthCount += accounts[account][wealth];
                //System.out.println(wealthCount);
                if(maxVal<wealthCount){
                    maxVal = wealthCount;

                }
            }
        }
       return maxVal;
    }
}
