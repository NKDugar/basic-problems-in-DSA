package com.company;

import java.util.Scanner;

public class Factorial {
//     n,r,answer :
    int n,r,answer;
    int fact(int n){
        int answer=1;
        for (int i=1;i<=n;i++){
            answer=answer*i;

        }
        return answer;
    }

    float nCr(int n,int r){
        float answer=(float)fact(n)/(fact(n-r)*fact(r));
        return answer;
    }



    public static void main(String[] args) {
     Factorial f=new Factorial();
     Scanner sc=new Scanner(System.in);

     int n=sc.nextInt();
     int r=sc.nextInt();

        Factorial pc =new Factorial();
        System.out.println(pc.nCr(n,r));
        System.out.println(f.fact(n));
    }
}















//    int ans=1;
//
//    int power(int a, int b) {
//        for (int i = 1; i <= b; i++) {
//            ans = ans * a;
//        }
//        return ans;
//    }
//
//    public   static void  main(String[] args) {
//        Function f=new Function();
//        int answer = f.power(2,10);
//        System.out.println(answer);
//
//    }




