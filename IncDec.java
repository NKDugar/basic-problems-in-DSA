package com.company;

import java.util.Arrays;

public class IncDec {


    public static void main(String[] args) {
        int a[]= {1,2,3,4,5,6,7,8} ;

//       tke 2 arrays , split them lenghtwise ;
//        even
        int b []=new int [a.length/2];
        int c []=new int [(a.length/2)+1];




        for(int i=0;i<a.length/2;i++){

                b[i]=a[i];

            }
        for (int i=a.length/2;i<a.length;i++){
            c[i-a.length/2]=a[i];
        }


        Arrays.sort(b);
        Arrays.sort(c);

        for (int i=0;i<b.length;i++){
            System.out.println(b[i]);
        }
        for (int i=c.length-1;i>=0;i--){
            System.out.println(c[i]);
        }

        }

    }


