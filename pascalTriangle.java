package com.company;

import java.util.ArrayList;
import java.util.List;

public class pascalTriangle {

        public List<List<Integer>> generate(int numRows) {

            List<List<Integer>> list=new ArrayList<List<Integer>>();
            List<Integer>temp=null;
            for(int i=0;i<numRows;i++){
                List<Integer>row=new ArrayList<Integer>();
                for(int j=0;j<=i;j++)
                    if(j==0 || j==i){
                        row.add(1);
                    }
                    else
                        row.add(temp.get(j-1)+temp.get(j));
                temp=row;

                list.add(row);

            }
//             System.out.print(list.get(1).get(0));
            return list;
        }

    public static void main(String[] args) {
            pascalTriangle p=new pascalTriangle();
        System.out.println(p.generate(3));
    }
}
