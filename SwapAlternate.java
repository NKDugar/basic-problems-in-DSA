package com.company;
import java.util.Collections;



public class SwapAlternate {
            static void swapNum(int arr[], int size){

                int temp[] = new int[arr.length];

                for (int i=0;i<size;i+=2){

                    if(i+1<size)
                    {
                    temp[i]=arr[i+1];
                    arr[i+1]=arr[i];
                    arr[i]=temp[i];
                    }
                }

            }

    public static void main(String[] args) {
        int num[] = {1,2,3,4,5,6};
        swapNum(num,6);


        for (int i=0;i<6;i++){
            System.out.print(num[i]);
        }

            }
}
