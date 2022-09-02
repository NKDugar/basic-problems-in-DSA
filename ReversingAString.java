package com.company;

import java.util.Scanner;

public class ReversingAString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int length=str.length();
        char[] strArray = str.toCharArray();
        char [] newStr = new char[str.length()];

        for(int i=0;i<str.length();i++){
        newStr[i] = strArray[str.length()-i-1];
        }
        System.out.println(newStr);
    }

}
