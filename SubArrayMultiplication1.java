package com.company;

public class SubArrayMultiplication1 {

     int Max(int []arr )
     {
         System.out.println("the maximum product in a subarray is : ");

            int result=Integer.MIN_VALUE;
            for (int i=0;i<arr.length;i++){
            int prod=1;
            for (int j=i;j<arr.length;j++)
            {
                prod*=arr[j];
                result=Math.max(result,prod);
            }
            }
         return result;
    }

    public static void main(String[] args) {
        int [] num={2,3,0,4,-1,0};
        SubArrayMultiplication1 sam=new SubArrayMultiplication1();
        System.out.println(sam.Max(num));


    }
}
