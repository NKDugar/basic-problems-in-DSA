package com.company;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetMatrixZeroes {

//    making the nearby elements or row and column to zero if we come across zero .

    void SetZero(int[][] matrix) {

        int rowLength = matrix.length;
        int colLength = matrix[0].length;


        Set<Integer> row = new HashSet<Integer>();
        Set<Integer> col = new HashSet<Integer>();

        for (int i = 0; i < rowLength; i++) {

            for (int j = 0; j < colLength; j++) {
                if (matrix[i][j] == 0) {
                    row.add(i);
                    col.add(j);
                }
            }
        }

        for (int i = 0; i < rowLength; i++) {

            for (int j = 0; j < colLength; j++) {

                if (row.contains(i) || col.contains(j)) {
                    matrix[i][j] = 0;
                }

                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
            }
    }

//    *********** JAVA SOLUTION ********

//        int rowLength = matrix.length;
//        int colLength = matrix[0].length;
//        System.out.println(rowLength + " " + colLength);
//
//        int DArr1[] =new int [rowLength];
//        int DArr2[] =new int [colLength];
//
//        Arrays.fill(DArr1,-1);
//        Arrays.fill(DArr2,-1);
//
//        for (int i=0;i<rowLength;i++){
//            for (int j=0;j<colLength;j++){
//                if (matrix[i][j]==0){
//                    DArr1[i]=0;
//                    DArr2[j]=0;
//                }
//            }
//        }
//        for (int i=0;i<rowLength;i++){
//            for (int j=0;j<colLength;j++){
//                if (DArr1[i] ==0 || DArr2[j]==0) {
//                    matrix[i][j]=0;
//                }
//                System.out.print(matrix[i][j]+" ");
//            }
//            System.out.println();
//                }


//    ************* JAVA SOLUTION 3 **********

//            int col0 = 1, rows = matrix.length, cols = matrix[0].length;
//
//            for (int i = 0; i < rows; i++) {
//                if (matrix[i][0] == 0) col0 = 0;
//                for (int j = 1; j < cols; j++)
//                    if (matrix[i][j] == 0)
//                        matrix[i][0] = matrix[0][j] = 0;
//            }
//
//            for (int i = rows - 1; i >= 0; i--) {
//                for (int j = cols - 1; j >= 1; j--)
//                    if (matrix[i][0] == 0 || matrix[0][j] == 0)
//                        matrix[i][j] = 0;
//                if (col0 == 0) matrix[i][0] = 0;
//            }



    public static void main(String[] args) {

        int matrix[][] = {{0, 1, 2, 0}, {3, 4, 5, 2}, {1, 3, 1, 5}};
        SetMatrixZeroes sz = new SetMatrixZeroes();
        sz.SetZero(matrix);
//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < matrix[0].length; j++) {
//                System.out.print(matrix[i][j] + " ");
//            }
//            System.out.println();
//        }
    }

}
