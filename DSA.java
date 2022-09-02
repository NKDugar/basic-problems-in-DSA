// Reversing the number

package com.company;
import java.util.*;

public class DSA {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ans=0;
        while(n!=0)
        {
            int digit=n%10;
            ans = (ans*10)+digit;

            n=n/10;
        }
        if(ans>Integer.MAX_VALUE || ans<Integer.MIN_VALUE)
        {

            System.out.println("0");

        }
        System.out.println(ans);

    }

}
