package com.company;

import java.util.Arrays;

public class setMatrixZero {

    public void setMatrixZeros(int [][] matrix){
        int row=matrix.length;
        int col=matrix[0].length;

        int [] dummy1=new int[row];
        int [] dummy2=new int[col];

        Arrays.fill(dummy1,-1);
        Arrays.fill(dummy2,-1);

        for(int i=0;i<row;i++){

            for(int j=0;j<col;j++){

                if(matrix[i][j]==0){
                    dummy2[j]=0;
                    dummy1[i]=0;

                }
            }
        }
        for(int k=0;k<row;k++){
            for(int l=0;l<col;l++){
                if(dummy1[k]==0 || dummy2[l]==0) {
                    matrix[k][l] = 0;
                }
                System.out.print(matrix[k][l]);
            }
            System.out.println();
        }

    }


    public static void main(String[] args) {
        int [][]matrix={{1,1,1},{1,0,1},{1,1,1}};
        setMatrixZero m=new setMatrixZero();
        m.setMatrixZeros(matrix);
    }
}
