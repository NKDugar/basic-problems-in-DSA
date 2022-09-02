package com.company;
import java.util.*;

class StockBuyAndSell{

//        Input: prices = [7,1,5,3,6,4]
//        Output: 5
//        Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
//        Note: That buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.
//        Example 2:
//        Input: prices = [7,6,4,3,1]
//        Output: 0
//        Explanation: In this case, no transactions are done and the max profit = 0.

        int maxProfit(int[] arr){

                int max=Integer.MIN_VALUE;
                int min=0;
                for(int i=0;i<arr.length;i++){

                        for(int j=i+1;j<arr.length;j++){

                              if(arr[j]-arr[i] > max) {
                                      max = arr[j] - arr[i];
                              }
                        }
                }
                if(max>min){
                        return max;
                }
                else{
                        return 0;
                }

        }


public static void main(String[] args)
{
int [] arr={7,6,4,3,1};
StockBuyAndSell s=new StockBuyAndSell();
        System.out.println(s.maxProfit(arr));

        }
}