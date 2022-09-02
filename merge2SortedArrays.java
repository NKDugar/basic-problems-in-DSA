package com.company;

public class merge2SortedArrays {

        public void merge(int[] nums1, int m, int[] nums2, int n) {

            int [] ans=new int[m+n];

            int i=0,j=0;
            int k=0;

            while(i<m && j<n){
                if(nums1[i]<nums2[j]){
                    ans[k]=nums1[i];
                    i++;
                    k++;
                }
//                if(nums1[i]==0 ||nums2[j]==0){
//                    break;
//                }
                else{
                    ans[k]=nums2[j];
                    j++;
                    k++;
                }
            }
            while(i<m){
//                if(nums1[i]==0 ){
//                    break;
//                }
                ans[k]=nums1[i];
                k++;
                i++;

            }
            while(j<n){
//                if(nums2[j]==0 ){
//                    break;
//                }
                ans[k]=nums2[j];
                k++;
                j++;

            }
            for(int l=0;l<m+n;l++){
                System.out.print(ans[l]);
            }


        }

    public static void main(String[] args) {
        int n = 4;  int arr1[] = {1, 3, 5 ,7};
        int m = 5;  int arr2[] = {0 ,2 ,6 ,8 ,9};

        merge2SortedArrays mm=new merge2SortedArrays();
        mm.merge(arr1,n,arr2,m);



        }

}
