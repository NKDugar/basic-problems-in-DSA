package com.company;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;


//import java.util.ArrayList; // import the ArrayList class
//
//ArrayList<String> cars = new ArrayList<String>(); // Create an ArrayList object
//


public class RemoveDuplicates {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);

        System.out.println("enter the number : ");
        int n=sc.nextInt();


        int arr[]=new int[n];

        System.out.println("enter eleemnts ");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("printing array " );
        for (int i : arr ){
            System.out.println(i);
        }


        HashSet<Integer> hset=new HashSet<>();
        for (int i =0;i<arr.length;i++){
           hset.add(arr[i]);
        }

        System.out.println(hset);
        int j=0;
        for(int i:hset){
            arr[j]=i ;
        j++;
        }

        System.out.println("loop ended ");


        int k=hset.size();
        System.out.println(k);




    }
    }



