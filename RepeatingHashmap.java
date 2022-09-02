package com.company;

import java.util.HashMap;
import java.util.Map;

public class RepeatingHashmap {

    int Relements(int[] arr){

        HashMap<Integer,Integer>hm = new HashMap<>();

        for (int i=0;i<arr.length;i++){
            if(hm.containsKey(arr[i])){
                hm.put(arr[i],hm.get(arr[i])+1);
            }
            else{
                hm.put(arr[i],1);
            }
        }
        for (Map.Entry<Integer,Integer>  entry : hm.entrySet()){
            if (entry.getValue()>1)
            {
                System.out.println(entry.getKey());
            }
    }
        return  -1;
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,2,5,4,5,1,3,156,156};
        RepeatingHashmap rh=new RepeatingHashmap();
        rh.Relements(arr);
    }
}