package com.company;

public class FindElement {

//    finding elemnet which i present only one in whole array
//    condtion all elemnts should be present 2 times only ,odd size
public static void main(String[] args) {

    int[] num={1,2,3,2,5,1};
    int ans=0;
    for (int i=0;i<num.length;i++){
        ans=ans^num[i];
    }
    System.out.println(ans);
}


}
