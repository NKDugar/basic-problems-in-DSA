package com.company;

import java.util.HashMap;
import java.util.Map;

public class FrequencyHashMap {


    public static void main(String[] args) {
        int [] arr={1,2,3,1,2,1,3,3};
        HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();

        for (int i=0;i<arr.length;i++){
            if (hm.containsKey(arr[i])){
                hm.put(arr[i],hm.get(arr[i])+1);

            }
            else {
                hm.put(arr[i],1);
            }
        }
        for (Map.Entry entry: hm.entrySet()){
//            System.out.println("element | frequency ");
            System.out.println(entry.getKey()+" "+entry.getValue());
        }

//        METHOD @ 2

//ArrayList<Integer> list = new ArrayList<>();
//        Map<Integer,Integer> map = new TreeMap<>();
//
//        for(int i:arr){
//            map.put(i,map.getOrDefault(i,0)+1);
//        }
//
//        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
//            if(entry.getValue()>1) {
//                list.add(entry.getKey());
//            }
//        }
//        if(list.isEmpty()) list.add(-1);
//        return list;

    }
}