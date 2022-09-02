package com.company;

public class nextPermutation {
    public void nextPermutation1(int[] nums) {
        if (nums == null || nums.length <= 1) return; // base case

        int i = nums.length - 2; // second last index
        while (i >= 0 && nums[i] >= nums[i + 1]) i--; // find break point

        if (i >= 0) { // iff we found break point
            int j = nums.length - 1;
            while (nums[j] <= nums[i]) j--; // find smallest integer greater than break-point integer
            swap(nums, i, j); // swap the integers
        }
        reverse(nums, i + 1, nums.length - 1); // reverse array apart from prefix

    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private void reverse(int arr[], int left, int right) {
        while (left < right) {
            swap(arr, left++, right--);
        }
    }

    //    public void nextPermutation1(int []arr){
////        base case
//        if(arr==null || arr.length<=1){
//            return;
//        }
//        int i=arr.length-2;
//        if(i>=0 && arr[i]>=arr[i+1]){
//                i--;
//        }
//    if(i>=0){
//        int j=arr.length-1;
//        while(arr[i]<=arr[j]){
//                j--;
//        }
//        swap(arr,i,j);
//        }
//    reverse(arr,i+1,arr.length-1);
//    }
//    public void swap(int[] arr,int i,int j){
//        int temp=arr[i];
//        arr[i]=arr[j];
//        arr[j]=temp;
//    }
//    public void reverse(int[] arr,int left,int right){
//        while(left<right){
//            swap(arr,left++,right--);
//        }
//    }
    public void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }


        public static void main (String[]args){
            int[] arr = {1,2,3};
            nextPermutation p = new nextPermutation();
            p.nextPermutation1(arr);
            p.print(arr);
        }
    }

