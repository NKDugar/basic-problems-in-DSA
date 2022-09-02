package com.company;

public class Frequency {
    public static void main(String[] args) {

        int [] arr ={1,2,3,1,2,1,2};
        int [] visitedArray = new int [arr.length];
        int visited=-1;
        for (int i=0;i<arr.length;i++){
            int count =1;
            for (int j=i+1;j<arr.length;j++){

                if (arr[i]==arr[j]){
                    count++;
                    visitedArray[j]=visited;
                }
            }
            if (visitedArray[i]!=visited){
                visitedArray[i]=count;

            }
        }
//        Arrays.sort(visitedArray);
//        for (int i=0;i<arr.length;i++){
//            System.out.println(visitedArray[i]);
//        }

        for (int i=0;i<visitedArray.length;i++){

            if(visitedArray[i]!=visited){
                System.out.println("Frequency of "+arr[i]+":"+visitedArray[i]);
            }
        }

    }

}
