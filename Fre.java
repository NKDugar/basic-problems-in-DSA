package com.company;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Fre {

    static void Freq(int[] arr) {
        boolean [] visited = new boolean[arr.length];
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {

 if (visited[i]==true){
                continue;
            }


            int count=1;
            for (int j=i+1;j<arr.length;j++){
                if (arr[i]==arr[j]){
                    visited[j]=true;
                    count++;
                }
            }


            System.out.println(arr[i]+" "+count);


        }
    }
    public static void main(String[] args) {
        int [] arr={1,1,2,3,5,4,1,2,4};
        Fre f=new Fre();
        f.Freq(arr);
    }



}
