package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

// not proper solution

public class RepeatingElementsInArray {

    public static void main(String[] args) {

        int [] num={1,2,3,4,5,6,5,4};
        int temp[] =new int[1000];

        for (int i=0;i<num.length;i++) {
            if(temp[num[i]]!=1){
                temp[num[i]]++;
            }
            else{
                temp[i]=num[i];
            }

        }

for (int j=0;j<num.length;j++){
    if(temp[num[j]]>1)
        System.out.println(j);
}

    }
}
