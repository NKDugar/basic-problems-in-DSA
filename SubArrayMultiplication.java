package com.company;

public class SubArrayMultiplication {
//    public static void main(String[] args) {
//        int [] arr={1,2,3,4,-1};
//int result = Integer.MIN_VALUE;
//        for (int i=0;i<arr.length;i++){
//            int prod=1;
//
//            for (int j=i;j<arr.length;j++){
//
//                prod*= arr[j];
//                System.out.println(prod);
//                result=Math.max(result,prod);
//                }
//
//
//            }
//        System.out.println(" ");
//        System.out.println(result);
//        }

    static int maxProductSubArray(int arr[]) {
        int result = Integer.MIN_VALUE;
        for(int i=0;i<arr.length-1;i++)
            for(int j=i+1;j<arr.length;j++) {
                int prod = 1;
                for(int k=i;k<=j;k++)
                    prod *= arr[k];
                result = Math.max(result,prod);
            }

        return result;
    }
    public static void main(String[] args) {
        int nums[] = {0,5,6,0,7,8,0};
        int answer = maxProductSubArray(nums);
        System.out.print("The maximum product subarray is: "+answer);
    }

    }