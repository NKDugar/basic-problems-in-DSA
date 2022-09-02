package com.company.dsa;


import java.util.Scanner;

public class Array {

    static  int  GetMax(int arr[], int size){

        int max= Integer.MIN_VALUE;

        for(int i=0;i<size;i++)
        {
            if(arr[i]>max)
                max=arr[i];

        }
        System.out.println("the maximum is : " +max);
        return max;
    }

    static int GetMin(int arr[],int size){
        int min= Integer.MAX_VALUE;
        for(int i=0;i<size;i++){
            if(arr[i]<min){
                min=arr[i];

            }

        }
        System.out.println("the min value is : "+min);
        return min;

    }


    public static void main(String[] args) {
        int num []=new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the 5 numbers ");
        int i=0;
        for( i=0;i<5;i++){

            num[i] = sc.nextInt();

        }
        for (int j=0;j<5;j++){
            System.out.println(num[j]);
        }

        GetMax(num,5);
        GetMin(num,5);


    }
}

