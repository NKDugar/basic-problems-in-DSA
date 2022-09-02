package com.company;

public class NonRepeatingElementsInArray {

    public static void main(String[] args) {
        int [] num={1,2,3,3,1};
boolean check;
        for (int i=0;i<num.length;i++){
             check=false;

            for (int j=0;j<num.length;j++){

                if (num[i]!=num[j] && j!=i){
                    check=true ;

                }
            }
            if(!check){
                System.out.println(num[i]);
            }

        }

    }

}
