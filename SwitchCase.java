package com.company;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);


        int num=100;
        int size= 2;
        switch ( size){
            case 1:
                System.out.println(num + "can be fitted in:");
                System.out.println("* byte");
                System.out.println("* short");
                System.out.println("* int");
                System.out.println("* long");
            case 2:
                System.out.println(num + "can be fitted in:");
                System.out.println("* short");
                System.out.println("* int");
                System.out.println("* long");
            case 4:
                System.out.println(num + "can be fitted in:");
                System.out.println("* int");
                System.out.println("* long");

            case 8:
                System.out.println(num + "can be fitted in:");
                System.out.println("* long");
            default:
                System.out.println(num + "can't be fitted anywhere.");
        }
    }
}