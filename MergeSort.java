package com.company;

public class MergeSort {

   public static void conquer(int[] arr,int start,int mid,int end){

        int[] merged=new int[end-start+1];
        int ind1=start;
        int ind2=mid+1;
        int x=0;

        while(ind1<=mid && ind2<=end){
            if(arr[ind1]<=arr[ind2]){
                merged[x]=arr[ind1];
                x++;
                ind1++;
            }
            else{
                merged[x]=arr[ind2];
                x++;
                ind2++;
            }
        }

        while(ind1<=mid){
            merged[x]=arr[ind1];
            x++;
            ind1++;
        }
        while(ind2<=end){
            merged[x]=arr[ind2];
            x++;
            ind2++;
        }
//        copying data back to original array
//        for(int j=start;j<merged.length;j++){
//            arr[j]=merged[j];
//        }

//       why copy like this instead of simple method;

       for(int i=0,j=start;i< merged.length;i++,j++){
           arr[j]=merged[i];
       }
    }
    public static void divide(int[] arr,int start,int end){

        int mid=start+(end-start)/2;
        if(start>=end){
            return ;
        }
        divide( arr, start, mid);
        divide( arr, mid+1, end);
        conquer(arr,start,mid,end);
    }


   public  static void print(int[] arr){
// how cani i solve this
       for(int nums:arr){
            System.out.println(arr[nums-1]);
        }
    }

    public static void main(String[] args) {

        int []arr=new int[] {5,9,8,7,4,2,3,6,1};
        int n=arr.length;
        divide(arr,0,n-1);
        print(arr);



    }
}
