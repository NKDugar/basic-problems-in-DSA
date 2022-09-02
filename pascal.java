package com.company;

import java.util.ArrayList;
import java.util.List;

public class pascal {

   void pascals(int number){
       List<Integer> temp=new ArrayList<Integer>();
        for(int i=0;i<number;i++){

            List<Integer> rowi=new ArrayList<Integer>();

            for(int j=0;j<=i;j++){
                if(j==0 || j==i){
                    rowi.add(1);
                }
                else{
                    rowi.add(temp.get(j)+temp.get(j-1));
                }

            }
            temp=rowi;
            System.out.println(rowi);
        }
    }

    public static void main(String[] args) {

    pascal p=new pascal();
    p.pascals(3);

    }
}
