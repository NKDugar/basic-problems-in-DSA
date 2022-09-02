package com.company;

import java.sql.SQLOutput;
import java.util.Arrays;

import java.util.Scanner;

public class infitq {

    public  static String Solu(int numerator, int denominator) {
        {
            // code here
            StringBuilder ans=new StringBuilder();

            int quo = numerator / denominator ;
            int rem = numerator % denominator ;

            ans.append(quo);
            if(rem==0){
                return ans.toString() ;

            }
            else{
                while(rem!=0)
                {

                    rem=rem*10;
                    quo=rem/denominator;
                    rem=rem%denominator;
                    ans.append("."+quo);
                }
            }
            return ans.toString();

        }
    }


    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int numerator =sc.nextInt();
        int denominator =sc.nextInt();
        System.out.println(Solu(numerator,denominator));
    }

}
