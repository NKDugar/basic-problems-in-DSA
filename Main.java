package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();

        int i=1;
        while(i<=n){

            // print triangle
            int j=1;
            int value=1;

            while(j<=n-i+1)
            {

                System.out.print(value);
                value=value+1;
                j++;

            }
            while(j<=n-j+1){
                System.out.println();
            }



            System.out.println();
            i++;








        }
    }
}
