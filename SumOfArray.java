package com.company;

public class SumOfArray {

    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        int k=2;
       int temp[]=new int[a.length];
        for (int i=0;i<a.length;i++){
            temp[(i+k)%a.length]=a[i];

        }
    int i=0;
        while(i<a.length){
        a[i]=temp[i];

            System.out.println(a[i]);
            i++;
        }


    }

}
