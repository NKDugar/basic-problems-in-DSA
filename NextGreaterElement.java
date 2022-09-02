package com.company;
import java.util.*;

public  class NextGreaterElement {
        public static long[] nextLargerElement(long[] arr, int n){
            List<Long> list = new ArrayList<>();
            Stack<Long> s = new Stack<>();
            long[] ans = new long[n];

            for(int i=n-1; i>=0; i--){
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
            while(!list.isEmpty()){
                ans[i] = list.get(list.size()-1);
                list.remove(list.size()-1);
                i++;
            }
            return ans;
        }

    public static void main(String[] args) {
        int n=5;
        long[] arr= {1,2,5,4,1,2};
        long [] arr2 = nextLargerElement(arr,n);
        for(int i=0;i<arr2.length;i++){
            System.out.print(arr2[i]+" ");
        }



    }
    }


