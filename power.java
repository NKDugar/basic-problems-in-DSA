package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

import static java.lang.Math.*;

public class power {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        double ans;

        for (int i=0;i<=30;i++) {
            ans = pow(2, i);

           if (ans == n) {
                System.out.println("true");
                break;
            }
           else {
                System.out.println("False");
            }
        }

    }



}
