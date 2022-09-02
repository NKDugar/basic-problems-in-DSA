package com.company;

import java.util.Scanner;

public class Hackerrank {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();


        for(int i=0;i<t;i++){
            long num=sc.nextLong();
            System.out.println(num+"can be fitted in: ");
            try{

                if(num>=-128 && num<=128){
                    System.out.println("* Byte ");
                }
                if(num>=-Math.pow(2,15) && num<=Math.pow(2,15)-1){
                    System.out.println("* Short ");
                }
                if(num>=-Math.pow(2,31) && num<=Math.pow(2,31)-1){
                    System.out.println("* Int ");
                }
                if(num>=-Math.pow(2,63) && num<=Math.pow(2,63)-1){
                    System.out.println("* Long ");
                }

            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted in anywhere. ");

            }

        }
    }
}
