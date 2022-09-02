package com.company;
import java.util.Scanner;
public class Hackkerank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i;
        for(i=1;i<=n;i++);
        {
            String s=sc.nextLine();
            System.out.println(i+" "+s);
            i++;
        }
        sc.close();
    }

}
