package Week04;

import java.util.Arrays;

public class prb17 {
    public static void main(String[] args) {
        prb17 prb17 = new prb17();
        prb17.rotate(new int[][]{{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}});
    }


    public void rotate(int[][] matrix) {

        for(int i =0;i<matrix.length;i++)
        {
            for(int j =i;j<matrix[0].length;j++)
            {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }


        for(int i =0;i<matrix.length;i++)
        {
            for(int j =0;j<matrix[0].length;j++)
            {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

        for(int i =0;i<matrix.length;i++)
        {
            int k =0;
            for(int j = matrix.length-1;j>=matrix.length/2;j--)
            {
                int temp = matrix[i][k];
                matrix[i][k]= matrix[i][j];
                matrix[i][j]= temp;
                k++;
            }
        }
        System.out.println();
        for(int i =0;i<matrix.length;i++)
        {
            for(int j =0;j<matrix[0].length;j++)
            {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }





    }




}
