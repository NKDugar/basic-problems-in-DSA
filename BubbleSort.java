package com.company;

public class BubbleSort {
    public static void main(String[] args) {
        int []arr = new int[]{8, 95, 6, 4, 22, 3};
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
            System.out.println(arr[i]);
        }
    }
}
