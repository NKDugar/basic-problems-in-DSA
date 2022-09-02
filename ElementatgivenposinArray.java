package com.company;
import java.util.*;
import java.util.ArrayList;

public class ElementatgivenposinArray {

void  Element(Integer[] arr , int pos , int num) {
    ArrayList<Integer> list = new ArrayList<>(Arrays.asList(arr));
    list.add(pos, num);
    arr = list.toArray(arr);
    for (int i=0;i<arr.length;i++){
        System.out.println(arr[i]);

    }
}

 public static void main(String[] args) {
    Integer[] number = {1,2,3,4,5};
     ElementatgivenposinArray e=new ElementatgivenposinArray();
     e.Element(number,2,45);

    }
}
