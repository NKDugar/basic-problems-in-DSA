package com.company;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class SymmetricpairInArray {
    public static void main(String[] args) {

//        int n = 5;
        int arr[][] = {{1, 2}, {2, 1}, {3, 4}, {4, 5}, {5, 4}};

        for (int i=0;i<arr.length;i++){

            for (int j=0;j<arr.length;j++){

                if(arr[j][0]==arr[i][1] && arr[i][0]==arr[j][1]){
                    System.out.println("the pair is "+"( "+ arr[i][1]+ " , "+ arr[i][0] +" )" );
                    break;
                }

            }
        }



    }

}
