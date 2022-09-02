package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class ListBasics {

    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
//
//        list.add(5);
//        list.add(4);
//        list.add(3);
//        list.add(2);
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
//        System.out.println(list);
        for (int i=0;i<n;i++){
            list.add(i, (sc.nextInt()));


        }
        list.remove(Integer.valueOf(2));
        System.out.println(list);
    }


}
