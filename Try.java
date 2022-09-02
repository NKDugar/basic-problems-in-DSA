package com.company;

public class Try {
    public static int swapDigitPairs(int number) {
        int result = 0;
        int place = 1;
        String str=Integer.toString(number);
        int l=str.length();
        while (number > 9) {
            result += place * 10 * (number % 10);
            number /= 10;

            result += place * (number % 10);
            number /= 10;
            place *= 100;
        }
        return result + place * number;
    }

    public static void main(String[] args) {
        int n=12345;
        Try t=new Try();
        System.out.println(t.swapDigitPairs(n));
    }

}
