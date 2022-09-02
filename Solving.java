package com.company;

import java.util.Scanner;

public class Solving {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N =sc.nextInt();

        int num=N*N;
        if (N==1){
            System.out.println("0");
        }
        else{
              num=N*N;
            System.out.println(num);
        }

    }
}
