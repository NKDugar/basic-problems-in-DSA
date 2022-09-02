package com.company;

import org.w3c.dom.ls.LSOutput;

import java.util.*;
import java.util.List;

public class RemoveDupInUnsortedArray {

    public static void main(String[] args) {

//        Integer[] arr={1,2,3,12,2,3,5,5,6,4,484,2,4};
//        Integer[] arr = { 4, 3, 9, 2, 4, 1, 10, 89, 34 };
        Integer arr[] = { 4, 3, 9, 2, 4, 1, 10, 89, 34 };
        ArrayList<Integer> num=new ArrayList<Integer>();


        Collections.addAll(num, arr);
        System.out.println(num);

        for (int i=0;i<num.size();i++){

// Integer[] arr={1,2,3,12,2,3,5,5,6,4,484,2,4};

            for (int j=i+1;j<num.size();j++){
                if(num.get(i) == num.get(j)){
                    num.remove(j);
                }
            }

        }
        System.out.println(num);
        System.out.println("printing array");

        for (int i=0;i<num.size();i++){
            arr[i]=num.get(i);
        }
        for (int i=0;i<num.size();i++){
            System.out.print(arr[i]+" ");
        }

    }


}
