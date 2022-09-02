package com.company;

import java.util.Scanner;

public class dsa1
{

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        System.out.println("the entered number is "+n);
        for(int  i=2;i<=n-1;i++)
        {
            if(n%i==0)
            {
                System.out.println("it is not a prime number ");

            }

            else{
                System.out.println("it is a prime number");
            }

            break;
        }




    }

}
