package com.company;

public class PassByValue {
    int update(int a ){
        a-=5;
        return a;

    }

    public static void main(String[] args) {
        int a=15;
        PassByValue PBV=new PassByValue();
        PBV.update(a);
        System.out.println(a);
    }
}
