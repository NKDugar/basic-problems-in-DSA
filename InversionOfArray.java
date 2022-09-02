package com.company;

public class InversionOfArray {
        public static long getInversions(long arr[], int n) {
            // Write your code here.

            long count=0;
            for(int i=0;i<arr.length-1;i++){
                for(int j=i+1;j<arr.length;j++){
                    if(arr[j]<arr[i]){
                        count++;
                    }
                }
            }
            return count;
        }

    public static void main(String[] args) {
        long[] arr=new long[]{3,2,1};
        System.out.println(getInversions(arr,arr.length));
    }
    }

