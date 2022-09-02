package com.company;
import javax.swing.*;
import java.util.*;
import java.util.HashMap;

public class Subset {

//    static boolean Subset1(int[] a, int[] b) {
//        int n = a.length;
//        int m = b.length;
////        boolean present=false;
//
//        for (int i = 0; i < n; i++) {
//            boolean present = false;
//            for (int j = 0; j < m; j++) {
//                if (b[j] == a[i]) {
//                    present = true;
//                    break;
//                }
//
//            }
//            if (present == false)
//                return false;
//        }
//        return true;
//    }
//
//    public static void main(String[] args) {
//        int [] arr={4,6,8,20,15};
//        int [] brr={5,62,3,78,9,5,20,15,4,8,6};
//
//        boolean ans=Subset1(arr,brr);
//        if (ans==true){
//            System.out.println("arr is subset");
//
//        }
//        else
//            System.out.println("not  a subset");
//
//    }

    public static void main(String[] args) {
        HashMap<Integer, Boolean> hm = new HashMap<Integer, Boolean>();
        int[] arr = {4, 6, 8, 20, 15, 456};
        int[] brr = {5, 62, 3, 78, 9, 5, 20, 15, 4, 8, 6};

        for (int i = 0; i < brr.length; i++) {
            hm.put(brr[i], true);
        }

        for (int j = 0; j < arr.length; j++) {
            if (!hm.containsKey(arr[j])) {

            }
            else
            {
                System.out.println("yes");
            }
        }
    }
}

