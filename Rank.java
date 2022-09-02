package com.company;

import java.util.Arrays;
//not a proper code

public class Rank {
    public static void main(String[] args) {
        int[] num={5,4,2,9,865,0};

        int temp[]=num;
        Arrays.sort(temp);
//        for (int i=0;i<num.length;i++){
//            System.out.println(temp[i]);
//        }


        for (int i=0;i<num.length;i++){
                for (int j=0;j<num.length;j++)
                {
                    if (num[j]==temp[i])
                    {
                        System.out.println(i);
                        break;
                    }
                }
        }
    }
}
