package Week04;

import java.lang.reflect.Array;
import java.util.Arrays;

public class prb9 {

    public static void main(String[] args) {
        int[][] arr = new int[][]{{0,0,0,0,0,1,0,0},{0,0,0,0,1,0,0,1},{0,0,0,0,1,0,0,0},{1,0,0,0,1,0,0,0},{0,0,1,1,0,0,0,0}};

        prb9 prb9= new prb9();
        int i = prb9.numSpecial(arr);

        System.out.println(i);
    }

    public int numSpecial(int[][] mat) {


        int[] arr_row = new int[mat.length];
        int[] arr_col = new int[mat[0].length];
        int k =0;
        for(int i =0;i<mat.length;i++)
        {
            int sum = 0;
            for(int j =0;j<mat[0].length;j++)
            {
                sum += mat[i][j];

            }
            arr_row[i] = sum;
        }


        for(int i =0;i<mat[0].length;i++)
        {
            int sum = 0;
            for(int j =0;j<mat.length;j++)
            {
                sum += mat[j][i];

            }
            arr_col[i] = sum;
        }


        int count = 0;
        for(int i =0;i<mat.length;i++)
        {


            for(int j =0;j<mat[0].length;j++)
            {
                if(mat[i][j]==1 && arr_row[i]==1 && arr_col[j]==1)
                {
                    count++;
                }
            }
        }


//        System.out.println(count);

//        Arrays.stream(arr_row).forEach(System.out::print );
//        System.out.println();
//        Arrays.stream(arr_col).forEach(System.out::print);


        return count;
    }

}
