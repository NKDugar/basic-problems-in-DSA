package com.company;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

// not a proper solution  ** - - ** - - **

public class FrequencyHashMapSorting {

    public static List<Integer> SortBasedOnFrequency(List<Integer> list){
        HashMap <Integer,Integer> hm=new HashMap<>();
        int n =list.size();

        for (int i=0;i<n;i++) {
            hm.put(list.get(i),hm.getOrDefault(list.get(i),0)+1);

        }

        Collections.sort(list,(k1, k2)->{
            int freq1=hm.get(k1);
            int freq2=hm.get(k2);

            if(freq1!=freq2){
                return freq2-freq1;

            }
            return list.get(k1)-list.get(k2);

        });
        return list;
    }


    public static void main(String[] args) {
        Integer[] arr = {1,2,3,2,2,3,3,3,5,6,4,5,2};
        List<Integer> list= Arrays.asList(arr);
        FrequencyHashMapSorting n=new FrequencyHashMapSorting();
        System.out.println(n.SortBasedOnFrequency(list));
    }
}