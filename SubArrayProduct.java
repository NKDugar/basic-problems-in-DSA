package com.company;

import java.util.HashMap;

public class SubArrayProduct {

    public static void main(String[] args) {

//        ** method 1 **


//        int [][] array ={{1,2},{2,1},{1,3},{3,1},{1,5}};
//        System.out.println(" the symmetric pairs are ");
//        for (int i=0;i< 5;i++){
//
//            for (int j=i+1;j<5;j++){
////arr[j][0] == arr[i][1] && arr[j][1] == arr[i][0]
//
//                if (array[j][0]==array[i][1] &&  array[j][1]==array[i][0]){
//
//                    System.out.print( "("+array[i][1]+","+array[i][0]+")" );
//
//                }
//
//            }
//
//        }


//        ** method 2 **

        HashMap <Integer  , Integer> mp=new HashMap <Integer  , Integer>();
        int [][] arr ={{1,2},{2,1},{1,3},{3,1},{1,5}};
        for (int i=0;i<arr.length;i++){
            int first=arr[i][0];
            int second=arr[i][1];

            if (mp.get(second)!=null && mp.get(second)==first) {
                System.out.println(first+","+second);
            }
            else{
                mp.put(first ,second);
            }
        }




    }

}
