package com.company;

public class NonRepeatingElements {
    public static void main(String[] args) {

        int[] arr={1,2,2,1,3,4,5,3,1,1,2,3,4,5,6,7,8};
        int num[] = new int[50];


        for (int i=0;i<arr.length;i++){
            boolean check=true;
        for (int j=0;j<arr.length;j++){

            if (i!=j && arr[i]==arr[j]){
                check = false ;
            }
            else{
                num[i]=arr[i];
            }
        }
            System.out.print(num[i]+ " ");
        }


    }


}
