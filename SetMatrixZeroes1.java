package com.company;

public class SetMatrixZeroes1 {

    void SMZ(int matrix[][]){

    int row= matrix.length;
    int col = matrix[0].length;

    int col0 = 1 ;

    for (int i =0;i<row;i++){

        if (matrix[i][0]==0){
            col0 = 0;
        }

        for (int j=0;i<col;j++){

            if (matrix[i][j]==0){
                matrix[i][0]=matrix[0][j]=0;
            }
        }
    }
        for (int i=row-1;i>0;i--){
            for (int j=col-1;j>0;j--){
                if (matrix[i][0]==0 || matrix[0][j]==0){
                    matrix[i][j]=0;
                    if (col0==0){
                        matrix[i][0]=0;
                    }
                }
            }
        }

    }


    public static void main(String[] args) {
        int [][]matrix=new int[3][4];

    }
}
