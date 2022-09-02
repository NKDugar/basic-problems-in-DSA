package com.company;

public class ElementsInArray {

    void InsertBeginning(int[] arr,int num){
        int n =arr.length + 1 ;

        for (int i=n-1;i>1;i--)
        {
            arr[i+1]=arr[i];

        }
        arr[0]=num;

        int i=0;
        while( i<n+1){
            System.out.println(arr[i]);
            i++;
        }

    }

    public static void main(String[] args) {
        int [] number = {1,2,3,4};
        ElementsInArray e=new ElementsInArray();
        e.InsertBeginning(number,5);

    }

}
