package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PreviousGreaterElement {
    public static long[] nextLargerElement(long[] arr, int n){
        List<Long> list = new ArrayList<>();
        Stack<Long> s = new Stack<>();
        long[] ans = new long[n];

        for(int i=0; i<arr.length; i++){
            if(s.isEmpty()) list.add((long)-1);
            else if(s.peek() > arr[i]) list.add(s.peek());
            else if(s.peek() <= arr[i]){
                while(!s.isEmpty() && s.peek() <= arr[i]) s.pop();
                if(s.isEmpty()) list.add((long)-1);
                else list.add(s.peek());
            }
            s.push(arr[i]);
        }

        int i = 0;
        while(i<list.size()){
            ans[i] = list.get(i);
            i++;
        }
        return ans;
    }

    public static void main(String[] args) {
        int n=6;
        long[] arr= {1,2,5,4,1,2};
        long [] arr2 = nextLargerElement(arr,n);
        for(int i=0;i<arr2.length;i++){
            System.out.print(arr2[i]+" ");
        }
    }

//    public static int[] PreviousGretaerElement(int[]arr ,int  n){
//
//        Stack<Integer> s =new Stack<Integer>();
//        ArrayList<Integer> list=new ArrayList<Integer>();
//
//        for(int i=0;i<arr.length;i++){
//            if(s.isEmpty()){
//                list.add(-1);
//            }
//            else if (s.peek()>arr[i]){
//                list.add(s.peek());
//            }
//            else if ( s.peek()<arr[i]){
//                while(!s.isEmpty() && s.peek()<arr[i]){
//                    s.pop();
//                }
//                if( s.isEmpty()){
//                    list.add(-1);
//                }
//                else{
//                    list.add(s.peek());
//                }
//            }
//            s.push(arr[i]);
//        }
//        int[] arr1 = new int[list.size()];
//        int i=0;
//        while(!list.isEmpty()) {
//            arr1[i] = list.get(i);
//            i++;
//        }
//        return arr1;
//    }
//
//    public static void main(String[] args) {
//        int n=6;
//        int [] arr={1,1,5,2,6,5};
//        int[] arr2= PreviousGretaerElement(arr,n);
//        int i=0;
//        while(i<arr2.length){
//            System.out.println(arr2[i]);
//            i++;
//        }
//    }
}
